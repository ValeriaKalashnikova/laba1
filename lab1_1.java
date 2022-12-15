import java.util.*;
public class lab1_1 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);

            System.out.print("День рождения: ");
            int birthDay = sc.nextInt();

            System.out.print("Месяц рождения: ");
            int birthMonth = sc.nextInt();

            System.out.print("Год рождения: ");
            int birthYear = sc.nextInt();

            int currentDay = 17;
            int currentMonth = 11;
            int currentYear = 2022;

            int daysLeft, monthLeft, yearsLeft;

            yearsLeft = currentYear - birthYear;
            if (currentMonth < birthMonth || (birthMonth == currentMonth && birthDay < currentDay)) yearsLeft--;

            boolean isCurrentDayLower = false;
            if (currentDay >= birthDay) {
                daysLeft = currentDay - birthDay;
            } else {
                isCurrentDayLower = true;
                daysLeft = 30 - (birthDay - currentDay);
            }

            int subtractionOfMonth = Math.abs(currentMonth - birthMonth);
            if ((birthMonth == currentMonth && birthDay > currentDay) || birthMonth > currentMonth) {
                monthLeft = 12 - subtractionOfMonth;
            } else {
                monthLeft = subtractionOfMonth;
            }

            if (isCurrentDayLower) monthLeft--;


            System.out.println(yearsLeft + " лет, " + monthLeft + " месяцев и " + daysLeft + " дней");

        }
    }
