import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;
        int[] dataPoints = new int [ARRAY_SIZE];
        Random rnd = new Random();
        int sum = 0;
        double average = 0.0;
        Scanner in = new Scanner(System.in);
        int val = 0;
        int timesFound = 0;
        int target = 0;
        boolean foundTarget = false;
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        average = (double) sum / dataPoints.length;
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);

        val = SafeInput.getRangedInt(in,"Enter an integer",1,100);
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == val)
            {
                timesFound++;
            }
        }
        System.out.println("The integer value " + val + " was found " + timesFound + " times in the random array dataPoints.");
        target = SafeInput.getRangedInt(in,"Enter an integer search target",1,100);
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == target)
            {
                foundTarget = true;
                System.out.println("The value " + target + " was found at array index " + i);
                break;
            }
        }
        if(!foundTarget)
        {
            System.out.println("The value " + target + " was not found in the array!");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(min > dataPoints[i])
            {
                min = dataPoints[i];
            }
            if(max < dataPoints[i])
            {
                max = dataPoints[i];
            }
        }
        System.out.println("The min is " + min);
        System.out.println("The max is " + max);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        // EXTRA AND GRADUATE CREDIT
        System.out.println("Minimum of dataPoints is: " + min(dataPoints));
        System.out.println("Maximum of dataPoints is: " + max(dataPoints));
        System.out.println("Number of times earlier specified integer is in dataPoints array: " + occurrenceScan(dataPoints,val));
        System.out.println("Sum of dataPoints is: " + sum(dataPoints));
        System.out.println("Earlier specified target is dataPoints array: " + contains(dataPoints,target));

    }

    /**
     * calculates the average of an integer array
     * @param values integer values array
     * @return the average as a double of the array
     */
    public static double getAverage(int values[])
    {
        int sum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return (double) sum / values.length;
    }

    /**
     * finds the min of an integer array
     * @param values integer values array
     * @return the minimum value of the array
     */
    public static int min(int values[])
    {
        int min = values[0];
        for(int i = 0; i < values.length; i++)
        {
            if(min > values[i])
            {
                min = values[i];
            }
        }
        return min;
    }

    /**
     * finds the max of an integer array
     * @param values integer values array
     * @return the maximum value of the array
     */
    public static int max(int values[])
    {
        int max = values[0];
        for(int i = 0; i < values.length; i++)
        {
            if(max < values[i])
            {
                max = values[i];
            }
        }
        return max;
    }

    /**
     * finds number of times target is in array
     * @param values integer values array
     * @param target integer value to find
     * @return integer number of times target is in array
     */
    public static int occurrenceScan(int values[], int target)
    {
        int occurrences = 0;
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] == target)
            {
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * calculates the sum of an integer array
     * @param values integer values array
     * @return the sum of the array
     */
    public static int sum (int values[])
    {
        int sum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return sum;
    }

    /**
     * finds if array contains target
     * @param values integer values array
     * @param target integer value to find
     * @return boolean true if target found or false if not
     */
    public static boolean contains (int values[], int target)
    {
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] == target)
            {
                return true;
            }
        }
        return false;
    }
}