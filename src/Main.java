import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Richard Book Shop");
        Scanner inventory = new Scanner(System.in);
        System.out.println("Enter the No of Products You Brought");
        int NoOfProduct = inventory.nextInt();

        String [] ProductNames = new String[NoOfProduct];
        int [] ProductId = new int[NoOfProduct];
        int [] Quantity = new int [NoOfProduct];
        double [] ProductPrice = new double[NoOfProduct];
        double [] TotalValues = new double[NoOfProduct];



        double totalInventoryValue=0;
        double highestvalue=0;
        String highestvalueproduct ="0";

        for(int i=0; i<NoOfProduct;i++){
            System.out.println("Enter Product Name");
            ProductNames[i] = inventory.next();

            System.out.println("Enter Product ID");
            ProductId[i] = inventory.nextInt();

            System.out.println("Enter Quantity");
            Quantity[i]= inventory.nextInt();

            System.out.println("Enter Product Price");
            ProductPrice[i] = inventory.nextDouble();

            TotalValues[i] = ProductPrice[i] * Quantity[i];
            totalInventoryValue += TotalValues[i];


        }

        System.out.println("Summary of Inventory");
        for(int i=0; i<NoOfProduct;i++){
            System.out.println("Product Name " + ProductNames[i]);
            System.out.println("Prodduct ID " + ProductId[i]);
            System.out.println("Quantity " + Quantity[i]);
            System.out.println("Product Price " + ProductPrice[i]);
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
            System.out.println("----------------------------");
        }

        System.out.println(totalInventoryValue);



    }
}