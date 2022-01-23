package Recursion;

import java.util.Scanner;
//Q4. Write a program to find and return the sum of all elements of the array. Do this recursively.
//        Sample Input 1 :
//        3
//        9 8 9
//        Sample Output 1 :
//        26
//        Sample Input 2 :
//        3
//        4 2 1
//        Sample Output 2 :
//        7
public class Sum {
    public static int sum(int[] a,int n,int s)
    {   if(n<=0)
            return s;
        return sum(a,n-1,s+a[n-1]);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=s.nextInt();
        System.out.println(sum(a,n,0));
    }
}
