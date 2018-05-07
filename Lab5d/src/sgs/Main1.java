package sgs;

import java.util.Scanner;
//Дано рядок з декількох слів. Слова відокремлюються одне від одного
//пробілами або комами. Підрахувати кількість слів, довжина яких менше заданого числа.
public class Main1 {
    public static void main(String[] args) {
        String str = ""; // ввести на англ предложение с пробелами и комами
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        for (String mainString : str.split(" |,")) { // StringBuilder с разделителями пробелом и комой
            if(mainString.length()<number){//проверка, если долгота слова меньше числа, то count + 1
                count=count+1;
            }
        }

        System.out.println("Count = " + count);
    }

}
