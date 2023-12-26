package Sorting.Collections.Sort;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Point1 implements Comparable<Point1>
{
    int x, y;
    Point1(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // compareTo() function defining the
    // nature of sorting i.e., according to
    // x-coordinate
    public int compareTo(Point1 P1)
    {
        return this.x - P1.x;
    }
}

public class SortingUsingComparable {

    public static void main(String[] args)
    {
        // Create a list of Integers
        List<Point1> list = new ArrayList<Point1>();
        list.add(new Point1(5, 10));
        list.add(new Point1(2, 20));
        list.add(new Point1(10, 30));

        // List is sorted in the natural order
        Collections.sort(list);

        // Displaying the points
        for (Point1 p: list)
            System.out.println(p.x + " " + p.y);
    }
}
