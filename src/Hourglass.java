import java.util.*;

public class Hourglass {

    public static void main (String[]args){
        Scanner scanner= new Scanner(System.in);

            int[][] arr = new int[6][6];

            for (int i = 0; i < 6; i++) {
                String[] arrRowItems = scanner.nextLine().split(" ");

                for (int j = 0; j < 6; j++) {
                    int arrItem = Integer.parseInt(arrRowItems[j]);
                    arr[i][j] = arrItem;
                }
            }
            int maxSum = Integer.min();

            scanner.close();
        }
    }

}
