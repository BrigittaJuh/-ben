package Üb9;

public class Person2 {
    private String nachname, vorname;
    private  int alte;

    public Person2(String nachname, String vorname, int alte) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.alte = alte;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public int getAlte() {
        return alte;
    }
}
