package pppp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// valueOf(NumberFormatException), equals
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input =  new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(input.readLine());
        int A6,A7;
        /*A6 = A*A*A*A*A*A;
        A7 = A*A*A*A*A*A*A;
        System.out.println("A^6="+A6);
        System.out.println("A^7="+A7);*/
        try{
            System.out.println("N: " + arifmPr(A) + " B: " + arifmPr(A)*A);
        } catch (NegativeNumberException e) {
            e.printStackTrace();
        }
    }
    public static int arifmPr(int n) throws NegativeNumberException { //генерує власний клас вийняток
        if(n < 0){
            throw new NegativeNumberException("change to positive");
        }
        else{
            int A6 = n*n*n*n*n*n;
            return A6;
        }


    }
}
