package Lab2;

public class DivideInto5 {
    public static void main(String[] args) {
        int[] arr = new int [99];

        for(int i = 1; i < arr.length; i++){
            arr[i] = i;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i]%5 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
