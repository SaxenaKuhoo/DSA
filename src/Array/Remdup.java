package Array;

import java.util.Scanner;

//Q. Write a program to remove consecutive duplicate elements in an array.
//        Input values
//        10 10 30 30 40 50 50 50 9 45
//        Output
//        10 30 40 50 9 45
public class Remdup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++) {
                if (a[i] == a[j] && i != j) {
                    a[j] = Integer.MIN_VALUE;
                }
            }
        }
        for(int e:a) {
            if(e!=Integer.MIN_VALUE)
                System.out.print(e+" ");

        }
    }
}
