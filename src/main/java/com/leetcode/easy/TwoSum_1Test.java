package com.leetcode.easy;

import static org.junit.Assert.*;
import org.junit.Test;


public class TwoSum_1Test {

    @Test
    public void twoSumOn2Test1() {
        int a[] = {3,3,1,5};
        int b[] = new TwoSum_1().twoSumOn2(a,6);
        int c[] = {2,3};
        assertArrayEquals(b,c);
    }
    @Test
    public void twoSumOn2Test2() {
        int a[] = {2,7,11,15};
        int b[] = new TwoSum_1().twoSumOn2(a,9);
        int c[] = {0,1};
        assertArrayEquals(b,c);
    }
    @Test
    public void twoSumByDifferenceTest1() {
        int a[] = {3,3,1,5};
        int b[] = new TwoSum_1().twoSumByDifference(a,6);
        int c[] = {0,1};
        assertArrayEquals(b,c);
    }
    @Test
    public void twoSumByDifferenceTest2() {
        int a[] = {2,7,11,15};
        int b[] = new TwoSum_1().twoSumByDifference(a,9);
        int c[] = {0,1};
        assertArrayEquals(b,c);
    }
    @Test
    public void twoSumByDifferenceTest3() {
        int a[] = {-1,-2,-3,-4,-5};
        int b[] = new TwoSum_1().twoSumByDifference(a,-8);
        int c[] = {0,1};
        assertArrayEquals(b,c);
    }

}
