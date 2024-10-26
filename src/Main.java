import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        //11.3
        // а) Вещественные значения от 0 до 1
        double[] arrayA = new double[15];
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextDouble();
        }

        // б) Вещественные значения (22 < x < 23)
        double[] arrayB = new double[15];
        for (int i = 0; i < arrayB.length; i++) {
            arrayB[i] = 22 + random.nextDouble();
        }

        // в) Вещественные значения (0 < x < 10)
        double[] arrayC = new double[15];
        for (int i = 0; i < arrayC.length; i++) {
            arrayC[i] = random.nextDouble() * 10;
        }

        // г) Вещественные значения (–50 < x < 50)
        double[] arrayD = new double[15];
        for (int i = 0; i < arrayD.length; i++) {
            arrayD[i] = -50 + random.nextDouble() * 100;
        }

        // д) Целые значения от 0 до 10 включительно
        int[] arrayE = new int[15];
        for (int i = 0; i < arrayE.length; i++) {
            arrayE[i] = random.nextInt(11);
        }

        // Вывод массивов
        System.out.println("Массив A: ");
        for (double num : arrayA) {
            System.out.println(num);
        }

        System.out.println("Массив B: ");
        for (double num : arrayB) {
            System.out.println(num);
        }

        System.out.println("Массив C: ");
        for (double num : arrayC) {
            System.out.println(num);
        }

        System.out.println("Массив D: ");
        for (double num : arrayD) {
            System.out.println(num);
        }

        System.out.println("Массив E: ");
        for (int num : arrayE) {
            System.out.println(num);
        }
        //11.18
        //a)
        int[] nnn = new int[]{1, 4, 7, 9, 9, 5};

        for (int i = 0; i < nnn.length; i++) {
            nnn[i] = nnn[i] -= 20;
        }

        System.out.println("число минус 20: " + Arrays.toString(nnn));

        //b)
        int lastelem = nnn[nnn.length - 1];

        for (int i = 0; i < nnn.length; i++) {
            nnn[i] *= lastelem;
        }
        System.out.println("число умноженное на последнее: " + Arrays.toString(nnn));

        // в)
        int b = 23;

        for (int i = 0; i < nnn.length; i++) {
            nnn[i] = nnn[i] + b;
            System.out.println("число + B" + Arrays.toString(nnn));
        }

        // 11.28
        int[] bbb = new int[]{1, 2, -4, 10, -13};
        int sum = 0;
        for (int i = 0; i < bbb.length; i++) {
            sum += bbb[i];
        }
        if (sum >= 0) {
            System.out.println("неотриц число: " + sum);
        } else {
            System.out.println("отриц число: " + sum);
        }

        // 11.32
        int[] masses = new int[]{1, 5, 6, 8, 4, 8, 3, 9, 5, 8, 5, 4, 7, 9, 8, 6, 5, 4, 5, 6, 7, 8, 5, 3, 5, 6, 7, 9, 7};
        int maxmass = 200;
        int totallmass = 0;
        for (int mass : masses) {
            totallmass += mass;
        }
        if (totallmass <= maxmass) {
            System.out.println("не превышает можете ехать : " + totallmass);
        } else {
            System.out.println("превышает уберите несколько ящиков: " + totallmass);
        }
        // 11.43
        int[] osad = {0, 4, 5, 0, 0, 6, 2, 0, 0, 0, 0, 6, 0, 7, 0, 0, 0, 4, 5, 6, 0, 1, 2, 0, 0, 0, 0, 0, 6, 3, 1};

        System.out.println("Дни без осадков:");

        for (int days = 0; days < osad.length; days++) {
            if (osad[days] == 0) {
                System.out.println("День " + (days + 1));
            }
        }
        // 11.45
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println("Элементы на чет мест:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.println(array[i] + " ");
        }
        System.out.println("Элементы на нечет мест:");
        for (int i = 1; i < array.length; i += 2) {
            System.out.println(array[i] + " ");
        }
        // 11.46
        double[] arrays = {-4.0, 9.0, -16.0, 25.0, -1.0, 36.0, 0.0, -49.0};
        for ( int i = 0; i < arrays.length; i++) {
            if (arrays[i] < 0) {
                arrays[i] = Math.abs(arrays[i]);
            }
            if (i % 2 != 0) {
                arrays[i] = Math.sqrt(arrays[i]);
            }
        }
        System.out.println("Измен массив: " + Arrays.toString(arrays));

        // 11.69
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение значение a: ");
        double a = scanner.nextDouble();

        System.out.println("Введите значение b: ");
        double b2 = scanner.nextDouble();

        if (b2 <= a) {
            System.out.println("!!!Ошибочка: b должно быть больше a!!!");
            return;
        }
        double[] aray = {1.5, 2.3, 3.7, 4.0, 5.5, 6.1, 2.9, 4.5, 7.2};
        int count = 0;

        for (double value : aray) {
            if (value > a && value < b2) {
                count++;
            }
        }
        System.out.println("Количество элементов массива, принадлежащих промежутку от " + a + " до " + b2 + ": " + count);

        scanner.close();

        // 11.71
        int [] grades = {5,4,3,2,2,5,4,5,3,2};

        int countfour = 0;
        int countfive = 0;

        for (int grade : grades) {
            if (grade == 4) {
                countfour++;
            } else if (grade == 5) {
                countfive++;
            }

        }
        System.out.println("Всего четверок: " + countfour);
        System.out.println("Всего пятерок: " + countfive);

        // 11.115
        double[] speed = {120, 150, 130, 170, 180, 160, 180, 140, 155, 180,
                125, 145, 155, 170, 160, 155, 180, 175, 190, 165,
                180, 200, 195, 170, 185, 190, 175, 160, 150, 145,
                180, 175, 165, 160, 150, 145, 180, 170, 165, 190,
                195, 200};

        double maxspeed = speed[0];
        int firstindex = -1;
        int lastindex = -1;

        for ( int i= 0; i < speed.length; i++) {
            if (speed[i] > maxspeed) {
                firstindex = i;
                lastindex = i;
            } else {
                lastindex = i;
            }
        }
        System.out.println("макс спид: " + maxspeed);
        System.out.println("номер перв авт: " + firstindex);
        System.out.println("номер посл авт: "  + lastindex);

        double[] prices = {12.5, 15.0, 10.0, 7.5, 20.0, 10.0, 22.5, 7.5, 30.0, 9.0,
                12.0, 18.0, 25.0, 7.5, 10.0, 15.5, 16.0, 9.0, 14.5, 11.0,
                7.5, 18.5, 12.0, 13.0, 10.0, 22.0, 17.5, 8.5, 14.0, 7.5,
                15.0, 11.5, 12.5, 6.0, 9.5, 20.0, 13.5, 8.0, 10.5, 9.0,
                11.0, 6.5, 8.5, 14.5, 19.0, 7.0, 10.0, 16.0, 18.0, 6.0,
                12.5, 15.5, 20.5, 14.0, 8.5, 11.0};

        double minprice = Double.MAX_VALUE;
        int count1 = 0;

        for (double price : prices) {
            if (price < minprice) {
                minprice = price;
                count = 1;
            } else if (price == minprice) {
                count++;
            }
        }
        System.out.println("Минимальная цена: " + minprice);
        System.out.println("Количество самых дешевых книг: " + count);
    }
}


