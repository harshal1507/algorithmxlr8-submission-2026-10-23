import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Write your solution here.
        // Print each answer on its own line: "FizzBuzz", "Fizz", "Buzz", or the number.
        System.out.println(mostOptimised(n));
    }

 
    // not scalable
    public static List<String> bruteForce(int n){
        List<String> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(i%15 == 0){
                result.add("FizzBuzz");
            }else if(i%5 == 0){
                result.add("Buzz");
            }else if(i%3 == 0){
                result.add("Fizz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    // scalable
    public static List<String> optimised(int n){
        List<String> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            StringBuilder stb = new StringBuilder();

            if(i%3 == 0){
                stb.append("Fizz");
            }
            if(i%5 == 0){
                stb.append("Buzz");
            }

            result.add(stb.length()>0 ? stb.toString() : String.valueOf(i));
        }
        return result;
    }

    // without modulo operator
    public static List<String> mostOptimised(int n){
        int fizzCounter = 0;
        int buzzCounter = 0;
        List<String> result = new ArrayList<>();

        for(int i=1; i<=n; i++){
            fizzCounter++;
            buzzCounter++;
            StringBuilder stb = new StringBuilder();

            if(fizzCounter == 3){
                stb.append("Fizz");
                fizzCounter = 0;
            }
            if(buzzCounter == 5){
                stb.append("Buzz");
                buzzCounter = 0;
            }

            result.add(stb.length()>0 ? stb.toString() : String.valueOf(i));
        }
        return result;
    }
}
