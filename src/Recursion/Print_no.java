package Recursion;

//Q2. Write a program to print numbers from 1 to n in increasing order recursively.
//        Sample Input 1 :      6
//        Sample Output 1 :     1 2 3 4 5 6

import java.util.Scanner;

public class Print_no {
    public static int print(int n,int i)
    {
        if(n==0) return 1;
        System.out.print(i +" ");
        return print(n-1,i+1);
    }
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        print(n,1);
    }
}
