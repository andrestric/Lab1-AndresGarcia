//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Andres Garcia
 */

public class Main {
  public static void main(String[] args) {
    System.out.println("hello, world!");

    Lab1 lab = new Lab1();
    System.out.println(lab.increment(1));

    int[] numbers = {5, 9, 3, 12, 7, 3, 11, 5};

    
    int i = 0;
    System.out.print("Array in order: ");
    while (i < numbers.length) {
      System.out.print(numbers[i] + " ");
      i++;
    }
    System.out.println();

    
    System.out.print("Array in reverse: ");
    for (int j = numbers.length - 1; j >= 0; j--) {
      System.out.print(numbers[j] + " ");
    }
    System.out.println();

    
    System.out.println("First value: " + numbers[0]);
    System.out.println("Last value: " + numbers[numbers.length - 1]);

    
    System.out.println("Max of 8 and 4: " + lab.max(8, 4));
    System.out.println("Min of 8 and 4: " + lab.min(8, 4));
    System.out.println("Sum of array: " + lab.sum(numbers));
    System.out.println("Average of array: " + lab.average(numbers));
    System.out.println("Max in array: " + lab.max(numbers));
    System.out.println("Min in array: " + lab.min(numbers));
  }
}  