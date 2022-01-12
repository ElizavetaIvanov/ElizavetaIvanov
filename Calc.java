import static java.lang.System.*;

public class Calc {
    public Calc() {
    }

    public static void main(String[] args) {
        if(args.length != 3) throw new ArithmeticException();
        if(args[1].length() != 1) throw new ArithmeticException();

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[2]);
        char operation = args[1].charAt(0);

        out.println(calc(x, y, operation));
    }

    public static double calc(double x, double y, char operation){
        switch (operation){
            default: throw  new ArithmeticException("operation");
            case '+' : return  x + y;
            case '-' : return  x - y;
            case '*' : return  x * y;
            case '/' : return  x / y;
        }
    }
}