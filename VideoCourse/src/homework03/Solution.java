package homework03;

public class Solution {
    public static void main(String[] args) {
        // Вычисление части кода:
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;
        System.out.println("Результат вычисления части кода равен: " + result);

        // Вычисление выражений:
        // Выражение 1
        int a = 5;
        int result1 = a-- - --a + ++a + a++ + a;
        System.out.println("Результат вычисления выражения 1 равен: " + result1);

        // Выражение 2
        int b = 8;
        int result2 = ++b - b++ + ++b - --b;
        System.out.println("Результат вычисления выражения 2 равен: " + result2);
    }
}