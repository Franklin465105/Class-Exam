package Class.Exam;

public class Order {
    String OrderID, CustomerName, ProductName;
    private double Price;
    private int Quantity;
    private double TotalPrice;

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

    public Order(String OrderID, String CustomerName, String ProductName, double Price, int Quantity, double TotalPrice) {
        this.OrderID = OrderID;
        this.CustomerName = CustomerName;
        this.ProductName = ProductName;
        this.Price = Price;
        this.Quantity = Quantity;
        this.TotalPrice = Price * Quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "OrderID='" + OrderID + '\'' +
                ",CustomerName" + CustomerName + '\'' +
                ",ProductName" + ProductName + '\'' +
                ",Price" + Price + '\'' +
                ",Quantity" + Quantity + '\'' +
                ",TotalPrice" + TotalPrice + '\'' +
                '}';
    }
}
