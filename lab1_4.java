import java.util.Scanner;
 class lab1_4 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Количество точек: ");
            int dots = sc.nextInt();
            System.out.print("Радиус окружности: ");
            int r = sc.nextInt();
            int dotsInCircle = 0;
            for (int i = 1; i <= dots; i++) {
                System.out.print("X " + i + " точки: ");
                double x = sc.nextDouble();
                System.out.print("Y " + i + " точки: ");
                double y = sc.nextDouble();
                if (x * x + y * y <= r * r) {
                    dotsInCircle++;
                }
            }
            System.out.println(dotsInCircle + " точек попали в окружность");
        }
    }
