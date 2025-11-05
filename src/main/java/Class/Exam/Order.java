package Class.Exam;

public class Order {
    String OrderID, CustomerName, ProductName;
    double Price, TotalPrice;
    int Quantity;

    public String getOrderID() {
        return OrderID;
    }
    public void setOrderID(String orderID) {
        this.OrderID = OrderID;
    }
     public String getCustomerName() {
         return CustomerName;
     }
     public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }
    public String getProductName() {
        return ProductName;
    }
    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderID='" + OrderID + '\'' +
                ",CustomerName" + CustomerName + '\'' +
                ",ProductName" + ProductName + '\'' +
                '}';
    }
}
