package com.leetcode;

import com.leetcode.easy.TwoSum_1;

import java.util.Arrays;

public class Main {
    private static final long MEGABYTE = 1024L * 1024L;
    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }
    public static void main(String[] args) {
        printMemory();
	// write your code here
        int a[] = {-1,-2,-3,-4,-5};
        int b[] = new TwoSum_1().twoSumByDifference(a,-8);
        Arrays.stream(b).forEach(ai-> System.out.println(ai));
        printMemory();
    }

    public static void printMemory(){
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: "
                + bytesToMegabytes(memory));
    }


}
