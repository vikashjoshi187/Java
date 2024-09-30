package org.example;
import java.io.*;
import java.util.Scanner;



public class Main  {

    public static void main(String[] args) throws  FileNotFoundException,IOException, ClassNotFoundException,ClassCastException {
        Scanner sc =new Scanner(System.in);
File file=new File("produts.txt");
        System.out.println("Enter NUmber of products You Want Enter");
        int numOfproducts=sc.nextInt();
        Product_Detials Produts[]=new Product_Detials[numOfproducts];

        for (int i = 0; i < Produts.length; i++) {
            System.out.println("Enter Product Id");
            int pId=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Product Name");
            String productName=sc.nextLine();
            System.out.println("Enter Product Price");
            double productPrice=sc.nextDouble();
            Produts[i]=new Product_Detials(pId,productName,productPrice);
        }

        for (int i = 0; i <Produts.length ; i++) {
            String outPuttxt=Produts[i].getPid()+" | "+Produts[i].product_name+" | "+Produts[i].getProduct_price()+" | \n";
            System.out.println(outPuttxt+"\n");

        }



        ObjectOutputStream oBjoS=new ObjectOutputStream(new FileOutputStream("produts.txt"));
            oBjoS.writeObject(Produts);



        try(FileInputStream reader = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(reader);) {
            Product_Detials obj[] = (Product_Detials[])ois.readObject();
            for (Product_Detials product1 : obj) {

                   System.out.println(product1);
            }
            double maxprice=0;
            String maxlengthproduct="";
            String smallLenghtproduct=obj[0].product_name;
            for (Product_Detials p:obj) {
                if ( p.product_price > maxprice){
                    maxprice=p.product_price;
                }
                if (p.product_name.length()>maxlengthproduct.length()){
                    maxlengthproduct=p.product_name;
                }

                if (p.product_name.length()<smallLenghtproduct.length()){
                    smallLenghtproduct=p.product_name;
                }
            }
            System.out.println("Product With Higest Price is "+maxprice);
            System.out.println("Product With smallest name is "+smallLenghtproduct);
            System.out.println("Product with largest name is "+maxlengthproduct);

        }
        catch (Exception e) {
            e.printStackTrace();
        }






    }
}