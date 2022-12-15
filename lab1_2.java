import java.util.*;
public class lab1_2 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("День:");
            int day = sc.nextInt();
            System.out.print("Месяц:");
            int month = sc.nextInt();
            if (month==12|| month==1|| month==2) {
                System.out.println ("Зима");
            }
            if (month==3|| month==4 || month==5) {
                System.out.println ("Весна");
            }
            if (month==6|| month==7 || month==8) {
                System.out.println ("Лето");
            }
            if (month==9|| month ==10 || month==11) {
                System.out.println ("Осень");
            }
        }
    }
