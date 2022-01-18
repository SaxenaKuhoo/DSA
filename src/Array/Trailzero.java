package Array;

import java.util.Scanner;
//Question:
//Me Bean is very good in mathematics. He was given a number n and was told to find out number of trailing zeroes in n! (Factorial) . Can you help him?
//        Sample Input :  5
//        Sample Output : 1
//        Explanation :   5! (Factorial) is 120, so there is one trailing zero.
//        Implement it by using loop

public class Trailzero {
    public static void main(String[] args) {
        int n,f=1,c=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();

        for(int i=1;i<=n;i++)
            f=f*i;

        System.out.println("Factorial of " + n +" is : "+ f);

        while (f!=0)
        {
            int r=f%10;
            if(r==0)
                c=c+1;
            else
                break;
            f=f/10;
        }
        System.out.println("No. of trailing zeros are: "+ c);
    }
}
