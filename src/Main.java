public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int a = 12345;
        byte b = 23;
        short c = 345;
        long d = 123456789;
        float e = 4.5F;
        double f = 5.5;
        System.out.println("Значение переменной a с типом int равно " + a );
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной C с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        double xDouble = 27.12;
        long xLong = 987678965549L;
        float xFloat = 2.786F;
        short xShort = 569;
        int intX = -159;
        short shortX = 27897;
        byte xByte = 67;
        System.out.println(xDouble+ ", " + xLong + ", " + xFloat + ", " + xShort + ", " + intX + ", " + shortX + ", " + xByte);
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int xL = 23;
        int xA = 27;
        int xE = 30;
        int paper = 480;
        int students = xL + xA + xE;
        int xPaper = paper / students;
        System.out.println("На каждого ученика рассчитано " + xPaper + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int a, b, c, d, x;

        x = 16 / 2;
        a = x * 20;
        b = x * 1440;
        c = x * 4320;
        d = x * 43200;

        System.out.println("За 20 минут машина произвела " + a + " штук бутылок");
        System.out.println("За cутки машина произвела " + b + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + c + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + d + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int jars = 120;
        int white = 2;
        int brown = 4;
        int classes = jars / (white + brown);
        int totalWhite = white * classes;
        int totalBrown = brown * classes;

        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite +
                " банов белой краски и " + totalBrown + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");

        int bananasWeight = 5 * 80;
        int milkWeight = 2 * 105;
        int plombirWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        double totalWeightGrams = bananasWeight + milkWeight + plombirWeight + eggsWeight;
        double totalWeightKilo = totalWeightGrams / 1000;
        System.out.println("Общий вес в граммах равен " + totalWeightGrams + ", а общий вес в килограммах равен " + totalWeightKilo);
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int lostWeight = 7 * 1000;
        int daysNeedFirst = lostWeight / 250;
        int daysNeedSecond = lostWeight / 500;
        int avarageValue = (daysNeedFirst + daysNeedSecond) / 2;

        System.out.println("Если спортсмен будет терять 250 грамм в день, ему потребуется " + daysNeedFirst +
                " дней, а если будет терять 500 грамм в день, то ему потребуется " + daysNeedSecond + " дней.");

        System.out.println("В среднем спортсмену понадобиться " + avarageValue + " дней, чтобы добиться результата похудения.");
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaNewSalary = mashaSalary + (mashaSalary * 10) / 100;
        int denisNewSalary = denisSalary + (denisSalary * 10) / 100;
        int kristinaNewSalary = kristinaSalary + (kristinaSalary * 10) / 100;

        int mashaSalaryDifference = (mashaNewSalary * 12) - (mashaSalary * 12);
        int denisSalaryDifference = (denisNewSalary * 12) - (denisSalary * 12);
        int kristinaSalaryDifference = (kristinaNewSalary * 12) - (kristinaSalary * 12);

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей.");
    }
}