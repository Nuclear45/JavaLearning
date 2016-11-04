package selfProject.calc;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculator {
    public static void main(String args[]) throws Exception
    {

        //Calculation calc = new Calculation();
    }
}
class Calculation
{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int first;
    private int second;
    private String action;

    Calculation() throws Exception
    {
        first = Integer.parseInt(reader.readLine());
        action = reader.readLine();
        second = Integer.parseInt(reader.readLine());
        if (action.equals("+"))
            addition(first,second);
        if (action.equals("-"))
            subtraction(first,second);
        if (action.equals("*"))
            multiplication(first,second);
        if (action.equals("/")){
            try {
                division(first,second);}
            catch (ArithmeticException zero){
                System.out.println("Недопустимая операция: деление на нуль.");
            }
        }

    }

    private static void addition(int a, int b){
        System.out.print(a + b);
    }

    private static void subtraction(int a, int b){
        System.out.print(a - b);
    }

    private static void multiplication(int a, int b){
        System.out.print(a * b);
    }

    private static void division(int a, int b){System.out.print(a / b);}


}