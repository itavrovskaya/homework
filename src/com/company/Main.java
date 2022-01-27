package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var apple = 5;
        System.out.println(apple);
        byte bananas = 35;
        System.out.println(bananas);
        short meat = 55;
        System.out.println(meat);
        int vegetables = 76;
        System.out.println(vegetables);
        long dogs = 500;
        System.out.println(dogs);
        float box = 1.5f;
        System.out.println(box);
        double sock = 3.5;
        System.out.println(sock);

        float boxerOne = (float) 78.2;
        System.out.println("Первый боксер " + boxerOne + "кг");
        float boxerTwo = (float) 82.7;
        System.out.println("Второй боксер " + boxerTwo + "кг");
        float bothBoxers = boxerOne + boxerTwo;
        System.out.println("Общий вес боксеров " + bothBoxers + "кг");
        float weightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов " + weightDifference + "кг");

        int banana = 80;
        int milk = 105;
        int iceCream = 100;
        int egg = 70;
        banana = banana * 5;
        milk = milk * 2;
        iceCream = iceCream * 2;
        egg = egg * 4;
        int mix = banana + milk + iceCream + egg;
        System.out.println("Вес завтрака в граммах " + mix);
        float kg = (float) mix / 1000;
        System.out.println("Вес завтрака в кг " + kg);

        int weightLoss = 7;
        int daysOne = (int) (7 / 0.25);
        System.out.println("Потеря веса по 250 гр в день займет " + daysOne + " дней");
        int daysTwo = (int) (7 / 0.5);
        System.out.println("Потеря веса по 500 гр в день займет " + daysTwo + " дней");
        int average = (daysOne + daysTwo) / 2;
        System.out.println("Среднее количество дней для похудения - " + average + "день");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        int mashaNew = (int) (masha + (masha * 0.10));
        int mashaNewYear = mashaNew * 12;
        int denisNew = (int) (denis + (denis * 0.10));
        int denisNewYear = denisNew * 12;
        int kristinaNew = (int) (kristina + (kristina * 0.10));
        int kristinaNewYear = kristinaNew * 12;
        int differenceYM = mashaNewYear - mashaYear;
        int differenceYD = denisNewYear - denisYear;
        int differenceYK = kristinaNewYear - kristinaYear;
        System.out.println("Маша теперь получает " + mashaNew + " рублей. Годовой доход вырос на " + differenceYM + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей. Годовой доход вырос на " + differenceYD + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей. Годовой доход вырос на " + differenceYK + " рублей.");
    }
}
