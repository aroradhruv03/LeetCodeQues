package com.leetcode.easy;

public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length;
        int[] newArr = new int[len+1];
        digits[len-1] = digits[len-1]+1;
        for(int i=len-1;i>0;i--){
            digits[i] = digits[i]+carry;
            carry=0;
            if(digits[i]>=10){
                carry = digits[i-1]/10;
                digits[i] = digits[i-1]%10;
            }
        }
        if(digits[0]>=10){

        }
        return newArr;
    }
}
