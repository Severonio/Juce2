package sgs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//Написати програму, що зчитує з клавіатури текст до слова «end». Відсортувати введені слова за алфавітом.
public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Scanner input = new Scanner(System.in);
        String mainString = "";
        System.out.println("End to end:" );
        while(!mainString.equals("end")){ // если = end заканчивается цикл
            mainString = input.readLine();
            System.out.println(mainString);
        }

    }
}
