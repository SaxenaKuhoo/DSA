package Queue;

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
