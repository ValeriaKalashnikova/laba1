import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class lab2_2 {
        public static boolean check(String[] numbers) {
            int numb[] = new int[3];
            for (int i = 0; i < 3; i++) {
                numb[i] = Integer.parseInt(numbers[i]);
            }
            if (numb[2] >= 1900 && numb[2] <= 9999) {
                if (numb[1] == 4 || numb[1] == 6 || numb[1] == 9 || numb[1] == 11) {
                    if (numb[0] <= 30) return true;
                    else return false;
                }
                else if (numb[1] == 2) {
                    if (numb[2] % 4 == 0) {
                        if (numb[0] <= 29) return true;
                        else return false;
                    }
                    else {
                        if (numb[0] <= 28) return true;
                        else return false;
                    }
                }
                else {
                    if (numb[0] <= 31) return true;
                    else return false;
                }
            }
            else return false;
        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String userIn = in.nextLine();
            Matcher m = Pattern.compile("[^А-Яа-я:\s]+").matcher(userIn);
            m.find();
            String date = m.group();
//        System.out.println(date);
            String numbers[] = date.split("[/]");
            if (numbers[0] == date) {
                System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
            }
            else {
                if (check(numbers)) System.out.println("Введенное выражение является датой");
                else System.out.println("Введенное выражение не является датой");
            }

        }
    }

