package Array;

//Q. Write a Java class, Flower, that has three instance variables of type String, int, and float,
//        which respectively represent the name of the flower,its number of petals, and price.
//        Your class must include a constructor method that initialises each variable to an appropriate
//        value, and your class should include methods for setting the value of each type, and
//        getting the value of each type.
//        Create an array of 5 Flower objects and print the value.

import java.util.Scanner;

class Flowerdef {
    String name;
    int petals;
    float price;
    Flowerdef()
    {
        name="None";
        petals=0;
        price=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

public class Flower
{
    public static void main(String[] args) {
        Flowerdef []arr=new Flowerdef[5];
        Scanner s=new Scanner(System.in);
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=new Flowerdef();
            arr[i].setName(s.next());
            arr[i].setPetals(s.nextInt());
            arr[i].setPrice(s.nextFloat());
        }
        System.out.println("Name  Petals  Price");
        for (Flowerdef a:arr)
        {
            System.out.println(a.getName()+"     "+a.getPetals()+"      "+a.getPrice());
        }
    }
}
