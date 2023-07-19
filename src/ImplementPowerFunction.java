import java.util.Scanner;

public class ImplementPowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = scanner.nextInt();
        System.out.println("Enter the power : ");
        int power = scanner.nextInt();
        System.out.println("Enter the modulus : ");
        int modulus = scanner.nextInt();
        int output = findImplementPowerFunction(number, power, modulus);
        System.out.println("Output : " + output);
    }

    private static int findImplementPowerFunction(int number, int power, int modulus) {
        if(power == 1){
            return number % modulus;
        }
        return findImplementPowerFunction(number, power - 1, modulus) * number % modulus;
    }
}
