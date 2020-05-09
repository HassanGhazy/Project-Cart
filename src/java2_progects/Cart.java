
package java2_progects;
import java.util.ArrayList;
public class Cart {
    
   
       /** All Cart items will be stored in the List. */

    ArrayList<Product> list = new ArrayList();
    

    public void addToCart1(Product p){
        list.add(p);
    }    
    /** Remove a Product from Cart.*/
    public void removeFromCart(Product p){        
        list.remove(p);
    }   
    /** Remove all Products from Cart.*/
    public void emptyCart(){        
        list.clear();
    }


    /** Returns all cart items.*/
    public ArrayList<Product> getItems() {
        return list;
    }

}
