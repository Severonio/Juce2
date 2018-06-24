package Biblioteka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Catalogue {
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    private Reader[] readers;
    private Book [] books;

    public Catalogue(Reader[] list1){
        readers = list1;
    }
    public Catalogue(Book[] list2){
        books = list2;
    }
    public Catalogue(Reader[] list3, Book[] list4){
        readers = list3;
        books = list4;
    }

    public void printListReaders(){
        for (Reader reader: readers) {
            System.out.println(reader);
        }
    }
    public void printListBooks(){
        for (Book book: books) {
            System.out.println(books);
        }
    }
    public void printListAll(){
        for (Reader reader: readers) {
            System.out.println(reader);
        }
        for (Book book: books) {
            System.out.println(books);
        }
    }

    public String findReader(String readerKurs){
        String result = "";
        for (Reader reader: readers) {
            if(reader.getKurs().contains(readerKurs))
                result += reader.toString();
        }
        return result.isEmpty()? "nothing":result;
    }

    public String findBookByAuthor(String author){
        String result = "";
        for (Book book: books) {
            if(book.getAuthor().contains(author))
                result += book.toString();
        }
        return result.isEmpty()? "nothing": result;
    }

    /*public void insertReader(Reader reader) throws ParseException, IOException{
        System.out.print("Введите ПИБ:");
        String name = input.readLine();
        reader.
        System.out.print("Введите ");
    }*/

}
