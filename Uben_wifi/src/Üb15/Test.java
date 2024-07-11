package Üb15;

public class Test {
    public static void main(String[] args) {
        Buch[] bucher ={
        new Buch("A könyv", " Kis Miska", 123),
         new Buch("A köny erej", "Poba iro",56),
         new Buch("A könyv ertelme", " Nagy csapas", 145)};

        System.out.println(" Bücher mit mehr als 100 seiten: ");
        for (Buch buch : bucher){
            if (buch.getSeitenzahl() > 100){
                System.out.println(buch.getTitel() + buch.getAutor());
            }
        }
    }
}
