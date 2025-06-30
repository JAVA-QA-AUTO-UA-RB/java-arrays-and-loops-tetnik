import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] secretCode = {7, 14, 28, 56, 112};
        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            System.out.print(" Введи число " + (i + 1) + " : ");
            int userInput = scanner.nextInt();
            if (userInput != secretCode[i]) {
                isCodeCorrect = false;
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }

        System.out.println("Потрапивши у замок, ти бачиш чарівну дошку з числами.Розв'яжи загадку");
        System.out.println("На дошці написано числа: [3, 6, 9, 12, 15, 18, 21, 24, 27, 30]");

        int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30};
        int sum = 0;

        for (int number : magicBoard) {
            sum += number;
        }

        System.out.println("Сума всіх магічних чисел: " + sum);
        System.out.println("Вітаю!Кімната відкрилась!Ти можеш йти далі.");

        System.out.println("Перед тобою з'явився Дракон!Захищайся,активувуй захист!");

        int[] dragonAttacks = {8, 16, 24, 32, 40};
        boolean allEven = true;

        for (int attack : dragonAttacks) {
            if (attack % 2 != 0) {
                allEven = false;
                break;
            }
        }
        if (allEven) {
            System.out.println("Атаки парні! Захист активовано.");
        } else {
            System.out.println("Увага!Непарна атака!");
        }

        System.out.println("Щоб знайти магічний ключ,введи своє улюблене число:");
        int favoriteNumber = scanner.nextInt();
        boolean found = false;

        int[][] allSources = { secretCode, magicBoard, dragonAttacks };

        outerLoop:
        for (int[] source : allSources) {
            for (int number : source) {
                if (number == favoriteNumber) {
                    found = true;
                    break outerLoop;
                }
            }
        }

        if (found) {
            System.out.println("Твій ключ знайдено!Ти можеш пройти далі.");
        } else {
            System.out.println("Треба більше магії...Спробуй ще.");
        }

        scanner.close();

    }
}