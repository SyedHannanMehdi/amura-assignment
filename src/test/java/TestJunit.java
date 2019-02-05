package test.java;

import java.util.ArrayList;
import java.util.List;
import main.java.AmuraAssignment;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {

  @Test
  public void test1() {
    int[] input = {2, -3, 1, 2, -4, 3};
    int startIndex = 2;
    int length = 2;
    int sum = 3;
    List<Integer> elements = new ArrayList<>();
    elements.add(1);
    elements.add(2);
    checkAssert(input, startIndex, length, sum, elements);
  }

  @Test
  public void test2() {
    int[] input = {1, 4, -8, 9, -10, -2, 3};
    int startIndex = 3;
    int length = 1;
    int sum = 9;
    List<Integer> elements = new ArrayList<>();
    elements.add(9);
    checkAssert(input, startIndex, length, sum, elements);
  }

  @Test
  public void test3() {
    int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int startIndex = 3;
    int length = 4;
    int sum = 6;
    List<Integer> elements = new ArrayList<>();
    elements.add(4);
    elements.add(-1);
    elements.add(2);
    elements.add(1);
    checkAssert(input, startIndex, length, sum, elements);
  }

  private void checkAssert(int[] input, int startIndex, int length, int sum, List<Integer> elements) {
    AmuraAssignment amuraAssignment = new AmuraAssignment();
    amuraAssignment.findLargestSum(input);
    assertEquals(startIndex , amuraAssignment.getStartIndex());
    assertEquals(length , amuraAssignment.getSubArrayLength());
    assertEquals(sum , amuraAssignment.getSum());
    assertEquals(elements , amuraAssignment.getElements());
  }
}