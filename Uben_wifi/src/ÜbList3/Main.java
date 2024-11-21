package ÜbList3;

public class Main {
    public static void main(String[] args) {
        ShoppingList sl = new ShoppingList();
        sl.addItem("tej");
        sl.addItem("tojas");
        sl.addItem("vaj");
        sl.addItem("kenyer");
        sl.addItem("sajt");

        System.out.println("Bevasarlo lista");
        sl.listItem();

        sl.removeItem("vaj");

        System.out.println("Frisitett bevasarlo lista: ");
        sl.listItem();

        sl.clearList();

        System.out.println("Kiüritett lista: ");
        sl.listItem();
    }
}
