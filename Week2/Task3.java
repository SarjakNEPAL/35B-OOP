package Week2;

public class Task3 {
    public static void main(String[] args) {
        /* Write a program to print the area and perimeter of rectangle 
         * area = length * breadth
         * perimeter = 2 (length + breadth)
        */
    double length, breadth ,area, perimeter;
    length = 1020.55d;
    breadth= 1234.22d;
    area = length * breadth;
    perimeter = 2*(length + breadth);
    System.out.println("area = "+area);
    System.out.println("perimeter="+perimeter);
    }
}
