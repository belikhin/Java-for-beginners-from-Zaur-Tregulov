package homework02;

public class Solution {
    public static void main (String [] args) {

        // Создание переменных всех целочисленных типов:
        // Запись переменных типа byte в разных системах счисления
        byte b1 = 12;       // Запись числа 12 в 10-ричной системе счисления
        byte b2 = 0b1100;   // Запись числа 12 в 2-ичной системе счисления
        byte b3 = 014;      // Запись числа 12 в 8-ричной системе счисления
        byte b4 = 0xC;      // Запись числа 12 в 16-ричной системе счисления

        // Запись переменных типа short в разных системах счисления
        short s1 = 1300;            // Запись числа 1300 в 10-ричной системе счисления
        short s2 = 0b10100010100;   // Запись числа 1300 в 2-ичной системе счисления
        short s3 = 02424;           // Запись числа 1300 в 8-ричной системе счисления
        short s4 = 0x514;           // Запись числа 1300 в 16-ричной системе счисления

        // Запись переменных типа int в разных системах счисления
        int i1 = 0;     // Запись числа 0 в 10-ричной системе счисления
        int i2 = 0b0;   // Запись числа 0 в 2-ичной системе счисления
        int i3 = 00;    // Запись числа 0 в 8-ричной системе счисления
        int i4 = 0x0;   // Запись числа 0 в 16-ричной системе счисления

        // Запись переменных типа long в разных системах счисления
        long l1 = 123456789L;                       // Запись числа 123456789 в 10-ричной системе счисления
        long l2 = 0b111010110111100110100010101L;   // Запись числа 123456789 в 2-ичной системе счисления
        long l3 = 0726746425L;                      // Запись числа 123456789 в 8-ричной системе счисления
        long l4 = 0x75BCD15L;                       // Запись числа 123456789 в 16-ричной системе счисления

        // Вывод значений целочисленных переменных на экран
        System.out.println("Вывод значений переменных типа byte:");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);

        System.out.println();

        System.out.println("Вывод значений переменных типа short:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        System.out.println();

        System.out.println("Вывод значений переменных типа int:");
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

        System.out.println();

        System.out.println("Вывод значений переменных типа long:");
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("l3 = " + l3);
        System.out.println("l4 = " + l4);

        System.out.println();

        // Создание вещественных переменных всех типов:
        // Запись переменных типа float
        float f1 = 42.0F;
        float f2 = 2.718F;

        // Запись переменных типа double
        double d1 = 157.0;
        double d2 = 19.0;

        // Создание переменных логического типа:
        // Запись переменных типа boolean
        boolean bool1 = true;
        boolean bool2 = false;

        // Вывод значений вещественных переменных на экран
        System.out.println("Вывод значений переменных типа float:");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        System.out.println();

        System.out.println("Вывод значений переменных типа double:");
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);

        System.out.println();

        // Вывод значений переменных логического типа на экран
        System.out.println("Вывод значений переменных типа boolean:");
        System.out.println("bool1 = " + bool1);
        System.out.println("bool2 = " + bool2);

        System.out.println();

        // Создание переменных символьного типа:
        // Запись переменных типа char
        char c1 = 'Ї';
        char c2 = 1031;       // 10-ричное значение символа Ї из таблицы символов Юникода
        char c3 = '\u0407'; // 16-ричное значение символа Ї из таблицы символов Юникода

        // Вывод значений переменных символьного типа на экран
        System.out.println("Вывод значений переменных типа char:");
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}