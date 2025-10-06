import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = InputValidator.getValidChoice(scanner);

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (choice) {
                case 1:
                    double x = InputValidator.getValidDouble(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.fraction(x));
                    break;
                case 2:
                    char y = InputValidator.getValidDigitChar(scanner, "Введите цифру от 0 до 9: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.charToNum(y));
                    break;
                case 3:
                    int z = InputValidator.getValidInt(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.is2Digits(z));
                    break;
                case 4:
                    int num = InputValidator.getValidInt(scanner, "Введите число: ");
                    int a = InputValidator.getValidInt(scanner, "Введите первую границу: ");
                    int b = InputValidator.getValidInt(scanner, "Введите вторую границу: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.isInRange(a, b, num));
                    break;
                case 5:
                    int n1 = InputValidator.getValidInt(scanner, "Введите первое число: ");
                    int n2 = InputValidator.getValidInt(scanner, "Введите второе число: ");
                    int n3 = InputValidator.getValidInt(scanner, "Введите третье число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.isEqual(n1, n2, n3));
                    break;
                case 6:
                    int absA = InputValidator.getValidInt(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.abs(absA));
                    break;
                case 7:
                    int is35A = InputValidator.getValidInt(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.is35(is35A));
                    break;
                case 8:
                    int max31 = InputValidator.getValidInt(scanner, "Введите первое число: ");
                    int max32 = InputValidator.getValidInt(scanner, "Введите второе число: ");
                    int max33 = InputValidator.getValidInt(scanner, "Введите третье число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.max3(max31, max32, max33));
                    break;
                case 9:
                    int sum21 = InputValidator.getValidInt(scanner, "Введите первое число: ");
                    int sum22 = InputValidator.getValidInt(scanner, "Введите второе число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.sum2(sum21, sum22));
                    break;
                case 10:
                    int dayA = InputValidator.getValidDayOfWeek(scanner, "Введите число от 1 до 7: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.day(dayA));
                    break;
                case 11:
                    int listNumsA = InputValidator.getValidNonNegativeInt(scanner, "Введите неотрицательное число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.listNums(listNumsA));
                    break;
                case 12:
                    int chetA = InputValidator.getValidNonNegativeInt(scanner, "Введите неотрицательное число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.chet(chetA));
                    break;
                case 13:
                    long numLenA = InputValidator.getValidLong(scanner, "Введите положительное число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.numLen(numLenA));
                    break;
                case 14:
                    int squareA = InputValidator.getValidPositiveInt(scanner, "Введите положительное число: ");
                    System.out.print("Результат: ");
                    solution.square(squareA);
                    break;
                case 15:
                    int triangleA = InputValidator.getValidPositiveInt(scanner, "Введите положительное число: ");
                    System.out.print("Результат: ");
                    solution.rightTriangle(triangleA);
                    break;
                case 16:
                    int arrLen = InputValidator.getValidArrayLength(scanner, "Введите длину массива: ");
                    int[] arr = InputValidator.getValidIntArray(scanner, arrLen, "Вводите числа по одному: ");
                    int arrFind = InputValidator.getValidInt(scanner, "Введите искомое число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.findFirst(arr, arrFind));
                    break;
                case 17:
                    int arrLen2 = InputValidator.getValidArrayLength(scanner, "Введите длину массива: ");
                    if (arrLen2 == 0) {
                        System.out.println("Ошибка: массив не может быть пустым для этой задачи!");
                        break;
                    }
                    int[] arr2 = InputValidator.getValidIntArray(scanner, arrLen2, "Вводите числа по одному: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.maxAbs(arr2));
                    break;
                case 18:
                    int arrFirstLen = InputValidator.getValidArrayLength(scanner, "Введите длину 1-го массива: ");
                    int[] arrFirst = InputValidator.getValidIntArray(scanner, arrFirstLen, "Вводите числа первого массива по одному: ");
                    int arrSecondLen = InputValidator.getValidArrayLength(scanner, "Введите длину 2-го массива: ");
                    int[] arrSecond = InputValidator.getValidIntArray(scanner, arrSecondLen, "Вводите числа второго массива по одному: ");
                    int pos = InputValidator.getValidInsertPosition(scanner, "Введите позицию вставки: ", arrFirstLen);
                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.add(arrFirst, arrSecond, pos)));
                    break;
                case 19:
                    int arrReverseLen = InputValidator.getValidArrayLength(scanner, "Введите длину массива: ");
                    if (arrReverseLen == 0) {
                        System.out.println("Ошибка: массив не может быть пустым для этой задачи!");
                        break;
                    }
                    int[] arrReverse = InputValidator.getValidIntArray(scanner, arrReverseLen, "Вводите числа по одному: ");
                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.reverseBack(arrReverse)));
                    break;
                case 20:
                    int arrFindAllLen = InputValidator.getValidArrayLength(scanner, "Введите длину массива: ");
                    int[] arrFindAll = InputValidator.getValidIntArray(scanner, arrFindAllLen, "Вводите числа по одному: ");
                    int arrFindAllFind = InputValidator.getValidInt(scanner, "Введите искомое число: ");
                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.findAll(arrFindAll, arrFindAllFind)));
                    break;
                default:
                    System.out.println("Неизвестный номер задачи!");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}