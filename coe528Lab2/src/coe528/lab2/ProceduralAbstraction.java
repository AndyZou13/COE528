/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528.lab2;

/**
 *
 * @author Battl
 */
public class ProceduralAbstraction {
    
    //Requires: None 
    //Modifies: None 
    //Effects: Returns the smallest positive integer n for which n!  
    //(i.e. 1*2*3*...*n) is greater than or equal to x, for positive  
    //integer x. Otherwise returns 1. 
    static int count = 1;
    public static int reverseFactorial(int x) {
        if (x <= 1) {
            int temp = count;
            count = 1;
            return temp;
        }
        count ++;
        return reverseFactorial(x/count);
    }

    //Requires: None 
    //Modifies: None 
    //Effects: If the matrix arr satisfies Nice property, prints the sum and  
    //returns true. Otherwise returns false.  
    
    public static boolean isMatrixNice(int[][] arr) {
        if (arr.length == arr[0].length) {
            int sum = 0;
            for (int i = 0; i < arr.length; i ++) {
                int temp = 0;
                for (int j = 0; j < arr[i].length; j ++) {
                    temp = temp + arr[i][j];
                }
                if (i == 0) {
                    sum = temp;
                }
                else {
                    if (temp != sum) {
                        return false;
                    }
                }
            }
            int d = 0;
            for (int i = 0; i < 2; i ++) {
                int tempd = 0;
                for (int j = 0; j < arr.length; j ++) {
                    tempd = tempd + arr[j][j];
                }
                if (i == 0) {
                    d = tempd;
                }
                else {
                    if (tempd != d) {
                        return false;
                    }
                }
                if (d != sum) {
                    return false;
                }
            }
            System.out.println("Sum is: " + sum);
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main (String[] args) {
        int[][] test1 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int[][] test2 = {{-3, 1, 0}, {4, -3, 4}, {7, -9, 0}};
        System.out.println("The reverseFactorial of 24 is: " + reverseFactorial(24)); //should return 4
        System.out.println("The reverseFactorial of 119 is: " + reverseFactorial(119)); //should return 5
        System.out.println("Is the matrix nice? " + isMatrixNice(test1));
        System.out.println("Is the matrix nice and what is sum? "  + isMatrixNice(test2));
    }
}
