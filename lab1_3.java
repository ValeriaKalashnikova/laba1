import java.util.Scanner;
public class lab1_3 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("x: ");
            int x = sc.nextInt();
            System.out.print("n: ");
            int result = x;
            int n = sc.nextInt();
            for (int i = 1; i < Math.abs(n); i++) {
                result *= x;
            }
            if(n>0){
                System.out.println(result);
            } else {
                System.out.println((double) 1/result);
            }
        }
    }