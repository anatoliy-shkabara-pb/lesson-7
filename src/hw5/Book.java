package hw5;

public class Book {

    private final String name;
    private final String autor;
    private final int year;

    public Book(String name, String autor, int year) {
        this.name = name;
        this.autor = autor;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public int getYear() {
        return year;
    }


    public String getInfo() {
        return name + " (" + autor + " " + year + " г.)";
    }
}
