import java.util.*;
public class Main {
    public static void main(String[] args) {

        // Program will sum the multipliers of 4 and will stop when the entered value is odd

        Scanner input = new Scanner(System.in);

        int number, sum = 0;

        do {
            System.out.println("Enter a number: ");
            number = input.nextInt();

            if (number % 4 == 0){
                sum += number;
                System.out.println("Sum of multipliers of 4: " + sum);
            }

        }while (number % 2 == 0);
    }
}
