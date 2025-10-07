import java.util.Scanner;

public class InputValidator {

    public double getValidDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Ошибка: введите корректное вещественное число!");
                scanner.next();
            }
        }
    }

    public int getValidInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Ошибка: введите корректное целое число!");
                scanner.next();
            }
        }
    }

    public long getValidLong(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            if (scanner.hasNextLong()) {
                return scanner.nextLong();
            } else {
                System.out.println("Ошибка: введите корректное целое число!");
                scanner.next();
            }
        }
    }

    public char getValidDigitChar(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.next();
            if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                return input.charAt(0);
            } else {
                System.out.println("Ошибка: введите одну цифру от 0 до 9!");
            }
        }
    }

    public int getValidPositiveInt(Scanner scanner, String message) {
        while (true) {
            int value = getValidInt(scanner, message);
            if (value > 0) {
                return value;
            } else {
                System.out.println("Ошибка: число должно быть положительным!");
            }
        }
    }

    public int getValidNonNegativeInt(Scanner scanner, String message) {
        while (true) {
            int value = getValidInt(scanner, message);
            if (value >= 0) {
                return value;
            } else {
                System.out.println("Ошибка: число должно быть неотрицательным!");
            }
        }
    }

    public int getValidDayOfWeek(Scanner scanner, String message) {
        while (true) {
            int value = getValidInt(scanner, message);
            if (value >= 1 && value <= 7) {
                return value;
            } else {
                System.out.println("Ошибка: число должно быть от 1 до 7!");
            }
        }
    }

    public int getValidArrayLength(Scanner scanner, String message) {
        while (true) {
            int value = getValidInt(scanner, message);
            if (value >= 0) {
                return value;
            } else {
                System.out.println("Ошибка: длина массива не может быть отрицательной!");
            }
        }
    }

    public int getValidInsertPosition(Scanner scanner, String message, int arrayLength) {
        while (true) {
            int value = getValidInt(scanner, message);
            if (value >= 0 && value <= arrayLength) {
                return value;
            } else {
                System.out.println("Ошибка: позиция вставки должна быть от 0 до " + arrayLength + "!");
            }
        }
    }

    public int[] getValidIntArray(Scanner scanner, int length, String message) {
        int[] array = new int[length];
        System.out.println(message);
        for (int i = 0; i < length; i++) {
            array[i] = getValidInt(scanner, "Элемент " + (i + 1) + ": ");
        }
        return array;
    }

    public int getValidChoice(Scanner scanner) {
        while (true) {
            System.out.print("Введите номер задачи (1-20) или 0 для выхода: ");
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice >= 0 && choice <= 20) {
                    return choice;
                } else {
                    System.out.println("Ошибка: номер задачи должен быть от 1 до 20!");
                }
            } else {
                System.out.println("Ошибка: введите корректный номер задачи!");
                scanner.next();
            }
        }
    }
}