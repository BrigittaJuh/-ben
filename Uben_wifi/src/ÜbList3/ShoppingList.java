package ÜbList3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<String> items;

    public ShoppingList(){
        items = new ArrayList<>();
    }
    public void addItem(String item){
        items.add(item);
    }

    public void removeItem(String item){
        items.remove(item);
    }
    public void clearList(){
        items.clear();
    }

    public void listItem(){
        for (String item : items){
            System.out.println(item);
        }
    }
}
