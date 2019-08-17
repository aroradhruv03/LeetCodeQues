package com.leetcode.easy;

import java.util.HashMap;

public class TwoSum_1 {
    public int[] twoSumOn2(int[] nums, int target) {
        int[] index = {-1,-1};
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    index[0] = i;
                    index[1] = j;
                    break;
                }
            }
        }
        return index;
    }

    public int[] twoSumByDifference(int[] nums, int target) {
        int[] indexArray = {-1,-1};
        boolean found = false;
        for(int j=0;j<nums.length;j++) {
            int differenceArr = target - nums[j];
            for (int i = 0; i < nums.length; i++) {
                if (i!=j && differenceArr == nums[i]) {
                    indexArray[0] = j;
                    indexArray[1] = i;
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        return indexArray;
    }

    public int[] twoSumByHash(int[] nums, int target) {
        int[] indexArray = {-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
            map.put(nums[i],i);

        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference)!=i){
                indexArray[0] = map.get(difference);
                indexArray[1] = i;
                break;
            }
        }
        return indexArray;
    }
}
