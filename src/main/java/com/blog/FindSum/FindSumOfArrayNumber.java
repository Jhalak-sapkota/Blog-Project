package com.blog.FindSum;


import java.util.HashSet;
import java.util.Set;

public class FindSumOfArrayNumber {
    public static void main(String[] args) {
        int[] num = {5,2,6,8,1,9};
        int target = 12;
        findPair(num, target);
    }

    static void findPair(int[] num, int target) {
        Set<Integer> seen = new HashSet<>();
        boolean found = false;
        for (int nums: num){
            int sum = target - nums;
            if (seen.contains(sum)){
                System.out.println("Pair found: ("+ sum +"," + nums+")");
                found = true;
            }
            seen.add(nums);
        }
        if (!found) {
            System.out.println("Pair not found in this Array list");
        }
    }
}
