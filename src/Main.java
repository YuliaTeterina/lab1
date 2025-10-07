import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        InputValidator validator = new InputValidator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = validator.getValidChoice(scanner);

            if (choice == 0) {
                System.out.println("Выход из программы.");
                break;
            }

            switch (choice) {
                case 1:
                    double x = validator.getValidDouble(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.fraction(x));
                    break;
                case 2:
                    char y = validator.getValidDigitChar(scanner, "Введите цифру от 0 до 9: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.charToNum(y));
                    break;
                case 3:
                    int z = validator.getValidInt(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.is2Digits(z));
                    break;
                case 4:
                    int num = validator.getValidInt(scanner, "Введите число: ");
                    int a = validator.getValidInt(scanner, "Введите первую границу: ");
                    int b = validator.getValidInt(scanner, "Введите вторую границу: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.isInRange(a, b, num));
                    break;
                case 5:
                    int n1 = validator.getValidInt(scanner, "Введите первое число: ");
                    int n2 = validator.getValidInt(scanner, "Введите второе число: ");
                    int n3 = validator.getValidInt(scanner, "Введите третье число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.isEqual(n1, n2, n3));
                    break;
                case 6:
                    int absA = validator.getValidInt(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.abs(absA));
                    break;
                case 7:
                    int is35A = validator.getValidInt(scanner, "Введите число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.is35(is35A));
                    break;
                case 8:
                    int max31 = validator.getValidInt(scanner, "Введите первое число: ");
                    int max32 = validator.getValidInt(scanner, "Введите второе число: ");
                    int max33 = validator.getValidInt(scanner, "Введите третье число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.max3(max31, max32, max33));
                    break;
                case 9:
                    int sum21 = validator.getValidInt(scanner, "Введите первое число: ");
                    int sum22 = validator.getValidInt(scanner, "Введите второе число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.sum2(sum21, sum22));
                    break;
                case 10:
                    int dayA = validator.getValidDayOfWeek(scanner, "Введите число от 1 до 7: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.day(dayA));
                    break;
                case 11:
                    int listNumsA = validator.getValidNonNegativeInt(scanner, "Введите неотрицательное число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.listNums(listNumsA));
                    break;
                case 12:
                    int chetA = validator.getValidNonNegativeInt(scanner, "Введите неотрицательное число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.chet(chetA));
                    break;
                case 13:
                    long numLenA = validator.getValidLong(scanner, "Введите положительное число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.numLen(numLenA));
                    break;
                case 14:
                    int squareA = validator.getValidPositiveInt(scanner, "Введите положительное число: ");
                    System.out.print("Результат: ");
                    solution.square(squareA);
                    break;
                case 15:
                    int triangleA = validator.getValidPositiveInt(scanner, "Введите положительное число: ");
                    System.out.print("Результат: ");
                    solution.rightTriangle(triangleA);
                    break;
                case 16:
                    int arrLen = validator.getValidArrayLength(scanner, "Введите длину массива: ");
                    int[] arr = validator.getValidIntArray(scanner, arrLen, "Вводите числа по одному: ");
                    int arrFind = validator.getValidInt(scanner, "Введите искомое число: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.findFirst(arr, arrFind));
                    break;
                case 17:
                    int arrLen2 = validator.getValidArrayLength(scanner, "Введите длину массива: ");
                    if (arrLen2 == 0) {
                        System.out.println("Ошибка: массив не может быть пустым для этой задачи!");
                        break;
                    }
                    int[] arr2 = validator.getValidIntArray(scanner, arrLen2, "Вводите числа по одному: ");
                    System.out.print("Результат: ");
                    System.out.println(solution.maxAbs(arr2));
                    break;
                case 18:
                    int arrFirstLen = validator.getValidArrayLength(scanner, "Введите длину 1-го массива: ");
                    int[] arrFirst = validator.getValidIntArray(scanner, arrFirstLen, "Вводите числа первого массива по одному: ");
                    int arrSecondLen = validator.getValidArrayLength(scanner, "Введите длину 2-го массива: ");
                    int[] arrSecond = validator.getValidIntArray(scanner, arrSecondLen, "Вводите числа второго массива по одному: ");
                    int pos = validator.getValidInsertPosition(scanner, "Введите позицию вставки: ", arrFirstLen);
                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.add(arrFirst, arrSecond, pos)));
                    break;
                case 19:
                    int arrReverseLen = validator.getValidArrayLength(scanner, "Введите длину массива: ");
                    if (arrReverseLen == 0) {
                        System.out.println("Ошибка: массив не может быть пустым для этой задачи!");
                        break;
                    }
                    int[] arrReverse = validator.getValidIntArray(scanner, arrReverseLen, "Вводите числа по одному: ");
                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.reverseBack(arrReverse)));
                    break;
                case 20:
                    int arrFindAllLen = validator.getValidArrayLength(scanner, "Введите длину массива: ");
                    int[] arrFindAll = validator.getValidIntArray(scanner, arrFindAllLen, "Вводите числа по одному: ");
                    int arrFindAllFind = validator.getValidInt(scanner, "Введите искомое число: ");
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