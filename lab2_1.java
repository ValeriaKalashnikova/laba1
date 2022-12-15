import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lab2_1 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String password = in.nextLine();
            boolean flag = false;
            Matcher m1 = Pattern.compile("[0-9]").matcher(password);
            Matcher m2 = Pattern.compile("[A-Z]").matcher(password);
            Matcher m3 = Pattern.compile("[a-z]").matcher(password);
            if (m1.find() && m2.find() && m3.find() && password.length() >= 8) System.out.println("Пароль надежен");
            else System.out.println("Пароль ненадежен. Повторите ввод");
        }
    }
