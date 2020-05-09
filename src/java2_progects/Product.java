
package java2_progects;

interface Printable {
 void print();
}


public  class Product implements Printable{
    private int id ;
    private String name ;
    private String description ;
    private double price ;
    private int quantity ;
public Product (){}

    public Product(int id, String name, String description, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void print() {
        System.out.print("\n  0- list of product: ");
        System.out.print("\n  1- addToCart: ");
        System.out.print("\n  2- removeFromCart: ");
        System.out.print("\n  3- emptyCart: ");
        System.out.print("\n  4- getItems: ");
        System.out.print("\n  5- BuyItems: ");
        System.out.print("\n  6- search: ");
        System.out.print("\n  7- Exit " + "\n");    
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", quantity=" + quantity + '}';
    }
}
