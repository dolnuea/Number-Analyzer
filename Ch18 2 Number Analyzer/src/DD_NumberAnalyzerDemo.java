/**
 * @author Dolunay Dagci
 * Assignment: Ch18 2 Number Analyzer
 * Due Date: Sunday, April 14, 2019
 * This is a Demo Class for Number Analyzer. This class demonstrates that the NumberAnalyzer works on different types of
 * arrays that are a subclasses of Number.
 */

public class DD_NumberAnalyzerDemo {
    public static void main(String[] args) {
        //Different types of arrays that are subclasses of Number
        Integer[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] numbers2 = {12.00, 11.55, 20.33, 19.2, 60.4, 70.87, 44.4, 33.2, 13.2, 13.1};
        Float[] numbers3 = {123f, 321f, 231f, 111f, 522f, 632f, 143f, 558f, 669f, 101f};
        Short[] numbers4 = {121, 13, 4, 5, 23, 45, 76, 41, 25, 12};
        Long[] numbers5 = {222L, 6L, 66L, 666L, 46L, 2L, -4L, 24L, -55L, 122L};

        //Find lowest and highest values in each array
        DD_NumberAnalyzer.highest(numbers1); DD_NumberAnalyzer.lowest(numbers1);
        System.out.println("******************");
        DD_NumberAnalyzer.highest(numbers2); DD_NumberAnalyzer.lowest(numbers2);
        System.out.println("******************");
        DD_NumberAnalyzer.highest(numbers3); DD_NumberAnalyzer.lowest(numbers3);
        System.out.println("******************");
        DD_NumberAnalyzer.highest(numbers4); DD_NumberAnalyzer.lowest(numbers4);
        System.out.println("******************");
        DD_NumberAnalyzer.highest(numbers5); DD_NumberAnalyzer.lowest(numbers5);
    }
}
