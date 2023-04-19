import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // exceptons
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter number");
            int a = scanner.nextInt();
            System.out.println("Enter number");
            int b = scanner.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Enter number");
        } catch (Exception e) {
            System.out.println("Exception catched");
        } finally {
            System.out.println("Finish of calculation");
            scanner.close();
        }
    }
}