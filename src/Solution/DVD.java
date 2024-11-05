// Package declaration
package Solution;

// Abstract class DVD
public abstract class DVD
{
    // Class variables
    private final String title;
    private final int yearReleased;
    private final int runningTime;
    private double price;

    // Constructor
    public DVD(String title, int yearReleased, int runningTime)
    {
        this.title = title;
        this.yearReleased = yearReleased;
        this.runningTime = runningTime;
    }

    // Abstract method for setting the price
    public abstract void setPrice(double price);

    // Getter methods
    public String getTitle() { return title; }
    public int getYearReleased() { return yearReleased; }
    public int getRunningTime() { return runningTime; }
    public double getPrice() { return price; }

    protected void setInternalPrice(double price) { this.price = price; }
}
