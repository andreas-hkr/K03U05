import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Hur många procent av Kol-14 återstår efter S år?
        //
        // Formler: n = n0 * e upphöjt till( -lambda * t)
        //          lambda = ln2 / T
        //
        // n0 = 100  (börjar med 100%)
        // t = S
        // T = 5730

        Scanner input = new Scanner(System.in);
        System.out.print("Ange antal år: ");
        int t = input.nextInt();
        double lambda = Math.log(2.0) / 5730;
        double n0 = 100;
        double n = n0 * Math.exp(-lambda * t);

        System.out.println("Efter " + t + " år återstår " + n + "%");
    }
}