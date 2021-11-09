package hw5;

import java.time.LocalDate;

public class Reader {

    private String fio;
    private int libraryCard;
    private String faculty;
    private LocalDate dateOfBirth;
    private String phone;

    public Reader(String fio, int libraryCard, String faculty, LocalDate dateOfBirth, String phone) {
        this.fio = fio;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public int getLibraryCard() {
        return libraryCard;
    }

    public String getFaculty() {
        return faculty;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setLibraryCard(int libraryCard) {
        this.libraryCard = libraryCard;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int bookCount) {
        System.out.println(fio + " взял " + bookCount + " книг(и)");
    }

    public void takeBook(String... bookNames) {
        System.out.println(fio + " взял книги: ");
        for (String name: bookNames) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(fio + " взял книги: ");
        for (Book book: books) {
            System.out.println(book.getName() + " (" + book.getAutor() + " " + book.getYear() +")");
        }
    }

    public void returnBook(int bookCount) {
        System.out.println(fio + " вернул " + bookCount + " книг(и)");
    }

    public void returnBook(String... bookNames) {
        System.out.println(fio + " вернул книги: ");
        for (String name: bookNames) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(fio + " вернул книги: ");
        for (Book book: books) {
            System.out.println(book.getInfo());
        }
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", libraryCard=" + libraryCard +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phone='" + phone + '\'' +
                '}';
    }
}
