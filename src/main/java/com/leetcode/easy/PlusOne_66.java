package com.leetcode.easy;

public class PlusOne_66 {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        int len = digits.length;

        digits[len-1] = digits[len-1]+1;
        for(int i=len-1;i>=0;i--){
            digits[i] = digits[i]+carry;
            carry=0;
            if(digits[i]>=10){
                carry = digits[i]/10;
                digits[i] = digits[i]%10;
            }
        }
        int[] newArr = null;
        if(carry>0){
            newArr = new int[len+1];
            System.arraycopy(digits,0,newArr,1,len);
            newArr[0] = carry;
            return newArr;
        }
        return digits;
    }
}