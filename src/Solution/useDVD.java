// Package declaration
package Solution;

// useDVD class for testing
public class useDVD
{
    public static void main(String[] args)
    {
        // Creating instances of InstructionalDVD
        InstructionalDVD dvd1 = new InstructionalDVD("Learn Java", 2021, 120, "Education");
        dvd1.setPrice(29.99);

        InstructionalDVD dvd2 = new InstructionalDVD("Mastering AI", 2022, 150, "Technology");
        dvd2.setPrice(39.99);

        // Displaying details of each DVD
        System.out.println(dvd1.ShowDetails());
        System.out.println();
        System.out.println(dvd2.ShowDetails());
    }
}
