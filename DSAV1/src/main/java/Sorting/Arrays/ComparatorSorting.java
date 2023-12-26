package Sorting.Arrays;


import java.util.Arrays;
import java.util.Comparator;

// Point class which does not implement
// Comparable interface. Thus the objects
// of this class are not comparable.
class Point1
{
    int x, y;
    Point1(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// This class implements
// Comparator interface to compare
class MyCmp implements Comparator<Point1>
{
    // Sorts the Point objects according
    // to x-coordinates in natural order
    public int compare(Point1 p1, Point1 p2)
    {
        return p1.x - p2.x;
    }
}
public class ComparatorSorting {

    public static void main(String[] args)
    {
        // Array of 3 objects
        Point1 arr[] = {new Point1(10, 20), new Point1(3, 12), new Point1(5, 7) };

        // Sorting the object containing the array
        // by passing the array and object MyCmp
        Arrays.sort(arr, new MyCmp());
        // Displaying the sorted array
        for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i].x + " " + arr[i].y);
    }
}
