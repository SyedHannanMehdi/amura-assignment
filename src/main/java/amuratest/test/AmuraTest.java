package amuratest.test;

class AmuraTest {

  void findLargestSum(int[] input) {

    int startIndex = 0;
    int subArrayLength = 0;
    int oldMax;

    //maximum sum of sub-array
    int sum = input[0];

    //maximum sum of sub-array at current position
    int max = input[0];

    // traverse input array
    for (int i = 1; i < input.length; i++) {

      //set maximum sum of sub-array at index i
      max = max + input[i];

      //compare maximum sum of sub-array with value at current index
      max = Integer.max(max, input[i]);

      //compare current max with max sum of sub-array
      oldMax = sum;
      sum = Integer.max(sum, max);

      //set starting index of sub-array
      if (input[i] == max && input[i] == sum)
        startIndex = i;

      //calculate max sub-array length
      if (sum > oldMax && i >= startIndex)
        subArrayLength = i - startIndex + 1;
    }

    //display output
    System.out.println("\nLargest SubArray");
    System.out.println("Start Index: " + startIndex);
    System.out.println("Length: " + subArrayLength);
    System.out.println("Sum: " + sum);
    System.out.print("Elements: ");
    for (int j = startIndex; j < startIndex + subArrayLength; j++) {
      System.out.print(input[j] + " ");
    }
  }
}
