import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 5.13
        int a = 1;
        int s = 2;
        int d = 3;
        int f = 4;
        int g = 5;
        int h = 6;
        int j = 7;
        int k = 8;
        int l = 9;

        int aa = a * 7;
        int ss = s * 7;
        int dd = d * 7;
        int ff = f * 7;
        int gg = g * 7;
        int hh = h * 7;
        int jj = j * 7;
        int kk = k * 7;
        int ll = l * 7;

        System.out.println("1 * 7 = " + aa);
        System.out.println("2 * 7 = " + ss);
        System.out.println("3 * 7 = " + dd);
        System.out.println("4 * 7 = " + ff);
        System.out.println("5 * 7 = " + gg);
        System.out.println("6 * 7 = " + hh);
        System.out.println("7 * 7 = " + jj);
        System.out.println("8 * 7 = " + kk);
        System.out.println("9 * 7 = " + ll);

        // 5.27
        // A)
    int sum = 0;

    for (int i = 100; i <= 500; i++) {
        sum += i;
        }

        System.out.println("Сумма всех целых чисел от 100 до 500: " + sum);

    // г)

    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите a: ");
    int a3 = scanner.nextInt();

    System.out.print("Введите b: ");
    int b = scanner.nextInt();

    int sum4 = 0;

    for (int i = a; i <= b; i++) {
        sum4 += i;
    }

    System.out.println("Сумма всех целых чисел от " + a3 + " до " + b + ": " + sum4);

    // 5.28
    // a)

    int product = 1;

    for (int i = 8; i <= 15; i++) {
            product *= i;
    }

    System.out.println("Произведение всех целых чисел от 8 до 15: " + product);

    // г)

     Scanner scanner1 = new Scanner(System.in);

     System.out.print("Введите a: ");
     int a5 = scanner.nextInt();

     System.out.print("Введите b: ");
     int b6 = scanner.nextInt();

     if (b6 <= a5) {
     System.out.println("Ошибка: b должно быть больше a.");
     return;
     }

     long product1 = 1;

     for (int i = a; i <= b; i++) {
     product1 *= i;
     }

     System.out.println("Произведение всех целых чисел от " + a5 + " до " + b6 + ": " + product1);

     //5.8

     System.out.printf("%-10s %-10s%n", "Фунты", "Килограммы");
     System.out.println("------------------------");

     for (int pounds5 = 1; pounds5 <= 10; pounds5++) {
         double kilograms = pounds5 * 0.453592; // 1 фунт = 0.453592 кг
         System.out.printf("%-10d %-10.3f%n", pounds5, kilograms);
     }

        //5.72
        double initialDistance = 10;
        double[] distances = new double[10];
        distances[0] = initialDistance;

        // a)
        System.out.println("Пробег лыжника за дни:");
        for (int day = 1; day < 10; day++) {
            distances[day] = distances[day - 1] * 1.1;
            System.out.printf("День %d: %.2f км%n", day + 1, distances[day]);
        }

        // b)
        double totalDistance = 0;
        for (int day = 0; day < 7; day++) {
            totalDistance += distances[day];
        }

        System.out.printf("Суммарный путь за первые 7 дней: %.2f км%n", totalDistance);

        // 5.1
        for (int i = 0; i < 10; i++) {
            System.out.print("20 ");
        }

        // 6.21
        // a)
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Введите n (n > 1): ");
        int n = scanner2.nextInt();

        int a34 = 1, b3 = 1;
        while (b3 <= n) {
            int temp = b3;
            b3 = a + b3;
            a34 = temp;
        }
        System.out.println("Первое число Фибоначчи, большее n: " + b3);

        // b)

        int a55 = 1, b65 = 1;
        int sum65 = 0;

        while (a55 <= 1000) {
            sum65 += a55;
            int temp = b65;
            b65 = a55 + b65;
            a55 = temp;
        }
        System.out.println("Сумма всех чисел Фибоначчи, не превосходящих 1000: " + sum65);

        // 7.1

        for (int i = 100; i <= 200; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // 7.26
        Scanner scanner5 = new Scanner(System.in);
        int count = 0;
        int days = 30; // Предположим, что в месяце 30 дней

        System.out.println("Введите температуры за 30 дней:");

        for (int i = 0; i < days; i++) {
            int temperature = scanner5.nextInt();
            if (temperature < 0) {
                count++;
            }
        }

        System.out.println("Количество дней с температурой ниже 0°C: " + count);

        // 7.56

        Scanner scanner65 = new Scanner(System.in);
        System.out.print("Введите количество городов: ");
        int numberOfCities = scanner65.nextInt();
        int maxDistance = Integer.MIN_VALUE; // Начальное значение для максимального расстояния

        System.out.println("Введите расстояния до городов:");

        for (int i = 0; i < numberOfCities; i++) {
            int distance = scanner.nextInt();
            if (distance > maxDistance) {
                maxDistance = distance;
            }
        }

        System.out.println("Самое удаленное расстояние от Москвы: " + maxDistance + " км");

        // 8.1
        // a)

        for (int i = 0; i < 6; i++) {
            for (int j1 = 0; j < 6; j1++) {
                System.out.print("5 ");
            }
            System.out.println();
        }

        // b)

        for (int i2 = 0; i2 < 4; i2++) {
            for (int j2 = 1; j2 <= 10; j2++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // в)

        for (int i = 0; i < 4; i++) {
            for (int j3 = 41 + (i * 10); j3 <= 50 + (i * 10); j3++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 8.3
        // a)

        for (int i = 1; i <= 5; i++) {
            for (int j4 = 1; j4 <= i; j4++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // b)
        for (int i = 5; i <= 9; i++) {
            for (int j5 = 5; j5 > i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // в)

        for (int i = 1; i <= 5; i++) {
            for (int j6 = 1; j6 <= i; j++) {
                System.out.print((i * 10) + " ");
            }
            System.out.println();
        }

        // г)

        for (int i = 5; i <= 25; i += 5) {
            for (int j7 = 5; j7 > i / 5; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}