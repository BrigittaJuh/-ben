package Üb15;

public class Test_ {
    public static void main(String[] args) {
   Buch[] buches = {
           new Buch("A könyv cime", "a könyv iroja",564),
           new Buch("A könyv cime", "a könyv iroja",164),
           new Buch("A könyv cime", "a könyv iroja",64),
           new Buch("A könyv cime", "a könyv iroja",964),
   };

   for (Buch buch : buches){
       if (buch.getSeitenzahl() > 100){
           System.out.println(buch.getTitel() + buch.getAutor() + buch.getSeitenzahl());
       }
   }


    }
}

