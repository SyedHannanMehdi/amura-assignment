package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AmuraAssignment {

  private int sum, startIndex, subArrayLength;

  private List<Integer> elements = new ArrayList<>();

  public void findLargestSum(int[] input) {

    int current_max = 0, endIndex = 0, s = 0;

    for (int i = 0; i < input.length; i++)
    {
      current_max += input[i];

      if (sum < current_max)
      {
        sum = current_max;
        startIndex = s;
        endIndex = i;
      }

      if (current_max < 0)
      {
        current_max = 0;
        s = i + 1;
      }
    }

    //display output
    System.out.println("\nLargest SubArray");
    setStartIndex(startIndex);
    System.out.println("Start Index: " + getStartIndex());
    setSubArrayLength(endIndex - startIndex + 1);
    System.out.println("Length: " + getSubArrayLength());
    setSum(sum);
    System.out.println("Sum: " + getSum());
    System.out.print("Elements: ");
    for (int j = startIndex; j < startIndex + (endIndex - startIndex + 1) && j < input.length; j++) {
      System.out.print(input[j] + " ");
      setElements(Integer.parseInt(String.valueOf(input[j])));
    }
  }

  public static void main(String[] args) {
    int[] input = new int[0];
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the array : ");
      input = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    //perform largest sum functionality
    AmuraAssignment amuraAssignment = new AmuraAssignment();
    amuraAssignment.findLargestSum(input);
  }

  public int getStartIndex() {
    return this.startIndex;
  }

  private void setStartIndex(int startIndex) {
    this.startIndex = startIndex;
  }

  public int getSum() {
    return sum;
  }

  private void setSum(int sum) {
    this.sum = sum;
  }

  public int getSubArrayLength() {
    return subArrayLength;
  }

  private void setSubArrayLength(int length) {
    this.subArrayLength = length;
  }

  public List<Integer> getElements() {
    return elements;
  }

  private void setElements(Integer elements) {
    this.elements.add(elements);
  }
}