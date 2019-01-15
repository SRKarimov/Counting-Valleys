package com.rkskalliance;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        Integer res = 0;
        Integer acc = 0;
        Integer accPrev = 0;
        for (Integer i = 0; i < n; i++) {
            accPrev = acc;
            if (s.charAt(i) == 'U') acc += 1; else acc -= 1;
            if (acc == 0 && accPrev < 0) {

                res += 1;
            }

            System.out.println(acc + ": " + res);

        }

        System.out.println(res);
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        return res;
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)  throws IOException {
	    // write your code here
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //String s = scanner.nextLine();

        //int result = countingValleys(n, s);
        int result;
        result = countingValleys(100, "DDUUDDDUDUUDUDDDUUDDUDDDUDDDUDUUDDUUDDDUDDDUDDDUUUDUDDDUDUDUDUUDDUDUDUDUDUUUUDDUDDUUDUUDUUDUUUUUUUUU"); //2
        result = countingValleys(8, "UDDDUDUU"); //1
        result = countingValleys(12, "DDUUDDUDUUUD"); //2

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
