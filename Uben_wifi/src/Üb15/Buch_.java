package Üb15;

public class Buch_ {

 private String title;
 private  String autor;
 private int seitenzhl;

    public Buch_(String title, String autor, int seitenzhl) {
        this.title = title;
        this.autor = autor;
        this.seitenzhl = seitenzhl;
    }

    public String getTitle() {
        return title;
    }

    public String getAutor() {
        return autor;
    }

    public int getSeitenzhl() {
        return seitenzhl;
    }
}
