package Class.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderApp {

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
                String P = sc.nextLine();

                boolean exists = false;
                for(OrderApp orderApp : orderAppList){
                    if(orderApp.OrderApp().equals(P)) {
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
                OrderApp orderApp = new OrderApp();
                orderApp.setOrderID(OrderID);
                orderApp.setCustomerName(OrderID);
                orderApp.setProductName(OrderID);
                orderAppList.add(orderApp);
                System.out.println("Enter Price");
                // setPrice(sc.nextLine());
                System.out.println("Enter Quantity");
                // setQuantity(sc.nextLine());

                OrderApp newOrderApp = new OrderApp(OrderID, CustomerName, ProductName);
                orderAppList.add(newOrderApp);
            }
          }
         else if (choice == 2) {
                System.out.println("Enter new Order ID to update");
                String P = sc.nextLine();

                OrderApp found = null;

                for(OrderApp orderApp : orderAppList){
                    if(orderApp.getOrderID().equals(P)) {
                        found = orderApp;
                    }
                }
                if (found != null) {
                    System.out.println("Not Found.");
                }  else {
                    System.out.println("Enter a new Order ID");
                    found.setOrderID(sc.nextLine());
                    System.out.println("Enter New Customer Name");
                    found.setCustomerName(sc.nextLine());
                    System.out.println("Enter New Product Name");
                    found.setProductName(sc.nextLine());
                    System.out.println("Enter New Price");
                    found.setPrice(sc.nextLine());
                    System.out.println("Enter New Quantity");
                    found.setQuantity(sc.nextLine());

                }
            }

         else if (choice == 3) {
             for(OrderApp orderApp : orderAppList){
                 System.out.println(orderApp.toString());
             }
            }

         else if (choice == 4) {
             break;
            }
        }
    }

}
