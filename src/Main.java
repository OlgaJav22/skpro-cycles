public class Main {
    public static void main(String[] args) {
        // задача 1
        for (int i = 0; i<=10; i++){
        System.out.println("Итерация цикла " + i);
        }

        //задача 2

        for (int y =10; y>=1; y--) {
            System.out.println("Итерация цикла " + y);
        }

        //задача 3
        int u = 2;
        for (int p = 0; p<17; p+=2) {
            System.out.println("Итерация цикла " + p);
        }

        //задача 4

        for (int x = 10; x>=-10; x--) {
            System.out.println("Интерация цикла " + x);
        }

        // задача 1.2

        for (int n = 1904; n<=2096; n+=4) {
            System.out.println( n + " год является високосным");
        }

        // задача 2.2

        for (int z = 7; z<=98; z+=7) {
            System.out.println(z);
        }

        //задача 3.2

        for (int s = 1; s<=512; s=s*2) {
            System.out.println(s);
        }

        //задача 1.3

        int deposit = 29000;
        int total =0;
        for (int j = 1; j<=12; j++){
            total=total + deposit;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + total + " рублей");
        }

        // задача 2.3

        int bankDeposit = 29000;
        int totalDeposit = 0;
        for (int f = 1; f<=12; f++){
            totalDeposit = totalDeposit + totalDeposit/100;
            totalDeposit = totalDeposit + bankDeposit;
            System.out.println("Месяц " + f + ", сумма накоплений равна " + totalDeposit + " рублей");
        }
    }

}