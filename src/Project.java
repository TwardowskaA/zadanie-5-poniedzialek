import java.util.Scanner;

public class Project {

    public static void main(String[] args) {



    Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int size = scan.nextInt();
        double[] numbers = new double[size];


        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("Podaj liczbę zmiennoprzecinkową");
            double a = scan.nextDouble();
            numbers[i] = a;
        }

            
        }
    }



