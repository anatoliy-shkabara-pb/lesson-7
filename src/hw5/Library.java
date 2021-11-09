package hw5;


import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {
        Reader ivan = new Reader(
                "Иванов И.И",
                123,
                "Химия",
                LocalDate.of(1990, 1, 20),
                "123445678"
        );

        Reader petr = new Reader(
                "Петров П.П",
                222,
                "Математика",
                LocalDate.of(1987, 4, 20),
                "23432124"
        );

        System.out.println(ivan);
        System.out.println(petr);

        Book book1 = new Book("Поезия", "Сидоров Ф. А.", 1980);
        Book book2 = new Book("Физика", "Петров Ф. А.", 1998);
        Book book3 = new Book("Химия", "Иванов Ф. А.", 2010);

        System.out.println(book1.getInfo());
        System.out.println(book2.getInfo());
        System.out.println(book3.getInfo());


        ivan.takeBook(3);
        ivan.takeBook("Словарь", "Стихи");
        ivan.takeBook(book1, book2, book3);


        ivan.returnBook(3);
        ivan.returnBook("Словарь", "Стихи");
        ivan.returnBook(book1, book2, book3);
    }
}
