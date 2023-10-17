import java.util.Scanner;

public class object_in_java {
    public static void main(String[] args) {
        //create object for calculator class
        Calculator cal = new Calculator();

        Scanner scan = new Scanner(System.in);

        //Get the first value 
        System.out.println("Enter the first number");
        int a = scan.nextInt();

        //Get the Second value
        System.out.println("Enter the Second number");
        int b = scan.nextInt();

        System.out.println("Addition of Two values is: " + cal.addition(a,b));
        System.out.println("Subtraction of Two values is: " + cal.subtraction(a,b));
        System.out.println("Multiplication of Two values is: " + cal.multipilication(a,b));
        System.out.println("Division of Two values is: " + cal.division(a,b));
        System.out.println("Modules of Two values is: " + cal.mudulos(a,b));
        scan.close();
    }
}
class Calculator {

    public int addition(int a,int b) {
        return a + b;
    }
    public int subtraction(int a,int b) {
        return a - b;
    }
    public int multipilication(int a,int b) {
        return a * b;
    }
    public int division(int a,int b) {
        return a / b;
    }
    public double mudulos(int a,int b) {
        return a % b;
    }
}
