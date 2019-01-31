package amuratest.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		//Read input
    int[] input = new int[0];
		try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Enter the array : ");
      input = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

		//perform largest sum functionality
		AmuraTest amuraTest = new AmuraTest();
    amuraTest.findLargestSum(input);
	}

}