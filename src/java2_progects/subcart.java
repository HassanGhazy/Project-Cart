/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package java2_progects;

import java.util.Scanner;

/**
 *
 * @author HAS
 */
public class subcart extends Cart{
   
    
    /** Payment Mode used by user. */
    private String paymentMode;
    
    /**Amount Paid by user. */ 
    private double paymentAmount=0;
    
 
    
    /** Total amount of ordered items. */
    private double totalAmount=0;
    private double paymentDue = 0;


    public static void main(String[] args) {}
        public void checkout(){
        getItems();    
        
        printPaymentSummary();
        emptyCart();//after confirmation of order empty the cart
    }
        
        public void printPaymentSummary() {
                  
        System.out.println("PAYMENT SUMMARY: ");   
        System.out.println("==================================");
        System.out.println("TOTAL AMOUNT: "+totalAmount);
        System.out.println("PAYMENT AMOUNT: "+paymentAmount);
        System.out.println("PAYMENT MODE: "+paymentMode);       

        
        }
     
        
          public void printCart(){        
        System.out.println("==================================");
        System.out.println("CART ITEMS:");        
        System.out.println("==================================");
        for (Product p : getItems()) {
            System.out.println("PRODUCT ID: "+p.getId());
            System.out.println("PRODUCT NAME: "+p.getName());
            System.out.println("PRODUCT PRICE: "+p.getPrice());
            System.out.println();
        }  
        
/*    
      
  
*/
    }}

