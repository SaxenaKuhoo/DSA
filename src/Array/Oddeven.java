package Array;

import java.util.ArrayList;
import java.util.Scanner;

//Q. Write a program to input the elements of a two- dimensional array.Then from this array,
//        make two arrays one that stores all odd elements of the two-dimensional array
//        and the other that stores all even elements of the array.
//        Note:-  Resulting arrays will be of ArrayList type

public class Oddeven {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int [][]arr=new int[4][4];
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for (int i=0;i< arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
                if(arr[i][j]%2==0) {
                    even.add(arr[i][j]);
                }
                else {
                    odd.add(arr[i][j]);
                }
            }
        }
        for (int a:odd
             ) {
            System.out.print(a+"    ");
        }
        System.out.println(" ");
        for (int b:even
             ) {
            System.out.print(b+"    ");
        }
    }
}
