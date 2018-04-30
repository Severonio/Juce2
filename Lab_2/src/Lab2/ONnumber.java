package Lab2;

public class ONnumber {
    public static void main(String[] args) {
        int[][] array = {{-1, 1, -1,}, {1, -1, 1}, {-1, 1, -1}};
        int optional = 0;
        int negative = 0;

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i][j] > 0) optional++;
                if(array[i][j] < 0) negative++;
            }
        }
        System.out.println("Optional = " + optional + ", negative = " + negative);

    }
}
