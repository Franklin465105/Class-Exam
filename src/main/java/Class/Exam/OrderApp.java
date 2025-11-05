package Class.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderApp {
    public OrderApp(String orderID, String customerName, String productName) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<OrderApp> orderAppList = new ArrayList<OrderApp>();

        while (true) {
            System.out.println("==== Order Management System ====");
            System.out.println("1) Add Order");
            System.out.println("2) Update Order");
            System.out.println("3) List Orders");
            System.out.println("4) Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println ("Enter Order ID");
                String orderID = sc.nextLine();

                boolean exists = false;
                for(OrderApp orderApp : orderAppList){
                    if(orderApp.(OrderApp).equals(orderID)) {
                        exists = true;
                    }
                }
            if (exists) {
                System.out.println("Order ID already exists ");
            }  else {
                System.out.println("Enter a new Order ID");
                String OrderID = sc.nextLine();
                System.out.println("Enter New Customer Name");
                String CustomerName = sc.nextLine();
                System.out.println("Enter New Product Name");
                String ProductName = sc.nextLine();

                OrderApp newOrderApp = new OrderApp(OrderID, CustomerName, ProductName);
                orderAppList.add(newOrderApp);
            }
          }
         else if (choice == 2) {
                System.out.println("Enter new Order ID to update");
                String orderID = sc.nextLine();


            }


        }



    }


}
