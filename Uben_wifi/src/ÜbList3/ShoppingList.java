package ÜbList3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<String> items;

    public ShoppingList(){
        items = new ArrayList<>();
    }

    public void addItems(String item){
        items.add(item);
    }
    public void removeItems (String item){
        items.remove(item);
    }

    public void clearList(){
        items.clear();
    }

    public void listItems(){
        for (String item : items){
            System.out.println(item);
        }
    }
}

