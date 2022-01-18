package Array;

//Q. Write a short Java function that takes an array of int values as an argument
//        and determines if there is a pair of numbers in the array whose product is odd.

import java.util.Scanner;

public class Oddpair {
    public static int func1(int[] a)
    {
        int c = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int p = a[i] * a[i + 1];
            if (p % 2 != 0)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner s=new Scanner(System.in);
        for (int i=0;i< arr.length;i++)
            arr[i]=s.nextInt();

        int r = func1(arr);

        if(r!=0)
            System.out.println("No. of Odd product pairs are:   "+r);
        else
            System.out.println("No odd product pair found.");
    }
}
