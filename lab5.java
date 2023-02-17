import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите дробь или просто /: ");
        String a = in.nextLine();
        Fraction frac;
        if (a.equals("/")){
            frac = Fraction.defolt_fraction();
        } else {
            frac = new Fraction (a);
        }
        System.out.println("Ваша дробь = " + frac);

        System.out.print("Введите первую дробь: ");
        String f1 = in.nextLine();
        Fraction first = new Fraction (f1);
        System.out.println("Ваша дробь = " + first.make_double());
        System.out.print("Введите вторую дробь: ");
        String f2 = in.nextLine();
        Fraction second = new Fraction (f2);
        System.out.println("Ваша дробь = " + second.make_double());
        System.out.println();
        System.out.println(first + " + " + second + " = " + Manipulations.plus(first, second));
        System.out.println(first + " - " + second + " = " + Manipulations.minus(first, second));
        System.out.println(first + " * " + second + " = " + Manipulations.umnoshenie(first, second));
        System.out.println(first + " / " + second + " = " + Manipulations.delenie(first, second));

    }
}

class Fraction {

    private String a;

    public Fraction (String a) throws Exception {
        Pattern no_extra_sign = Pattern.compile("^-?" + "[0-9]+" + "/" + "-?" + "[1-9]+" + "[0-9]*$");
        Matcher ok = no_extra_sign.matcher(a);
        if (ok.find()) {
            this.a = a;
        } else {
            throw new Exception ("Не дробь...");
        }
    }

    public double make_double() {
        String f = String.valueOf(a);

        int slash = f.indexOf("/");
        int length = f.length();

        StringBuilder num1 = new StringBuilder(f);
        num1.delete(slash, length);
        float first = Float.parseFloat(String.valueOf(num1));

        num1 = new StringBuilder(f);
        num1.delete(0, slash+1);
        float second = Float.parseFloat(String.valueOf(num1));

        return (first/second);
    }

    public static Fraction defolt_fraction() throws Exception {
        return new Fraction("1/1");
    }

    public String toString() {
        return a;
    }
}

class Manipulations {

    public static double plus(Fraction first, Fraction second) {
        double a = first.make_double();
        double b = second.make_double();
        return a+b;
    }

    public static double minus (Fraction first, Fraction second) {
        double a = first.make_double();
        double b = second.make_double();
        return a-b;
    }

    public static double umnoshenie (Fraction first, Fraction second) {
        double a = first.make_double();
        double b = second.make_double();
        return a*b;
    }

    public static double delenie (Fraction first, Fraction second) {
        double a = first.make_double();
        double b = second.make_double();
        return a/b;
    }

}