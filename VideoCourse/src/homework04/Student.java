package homework04;

// Создаем класс и объявляем переменные объекта
public class Student {
    int studentID;
    String studentName;
    String studentSurname;
    int yearOfStudy;
    double mathAverageMark;
    double economicsAverageMark;
    double foreignLanguageAverageMark;
}

// Создаем класс для создания объектов
class StudentTest {
    public static void main(String[] args) {

        // Создаём новый объект типа Student и инициализируем переменные объекта
        // Первый студент
        Student student1 = new Student();
        student1.studentID = 857634;
        student1.studentName = "Dmitrii";
        student1.studentSurname = "Belikhin";
        student1.yearOfStudy = 4;
        student1.mathAverageMark = 4.8;
        student1.economicsAverageMark = 4.7;
        student1.foreignLanguageAverageMark = 5.0;

        // Второй студент
        Student student2 = new Student();
        student2.studentID = 837273;
        student2.studentName = "Petr";
        student2.studentSurname = "Petrov";
        student2.yearOfStudy = 4;
        student2.mathAverageMark = 4.9;
        student2.economicsAverageMark = 4.8;
        student2.foreignLanguageAverageMark = 4.6;

        // Третий студент
        Student student3 = new Student();
        student3.studentID = 936374;
        student3.studentName = "Alexey";
        student3.studentSurname = "Egorov";
        student3.yearOfStudy = 3;
        student3.mathAverageMark = 3.8;
        student3.economicsAverageMark = 4.3;
        student3.foreignLanguageAverageMark = 4.0;

        // Выведем среднюю арифметическую оценку по каждому студенту, учитывая 3 предмета:
        System.out.println("Средняя оценка студентов:");
        System.out.println("Студент " + student1.studentName + " " + student1.studentSurname
                + " (студенческий билет № " + student1.studentID + ", " + student1.yearOfStudy + " курс), средняя оценка равна "
                + (student1.mathAverageMark + student1.economicsAverageMark + student1.foreignLanguageAverageMark) / 3);
        System.out.println("Студент " + student2.studentName + " " + student2.studentSurname
                + " (студенческий билет № " + student2.studentID + ", " + student2.yearOfStudy + " курс), средняя оценка равна "
                + (student2.mathAverageMark + student2.economicsAverageMark + student2.foreignLanguageAverageMark) / 3);
        System.out.println("Студент " + student3.studentName + " " + student3.studentSurname
                + " (студенческий билет № " + student3.studentID + ", " + student3.yearOfStudy + " курс), средняя оценка равна "
                + (student3.mathAverageMark + student3.economicsAverageMark + student3.foreignLanguageAverageMark) / 3);
    }
}