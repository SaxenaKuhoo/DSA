package Array;

import java.util.Scanner;

//Q. Write a program to find whether the array of integers contains a duplicate number.
// if yes print the location where duplicate numbers are found.

public class Dupele {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int b=a[i];
            if(b!=Integer.MIN_VALUE)
            System.out.print("Element "+b+" found at index :  "+i);
            for(int j=0;j<n;j++) {
                if (b == a[j] && i != j && a[j] != 0) {
                    System.out.print("  " + j);
                    a[j] = Integer.MIN_VALUE;
                    flag = 1;
                }
            }if(b!=0)
            System.out.println();
        }
        if(flag==0)
        System.out.println("No duplicate found");
    }
}
