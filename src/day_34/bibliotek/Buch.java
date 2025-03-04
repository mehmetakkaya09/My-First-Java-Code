package day_34.bibliotek;

public class Buch {

    // static id
    // buchID  -- getter
    // title
    // type
    // verlag
    // ISBN

    private Autor autor;
    private int buchID; //-- getter
    private String title;
    private String verlag;
    private String type;
    private int ISBN;

    private static int id;

    static {
        id = 1000;
    }

    {
        buchID = id++;
        title = "unbekant";
        verlag = "unbekannt";
        type = "unbekant";
        ISBN = 123456789;
    }

    public Buch(Autor autor, String title, String verlag, int ISBN, String type) {
        setAutor(autor);
        setTitle(title);
        setVerlag(verlag);
        setISBN(ISBN);
        setType(type);
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBuchID() {
        return buchID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title.trim();
        this.title = title;
    }


    public String getVerlag() {
        return verlag;
    }

    public void setVerlag(String verlag) {
        verlag = verlag.trim();
        this.verlag = verlag;
    }

    public long getISBN(int ISBN) {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "buchID=" + buchID +
                ", Autor=" + autor.getVorname() + " " + autor.getNachname() +
                ", title='" + title + '\'' +
                ", verlag='" + verlag + '\'' +
                ", type='" + type + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
