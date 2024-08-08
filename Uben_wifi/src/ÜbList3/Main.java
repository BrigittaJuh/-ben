package ÜbList3;

public class Main {
    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        sl.addItems("tej");
        sl.addItems("kenyer");
        sl.addItems("cukor");
        sl.addItems("vaj");

        System.out.println("Bevasarlo lista: ");
        sl.listItems();

        sl.removeItems("kenyer");

        System.out.println("frissitett lista: ");
        sl.listItems();

        System.out.println("kiüritett lista: ");
        sl.clearList();
        sl.listItems();
    }
}
