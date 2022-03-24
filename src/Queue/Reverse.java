package Queue;
//Q. Reverse the First K Elements in the Queue
//
//        For a given queue containing all integer data, reverse the first K elements.
//        You have been required to make the desired change in the input queue itself.
//
//
//
//
//        Input Format :
//        The first line of input would contain two integers N and K, separated by a single space. They denote the total number of elements in the queue and the count with which the elements need to be reversed respectively.
//
//        The second line of input contains N integers separated by a single space, representing the order in which the elements are enqueued into the queue.
//        Output Format:
//        The only line of output prints the updated order in which the queue elements are dequeued, all of them separated by a single space.
//        Note:
//        You are not required to print the expected output explicitly, it has already been taken care of. Just make the changes in the input queue itself.
//        Contraints :
//        1 <= N <= 10^6
//        1 <= K <= N
//        -2^31 <= data <= 2^31 - 1
//
//        Sample Input 1:
//        5 3
//        1 2 3 4 5
//        Sample Output 1:
//        3 2 1 4 5
//        Sample Input 2:
//        7 7
//        3 4 2 5 6 7 8
//        Sample Output 2:
//        8 7 6 5 2 4 3
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
    public static Queue<Integer> Backend(int n,int k,Queue<Integer> q)
    {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++)
            st.push(q.remove());
        for(int i=0;i<n;i++)
            if (i < k)
                q.add(st.pop());
            else
                q.add(q.remove());
        return q;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        int n=s.nextInt();
        int k=s.nextInt();
        for(int i=0;i<n;i++)
            q.add(s.nextInt());
        System.out.println(Backend(n,k,q));
    }
}
