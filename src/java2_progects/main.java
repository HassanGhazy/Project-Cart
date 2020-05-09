/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_progects;

import java.io.*;
import java.util.*;
public class main {
        
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner (System.in);  
        ArrayList <Product> list = new ArrayList<>();
        Cart a = new Cart ();
        Product b = new Product ();
  
        //Add First product to Cart
        Product p1 = new Product();
        p1.setId(1);
        p1.setName("watch");
        p1.setPrice(20.0);
        p1.setQuantity(45);
        p1.setDescription("Solar powered and lasts for a long time.");
        list.add(p1);
        
        //Add Second product to Cart
        Product p2 = new Product();
        p2.setId(2);
        p2.setName("light");
        p2.setPrice(30.0);
        p2.setQuantity(40);
        p2.setDescription("Find things well in the dark. ");
        list.add(p2);
    
        
        //Add Third product to Cart
        Product p3 = new Product();
        p3.setId(3);
        p3.setName("charger");
        p3.setPrice(8000.0);
        p3.setQuantity(20);
        p3.setDescription("a device for charging a battery.");
        list.add(p3);
       
        Product p4 = new Product();
        p4.setId(4);
        p4.setName("Moisturizer");
        p4.setPrice(100.0);
        p4.setQuantity(25);
        p4.setDescription("a lotion or cream used to prevent dryness in the skin.");  
        list.add(p4);

        try {
        b.print();
        System.out.println("Enter the number");
        int num = input.nextInt();
        
        
        while (num != 7){
            if (num == 0){

        System.out.println("ID" + " Name" + "\n===========================================");
        for (Product z : list){
            System.out.println(z.getId() + "\t" + z.getName());
        }

        System.out.print("\nEnter the ID to more information: ");
        System.out.println("\nEnter the 5 to enter the consol");
        
        int idd = input.nextInt();
        while (idd != 5){
        System.out.println("ID | Name | Description | Quantity | Price\n" +
"========================================================================================");
        switch (idd){
            
            case 1 : System.out.println(p1.getId() + " | " + p1.getName() + " | " + p1.getDescription() + " | " + p1.getQuantity() + " | " + p1.getPrice()); break;
            case 2 : System.out.println(p2.getId() + " | " + p2.getName() + " | " + p2.getDescription() + " | " + p2.getQuantity() + " | " + p2.getPrice()); break;
            case 3 : System.out.println(p3.getId() + " | " + p3.getName() + " | " + p3.getDescription() + " | " + p3.getQuantity() + " | " + p3.getPrice()); break;
            case 4 : System.out.println(p4.getId() + " | " + p4.getName() + " | " + p4.getDescription() + " | " + p4.getQuantity() + " | " + p4.getPrice()); break;
            default :
                System.out.println("Not valid");
        
        
        }
        idd = input.nextInt();
        
        }
            
        }            
        
        if (num == 1){
            System.out.println("Product of p1 or p2 or p3 or p4: ");
            String pro = input.next();            
            switch (pro){
                case "p1" : a.addToCart1(p1);
                                        System.out.println("add Success");           
                                        break;
                case "p2" : a.addToCart1(p2);
                                        System.out.println("add Success");
                                        break;
                case "p3" : a.addToCart1(p3);
                                        System.out.println("add Success");
                                        break;
                case "p4" : a.addToCart1(p4); 
                                        System.out.println("add Success");
                                        break;
                default :
                        System.out.println("not valid");
            }
            
        }

        
        if (num == 2){

            System.out.println("remave Product of p1 or p2 or p3 or p4: ");
            String pro = input.next();
            switch (pro){
                case "p1" : a.removeFromCart(p1);
                                        System.out.println("remove Success");
                                        break;
                case "p2" : a.removeFromCart(p2);
                                        System.out.println("remove Success");
                                        break;
                case "p3" : a.removeFromCart(p3);
                                        System.out.println("remove Success");
                                        break;
                case "p4" : a.removeFromCart(p4); 
                                        System.out.println("remove Success");
                                        break;
                default :
                        System.out.println("not valid");
            }
        }

        if (num==3){
            a.emptyCart();
            System.out.println("Success emptyCart");
        }
        if (num ==4 ){
            System.out.println("id \t name");            
            for (Product i : a.list){
                System.out.println(i.getId() + " \t " + i.getName());
               
            }
        }
        if (num == 5){
            for (int i = 0 ; i<a.getItems().size();i++){
                a.getItems().get(i);
            }
      if (a.list.isEmpty()){
          System.out.println("The cart is empty");
      break ;
      }            
       System.out.println("choose the pay methods: ");
       System.out.println("1- visa \n" + "2- master card \n" + "3- paypal");
       
       
       boolean payMethod = true ;
       int pp = input.nextInt();
            System.out.println("Enter the price");
       double price = input.nextDouble();
       

       for (Product product : a.list) {
            
            if (price>=product.getPrice()){

       if (pp == 1 ){
           System.out.println(payMethod + "\nthe pay is done"); 
           System.exit(0);
       } else if (pp == 2){
           System.out.println(payMethod + "\nthe pay is done");
           System.exit(0);

       }
       else if (pp == 3){
           System.out.println(payMethod + "\nthe pay is done");
           System.exit(0);

       }
       else System.out.println("not valid");

         } else System.out.println("the price is not enough");
        }
        }
        if (num == 6){

            System.out.println("1- entire name or part of name \n2- entire range price");
            int search = input.nextInt();
            
            if (search == 1) {
                System.out.print("enter the name or part of name : ");
                String name = input.next();
                filterName(name, list);
            } else if (search == 2) {
                System.out.println("enter the range price like this 'LowestPrice highestPrice'");
                int lowestPrice = input.nextInt();
                int highestPrice = input.nextInt();
                filterPrice(lowestPrice, highestPrice, list);
            } else {
                System.out.println("Invalid input");
            }

        }
        
        b.print();        
        System.out.println("Enter the number"); 
        num = input.nextInt();
        }
    }
        catch (Exception e){
            System.out.println(e);
        }
}

        public static void  filterName(String name, ArrayList<Product> list) {
        for (Product a : list) {
            if (a.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(a.toString());
            }
        }
    }
    public static void filterPrice(int n1, int n2, ArrayList<Product> list) {
        for (Product a : list) {
            if (a.getPrice() > n1 && a.getPrice() < n2) {
                System.out.println(a.toString());
            }
        }
    }
}