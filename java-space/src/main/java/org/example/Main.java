package main.java.org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    public static void task1(){
        Task1 task1 = new Task1();
//        int[] input = new int[]{2, 7, 11, 15};
//        int target = 9;
//        int[] input = new int[]{3,3};
//        int target = 6;
//        int[] input = new int[]{3, 2, 4};
//        int target = 6;
        int[] input = new int[]{0, 4, 3, 0};
        int target = 0;

        int[] result= task1.twoSum(input,target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static void task2(){
//        int[] input = new int[]{1,2,0,0};
//        int k = 34;

//        int[] input = new int[]{2,7,4};
//        int k = 181;

//        int[] input = new int[]{9,9,9,9,9,9,9,9,9,9};
//        int k = 1;

        int[] input = new int[]{1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;

        Task2 task2 = new Task2();
        List<Integer> result = task2.addToArrayForm(input, k);
        System.out.println(result.toString());
    }
}