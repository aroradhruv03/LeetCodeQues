package com.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class PlusOne_66Test {
    @Test
    public void plusOneTest1() {
        int a[] = {1,2,4};
        int b[] = new PlusOne_66().plusOne(a);
        int c[] = {1,2,5};
        assertArrayEquals(b,c);
    }
    @Test
    public void plusOneTest2() {
        int a[] = {9,9};
        int b[] = new PlusOne_66().plusOne(a);
        int c[] = {1,0,0};
        assertArrayEquals(b,c);
    }
}
