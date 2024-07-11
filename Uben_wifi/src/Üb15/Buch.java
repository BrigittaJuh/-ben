package Üb15;

public class Buch {
    private String Titel;
    private  String Autor;
    private  int Seitenzahl;

    public Buch(String titel, String autor, int seitenzahl) {
        Titel = titel;
        Autor = autor;
        Seitenzahl = seitenzahl;
    }

    public String getTitel() {
        return Titel;
    }

    public String getAutor() {
        return Autor;
    }

    public int getSeitenzahl() {
        return Seitenzahl;
    }
}
