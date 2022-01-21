package Recursion;

import java.util.Scanner;
//Q3. Write a program to find out and return the number of digits present in a number recursively.
//        Sample Input 1 :      156
//        Sample Output 1 :     3
//        Sample Input 2 :      7
//        Sample Output 2 :     1

public class Find_Digits {
    public static int digits(int n,int c)
    {
        if(n==0)return c;
        return digits(n/10,c+1);
    }
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(digits(n,0));
    }
}
