package Array;

import java.util.Scanner;

//Q. Write a program to create a class (Employee) with the information given below.
//
//        1. emp_id
//        2. name
//        1. first_name
//        2. last_name
//        3. address
//        1. area
//        2. city
//        3. state
//        4. salary
//        5. designation
//
//        Read and print the data by creating  Employee array
//
//        Hint:- aggregation / containership
class Employee{
    int emp_id;
    String first_name;
    String last_name;
    String address;
    String area;
    String city;
    String state;
    String desig;
    int sal;

    public Employee() {
        emp_id=0;
        first_name="none";
        last_name="none";
        address="none";
        area="none";
        city="none";
        state="none";
        desig="none";
        sal=0;
    }
    @Override
    public String toString()
    {
        return ("Emp_id:  "+emp_id+"     name: "+first_name+last_name+"    Addres:   "+area+city+state+
                "       Desig:    "+desig+"   Salary: "+sal);
    }
}

public class Emp {
    public static void main(String[] args) {
        Employee []arr=new Employee[5];
        Scanner s=new Scanner(System.in);
        for (int i=0;i< arr.length;i++)
        {
            arr[i]=new Employee();
            arr[i].emp_id=s.nextInt();
            arr[i].first_name=s.next();
            arr[i].last_name=s.next();
            arr[i].address=s.next();
            arr[i].city=s.next();
            arr[i].state=s.next();
            arr[i].desig=s.next();
            arr[i].sal=s.nextInt();
        }
        for (Employee a:arr)
        {
            System.out.println(a.toString());
        }
    }
}
