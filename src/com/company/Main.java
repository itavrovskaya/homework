package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var a = 5;
        System.out.println(a);
        byte b = 35;
        System.out.println(b);
        short c = 55;
        System.out.println(c);
        int d = 76;
        System.out.println(d);
        long e = 500L;
        System.out.println(e);
        float f = 1.5f;
        System.out.println(f);
        double g = 3.5;
        System.out.println(g);
        int age = 22;
        System.out.println(age);
        boolean isAge = age < 35;
        System.out.println(isAge);
        char h = 33;
        char i = '!';
        System.out.println(h + " = " + i);


        float firstBoxerWeight = (float) 78.2;
        System.out.println("Первый боксер " + firstBoxerWeight + "кг");
        float secondBoxerWeight = (float) 82.7;
        System.out.println("Второй боксер " + secondBoxerWeight + "кг");
        float bothBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + bothBoxersWeight + "кг");
        float weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в весе бойцов " + weightDifference + "кг");

        int bananaWeightGr = 80;
        int milkWeightGr = 105;
        int iceCreamWeightGr = 100;
        int eggWeightGr = 70;
        int bananaWeightTotal = bananaWeightGr * 5;
        int milkWeightTotal = milkWeightGr * 2;
        int iceCreamWeightTotal = iceCreamWeightGr * 2;
        int eggWeightTotal = eggWeightGr * 4;
        int mixWeightGrTotal = bananaWeightTotal + milkWeightTotal + iceCreamWeightTotal + eggWeightTotal;
        System.out.println("Вес завтрака в граммах " + mixWeightGrTotal);
        float mixWeightKg = (float) mixWeightGrTotal / 1000;
        System.out.println("Вес завтрака в кг " + mixWeightKg);

        int weightLossKg = 7;
        int daysFirstDiet = (int) (7 / 0.25);
        System.out.println("Потеря веса по 250 гр в день займет " + daysFirstDiet + " дней");
        int daysSecondDiet = (int) (7 / 0.5);
        System.out.println("Потеря веса по 500 гр в день займет " + daysSecondDiet + " дней");
        int averageWeightLoss = (daysFirstDiet + daysSecondDiet) / 2;
        System.out.println("Среднее количество дней для похудения - " + averageWeightLoss + "день");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mashaYearSalary = mashaSalary * 12;
        int denisYearSalary = denisSalary * 12;
        int kristinaYearSalary = kristinaSalary * 12;
        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * 0.10));
        int mashaNewYearSalary = mashaNewSalary * 12;
        int denisNewSalary = (int) (denisSalary + (denisSalary * 0.10));
        int denisNewYearSalary = denisNewSalary * 12;
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * 0.10));
        int kristinaNewYearSalary = kristinaNewSalary * 12;
        int differenceYearMasha = mashaNewYearSalary - mashaYearSalary;
        int differenceYearDenis = denisNewYearSalary - denisYearSalary;
        int differenceYearKristina = kristinaNewYearSalary - kristinaYearSalary;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + differenceYearMasha + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + differenceYearDenis + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + differenceYearKristina + " рублей.");
    }
}
