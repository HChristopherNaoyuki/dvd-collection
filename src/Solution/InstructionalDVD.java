// Package declaration
package Solution;

// InstructionalDVD class extending DVD and implementing iPrintable
public class InstructionalDVD extends DVD implements iPrintable
{
    // Additional variable for category
    private final String category;

    // Constructor
    public InstructionalDVD(String title, int yearReleased, int runningTime, String category)
    {
        super(title, yearReleased, runningTime);
        this.category = category;
    }

    // Method to set the price
    @Override
    public void setPrice(double price)
    {
        setInternalPrice(price);
    }

    // Getter for category
    public String getCategory() { return category; }

    // Implementation of ShowDetails method from iPrintable interface
    @Override
    public String ShowDetails()
    {
        return "Title: " + getTitle() + "\n" +
               "Year Released: " + getYearReleased() + "\n" +
               "Running Time: " + getRunningTime() + " mins\n" +
               "Category: " + getCategory() + "\n" +
               "Price: $" + getPrice();
    }
}
