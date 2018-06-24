package Biblioteka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Reader[] readers = {new Reader("AIB", 10984, "Ft-1-2", "Наукова література", "11.03.2018"),
                new Reader("Jakey O.B.", 8093, "Mt", "Художня література", "15.12.2017")};

        Book[] books = {new Book("Inferno", "Author", "9087-1947-4985", "Fiction", "Escom",
                "2016"), new Book("Властелин колец", "Autho", "1234-1322-5555", "Humanitarian literature",
                "Flower", "1995")};

        Catalogue catalogue;
        catalogue = new Catalogue(readers);
        Catalogue catalogue1;
        catalogue1 = new Catalogue(books);
        Catalogue catalogue2;
        catalogue2 = new Catalogue(readers, books);
        System.out.println("Выберете действие:\n" +
                "1. Вывести список читателей;\n" +
                "2. Вывести список книг;\n" +
                "3. Вывести список книг и читателей;\n" +
                "4. Найти читателя за курсом;\n" +
                "5. Найти книгу за автором;\n" +
                "6. Создать нового читателя;");
        int actionNumber = Integer.parseInt(input.readLine());
        switch (actionNumber) {
            case 1:
                catalogue.printListReaders();
                break;
            case 2:
                catalogue1.printListBooks();
                break;
            case 3:
                catalogue2.printListAll();
                break;
            case 4:
                System.out.print("Введите курс: ");
                String kursreader = input.readLine();
                catalogue.findReader(kursreader);
                break;
            case 5:
                System.out.print("Введите автора: ");
                String bookAuthor = input.readLine();
                catalogue.findBookByAuthor(bookAuthor);
                break;
        }
    }
}
