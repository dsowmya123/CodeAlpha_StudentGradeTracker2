import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students:");

        int n = sc.nextInt();
        String names[] = new String[n];

        int marks[] = new int[n];

        for(int i=0; i<n; i++)
        {
            System.out.println("Enter student name:");

            names[i] = sc.next();

            System.out.println("Enter marks:");

            marks[i] = sc.nextInt();
        }

        int total = 0;

        for(int i=0; i<n; i++)
        {
            total = total + marks[i];
        }

        double average = total / n;

        int highest = marks[0];

        for(int i=0; i<n; i++)
        {
            if(marks[i] > highest)
            {
                highest = marks[i];
            }
        }

        int lowest = marks[0];

        for(int i=0; i<n; i++)
        {
            if(marks[i] < lowest)
            {
                lowest = marks[i];
            }
        }

        System.out.println("Student Report");

        for(int i=0; i<n; i++)
        {
            System.out.println(names[i] + " = " + marks[i]);
        }

        System.out.println("Total = " + total);

        System.out.println("Average = " + average);

        System.out.println("Highest = " + highest);

        System.out.println("Lowest = " + lowest);
    }
}