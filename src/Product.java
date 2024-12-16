public class Product {
    private String name;
    private String description;
    private float price;
    private int quantity;
    private float discount;
    private String color;

    // Non parameterized constructor
    public Product() {
       this.name = "No name";
       this.description = "No description";
       this.price = 0.0f;
       this.quantity = 0;
       this.discount = 0.0f;
    }

    // Parameterized constructor
    Product(String n, String d, float p, int q, float c, String col) {
        this (n, d, p, q, c);
        this.color = col;
    }

     // Parameterized constructor
    public Product(String n, String d, float p) {
           this.name = n;
           this.description = d;
           this.price = p;
    }

    // Copy constructor)
    public Product(Product obj) {
        this (obj.name, obj.description, obj.price, obj.quantity, obj.discount, obj.color);
    }

    // Parameterized constructor
    public Product(String n, String d, float p, int q, float c) {
       this.name = n;
       this.description = d;
       this.price = p;
       this.quantity = q;
       this.discount = c;
    }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("description: " + description);
        System.out.println("price: " + price);
        System.out.println("quantity: " + quantity);
        System.out.println("discount: " + discount);
    }
}
