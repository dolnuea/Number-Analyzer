/**
 *@author Dolunay Dagci
 *Assignment: Ch18 2 Number Analyzer
 *Due Date: Sunday, April 14, 2019
 *This is a generic class that includes generic methods for comparing array values to find the geatest and the smallest value.
 * @param <T> any value that extends Number
 */
public class DD_NumberAnalyzer<T extends Number> {

    //private field for array of type T
    private T[] array;

    /**
     * Constructor
     * @param array of type T
     */
    public DD_NumberAnalyzer(T[] array) {
        this.array = array;
    }

    /**
     * Method for displaying and finding the highest value in an array.
     * @param array Array of type T
     * @param <T> extends number and is comparable
     */
    public static <T extends Comparable<T>> void highest(T[] array) {
        System.out.print("Array List: "); for (T value : array) System.out.print(value + " "); System.out.println(); //Display array contents
        T highest = array[0]; //default highest value is array[0]
        for (int i = 1; i < array.length; ++i){ //compare values to find the highest value
            if (array[i].compareTo(highest) > 0) {
                highest = array[i];
            }
        }
        System.out.println("Highest Value: " + highest); //Display the highest value
    }

    /**
     * Method for displaying and finding the lowest value in an array.
     * @param array Array
     * @param <T>  extends number and is comparable
     */
    public static <T extends Comparable<T>> void lowest(T[] array){
        T lowest = array[0]; //Default lowest value is array[0]
        for (int i = 1; i < array.length; ++i){ //Compare values to find the lowest value
            if (array[i].compareTo(lowest) < 0) {
                lowest = array[i];
            }
        }
        System.out.println("Lowest Value: " + lowest); //Display the lowest value
    }
}
