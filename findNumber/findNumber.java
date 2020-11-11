package findNumber;
/*
  	Find the number!
   	Given an unsorted array of n elements, find if the element k is present in the array or not.
	Complete the findNumber function in the editor below. It has 2 parameters:
	An array of integers, arr, denoting the elements in the array.
	An integer, k, denoting the element to be searched in the array.
	The function must return a string “YES” or “NO” denoting if the element is present in the array or not.

 */

/**
 * 
 * @author Yan Chen
 * 
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {



	/*
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER k
     */
	
    static String findNumber(List<Integer> arr, int k) {
    	
    	if (arr.contains(k)) {
    		return "Yes";
    	}
    	
    	else {
    		return "No";
    	}
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arrTemp = new ArrayList<>();

        IntStream.range(0, arrCount).forEach(i -> {
            try {
                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> arr = arrTemp.stream()
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String res = findNumber(arr, k);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}