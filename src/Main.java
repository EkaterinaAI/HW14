package HW14.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        double result = 0.0;
        String numS = String.valueOf(num);

        for (int i = 0; i < numS.length(); i++) {
            result += Integer.parseInt(String.valueOf(numS.charAt(i)));
        }

        return (result / numS.length()); //todo заменить 0 на корректный результат.
    }
}
