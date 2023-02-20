package main.java.org.example;
//https://leetcode.com/problems/search-insert-position/
//binary search for a an existing or non existent integer
public class Task3 {
    public Task3(){}
    public int searchInsert(int[] numbs, int target) {
        int left = 0, right = numbs.length - 1, mid = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if (numbs[mid] < target){
                left = mid + 1;
            } else if (numbs[mid] > target){
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }

}
