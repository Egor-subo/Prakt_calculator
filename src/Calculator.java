import java.util.Scanner;

public  class Calculator{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второое число");
        int b = scan.nextInt();
        System.out.println("Введите действие:+, -, *, /, %");
        String c = scan.next();
        switch (c){
            case "+":
                System.out.println("Сумма: " + summ(a,b));
                break;

        }

    }
    public static int summ(int a, int b){
        return a + b;
    }
}