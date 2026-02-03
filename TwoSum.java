package com.practies_question;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		
		 int[] nums = {2, 7, 11, 15};
	        int target = 17;

	        Solution solution = new Solution();
	        int[] result = solution.twoSum(nums, target);

	        System.out.println(Arrays.toString(result));
	}
	

}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
             
                if(nums[i]+nums[j]==target){
                   return new int[]{i,j};
                }
            }
        }
         return new int[]{};
    }
}
