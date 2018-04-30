package Lab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ваше имя: ");
        String name = input.readLine();
        System.out.println("Здравствуй, " + name + "!");

        System.out.print("Сколько вам лет? ");
        int age = Integer.parseInt(input.readLine());
        int year = 2018 - age;
        System.out.println("Вы родились в " + --year + " или " + year + " году!");

        float A = 1.0f;
        float d = 1.5f;
        for(int i = 0; i < 20; i++){
            A = A + d;
        }
        System.out.println(A);
    }
}
