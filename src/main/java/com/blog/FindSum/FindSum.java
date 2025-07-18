package com.blog.FindSum;


import java.util.HashSet;
import java.util.Set;

public class FindSum {
    public static void main(String[] args) {
        int[] num = {8, 7, 2, 5, 3, 1};
        int target = 10;
        findPair(num, target);
    }

    static void findPair(int[] num, int target) {
        Set<Integer> show = new HashSet<>();
        boolean found = false;
        for (int nums: num){
            int sum = target - nums;
            if (show.contains(sum)){
                System.out.println("Pair found: ("+ sum +"," + nums+")");
                found = true;
            }show.add(nums);
        }
        if (!found) {
            System.out.println("Pair not found in this Array list");
        }
    }
}
