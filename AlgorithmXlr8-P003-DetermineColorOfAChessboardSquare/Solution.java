import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coordinates = sc.next();

        // Write your solution here.
        // Print "White" or "Black".
        System.out.println(mostOptimised(coordinates));
    }

    public static String bruteForce(String coordinates){

        String[][] chessBoard = new String[8][8];
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                chessBoard[i][j] = ((i+j) % 2 == 0) ? "Black" : "White"; 
            }
        }

        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '1';

        return chessBoard[x][y];
    }

    public static String optimised(String coordinates){
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '1';

        return (x + y) % 2 == 0 ? "Black" : "White";
    }

    public static String optimisedv2(String coordinates){
        return (coordinates.charAt(0) + coordinates.charAt(1)) % 2 == 0 ? "Black" : "White";
    }

    public static String mostOptimised(String coordinates){
        return ((coordinates.charAt(0) ^ coordinates.charAt(1)) & 1) == 0 ? "Black" : "White";
    }
}
