package Üb12;

public class Üben_12_ {
    public static void main(String[] args) {
      String[] szavak = {"alma","ez", " holvan az"};
      String legkisebSzo = szavak[0];

        for (int i = 1; i < szavak.length; i++) {
            if (szavak[i].length() < legkisebSzo.length()){
                legkisebSzo = szavak[i];
            }
        }
        System.out.println(legkisebSzo);

    }
}
