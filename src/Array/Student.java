package Array;

//Q. Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks. The structure of student class is as follows
//class Student
//{
//    private int rollno;
//    private int marks
//    private String name;
//}
// create constructor or getter and setter methods as per need

import java.util.Scanner;

class Stu {
    private int roll;
    private int marks;
    private String name;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//        Stu(int roll,int marks,String name)
//    {
//        this.roll=roll;
//        this.marks=marks;
//        this.name=name;
//    }
}
public class Student
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Stu []arr=new Stu[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=new Stu();
        for(int i=0;i<3;i++)
        {
            arr[i].setRoll(s.nextInt());
            arr[i].setName(s.next());
            arr[i].setMarks(s.nextInt());
        }
        int max=0,in=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].getMarks()>max) {
                max = arr[i].getMarks();
                in = i;
            }
        }
        System.out.println("Highest:    "+arr[in].getRoll()+"      "+arr[in].getName()+"        "+arr[in].getMarks());
        int min=100;
        in=0;
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i].getMarks()<min) {
                min = arr[i].getMarks();
                in = i;
            }
        }
        System.out.println("Lowest:     "+arr[in].getRoll()+"      "+arr[in].getName()+"        "+arr[in].getMarks());
    }

}
