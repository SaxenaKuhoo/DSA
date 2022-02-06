//Q. The Olympic results are given in a table, where each row represents a country, and columns
// represent gold, silver, and bronze medals. For example, the element r[0][0] is the number of gold medals
// earned by the 0-th country. Write a method that takes the table as an input, and returns a new array
// which lists the total number of medals for each country. For example, if we start with the table
//        2   0   1
//        3   2   0
//        0   0   2
//        in which the 0-th country earned 2 + 0 + 1 = 3 medals, the 1-st country earned 3 + 2 + 0 = 5 medals,
//        and the 2nd country earned 0 + 0 + 2 = 2 medals, your method should return an array with values
//        3
//        5
//        2

import java.util.Scanner;

public class Olympic {
    public static int[] count(int [][]arr)
    {
        int[] res=new int[arr.length];
        for(int i=0;i< arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                res[i]=res[i]+arr[i][j];
        return res;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No. of countries: ");
        int[][] ar=new int[s.nextInt()][3];
        for(int i=0;i<ar.length;i++)
            for(int j=0;j<3;j++)
                ar[i][j]=s.nextInt();
        int[] cnt=count(ar);
        for (int a:cnt)
            System.out.println(a);
    }
}
