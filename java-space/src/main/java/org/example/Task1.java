package main.java.org.example;


//https://leetcode.com/problems/two-sum/
public class Task1 {

    public Task1(){}
    // implementation of first task
    public int[] twoSum(int[] numbs, int target){
        int index1 = 0, index2, diff;
        int[] result = new int[]{-1,-1};
        boolean found = false;

        while ((index1< numbs.length-1) && (!found)){
            diff = target - numbs[index1];
            index2 = index1;
            while ((index2< numbs.length-1) && (!found)){
                index2++;
                if (numbs[index2] == diff){
                    result = new int[]{index1, index2};
                    found = true;
                }
            }
            index1++;
        }
        return result;
    }

//    SCHNELLERE LÖSUNG
//    public int[] twoSum(int[] nums, int target) {
//        int pointer = 1;
//        while(pointer < nums.length){
//            for(int i = 0; i + pointer < nums.length;i++){
//                if(nums[i] + nums[i + pointer] == target){
//                    return new int[] {i,i + pointer};
//                }
//            }
//            pointer++;
//        }
//        return new int[] {};
//    }

}
