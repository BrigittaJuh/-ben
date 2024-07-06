package Üb9;

public class Person {
    private String Vorname;
    private String Nachname;
    private int Alter;

    public Person(String vorname, String nachname, String alter) {
        this.Vorname = vorname;
        this.Nachname = nachname;
        this.Alter = Integer.parseInt(alter);
    }

    public String getVorname() {
        return Vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public int getAlter() {
        return Alter;
    }
}
