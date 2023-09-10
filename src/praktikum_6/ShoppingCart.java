/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart(List<CartItem> items) {
        this.items = items;
    }
    
    public void addCartItem(CartItem item) {
        if (items == null) {
            items = new ArrayList<CartItem>();
        }
        items.add(item);
    }
    
    public void removeCartItem(CartItem item) {
        items.remove(item);
    }
    
    public void clearCart() {
        items.clear();
    }
    
    public int getTotalPrice() {
        int price = 0;
        for (CartItem item : items) {
            price += item.getTotalPrice();
        }
        return price;
    }
}
