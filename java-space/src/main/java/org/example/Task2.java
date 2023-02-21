package org.example;
import java.math.BigInteger;
import java.util.*;
//https://leetcode.com/problems/add-to-array-form-of-integer/description/
public class Task2 {
    public List<Integer> addToArrayForm(int[] num, int k) {
//        convert array to number and add
        List<Integer> result = new ArrayList<Integer>();
        BigInteger sumNum = BigInteger.valueOf(0);
        BigInteger zehner=BigInteger.valueOf(1);
        for (int i = num.length-1; i >= 0; i--){
            sumNum = sumNum.add(zehner.multiply(BigInteger.valueOf(num[i])));
            zehner = zehner.multiply(BigInteger.valueOf(10));
        }
        BigInteger sum = sumNum.add(BigInteger.valueOf(k));
        while (sum.compareTo(BigInteger.valueOf(0)) > 0){
            result.add(0,(sum.mod(BigInteger.valueOf(10))).intValue());
            sum = sum.divide(BigInteger.valueOf(10));
        }

        return result;
    }
}
