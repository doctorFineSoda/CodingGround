package org.example;

public class Task4 {
    public Task4(){}

    public int singleNonDuplicate(int[] numbs) {
        int left = 0, right = numbs.length - 1, element = -1;
        if(left==right){
            return numbs[left];
        } else if (numbs[0] != numbs[1]) {
            return numbs[0];
        } else if (numbs[right-1] != numbs[right]) {
            return numbs[right];
        }
        while ((left < right) && (element < 0)){
            if ((numbs[left] == numbs[left+1]) || (numbs[left] == numbs[left-1])){
                left++;
            } else {
                element = numbs[left];
            }
        }
        return element;
    }
}
