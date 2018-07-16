import java.util.Scanner;

public class Project {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj rozmiar tablicy");
        int size = scan.nextInt();
        double[] numbers = new double[size];


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę");
            numbers[i] = scan.nextDouble();


        double sum = 0;

            for (int i1 = 0; i1 < numbers.length; i1++) {
                sum = sum + Math.pow(numbers[i],2);
            }
        }

        System.out.println(sum);

    }

}





