import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int choice;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер задачи: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Введите число: ");
                    double x;
                    x = scanner.nextDouble();

                    System.out.print("Результат: ");
                    System.out.println(solution.fraction(x));
                    break;
                case 2:
                    System.out.println("Введите цифру от 0 до 9: ");
                    char y;
                    y = scanner.next().charAt(0);

                    System.out.print("Результат: ");
                    System.out.println(solution.charToNum(y));
                    break;
                case 3:
                    System.out.println("Введите число: ");
                    int z;
                    z = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.is2Digits(z));
                    break;
                case 4:
                    System.out.println("Введите число: ");
                    int num = scanner.nextInt();

                    System.out.println("Введите первую границу: ");
                    int a = scanner.nextInt();

                    System.out.println("Введите вторую границу: ");
                    int b = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.isInRange(a, b, num));
                    break;
                case 5:
                    System.out.println("Введите первое число: ");
                    int n1 = scanner.nextInt();

                    System.out.println("Введите второе число: ");
                    int n2 = scanner.nextInt();

                    System.out.println("Введите третье число: ");
                    int n3 = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.isEqual(n1, n2, n3));
                    break;
                case 6:
                    System.out.println("Введите число: ");
                    int absA = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.abs(absA));
                    break;
                case 7:
                    System.out.println("Введите число: ");
                    int is35A = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.is35(is35A));
                    break;
                case 8:
                    System.out.println("Введите первое число: ");
                    int max31 = scanner.nextInt();

                    System.out.println("Введите второе число: ");
                    int max32 = scanner.nextInt();

                    System.out.println("Введите третье число: ");
                    int max33 = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.max3(max31, max32, max33));
                    break;
                case 9:
                    System.out.println("Введите первое число: ");
                    int sum21 = scanner.nextInt();

                    System.out.println("Введите второе число: ");
                    int sum22 = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.sum2(sum21, sum22));
                    break;
                case 10:
                    System.out.println("Введите число: ");
                    int dayA = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.day(dayA));
                    break;
                case 11:
                    System.out.println("Введите число: ");
                    int listNumsA = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.listNums(listNumsA));
                    break;
                case 12:
                    System.out.println("Введите число: ");
                    int chetA = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.chet(chetA));
                    break;
                case 13:
                    System.out.println("Введите число: ");
                    int numLenA = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.numLen(numLenA));
                    break;
                case 14:
                    System.out.println("Введите число: ");
                    int squareA = scanner.nextInt();

                    System.out.print("Результат: ");
                    solution.square(squareA);
                    break;
                case 15:
                    System.out.println("Введите число: ");
                    int triangleA = scanner.nextInt();

                    System.out.print("Результат: ");
                    solution.rightTriangle(triangleA);
                    break;
                case 16:
                    System.out.println("Введите длину массива: ");
                    int arrLen = scanner.nextInt();
                    int[] arr = new int[arrLen];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arrLen; i++) {
                        arr[i] = scanner.nextInt();
                    }

                    System.out.println("Введите искомое число: ");
                    int arrFind = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.findFirst(arr, arrFind));
                    break;
                case 17:
                    System.out.println("Введите длину массива: ");
                    int arrLen2 = scanner.nextInt();
                    int[] arr2 = new int[arrLen2];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arrLen2; i++) {
                        arr2[i] = scanner.nextInt();
                    }

                    System.out.print("Результат: ");
                    System.out.println(solution.maxAbs(arr2));
                    break;
                case 18:
                    System.out.println("Введите длину 1-го массива: ");
                    int arrFirstLen = scanner.nextInt();
                    int[] arrFirst = new int[arrFirstLen];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arrFirstLen; i++) {
                        arrFirst[i] = scanner.nextInt();
                    }

                    System.out.println("Введите длину 2-го массива: ");
                    int arrSecondLen = scanner.nextInt();
                    int[] arrSecond = new int[arrSecondLen];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arrSecondLen; i++) {
                        arrSecond[i] = scanner.nextInt();
                    }

                    System.out.println("Введите позицию вставки: ");
                    int pos = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.add(arrFirst, arrSecond, pos)));
                    break;
                case 19:
                    System.out.println("Введите длину массива: ");
                    int arrReverseLen = scanner.nextInt();
                    int[] arrReverse = new int[arrReverseLen];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arrReverseLen; i++) {
                        arrReverse[i] = scanner.nextInt();
                    }

                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.reverseBack(arrReverse)));
                    break;
                case 20:
                    System.out.println("Введите длину массива: ");
                    int arrFindAllLen = scanner.nextInt();
                    int[] arrFindAll = new int[arrFindAllLen];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arrFindAllLen; i++) {
                        arrFindAll[i] = scanner.nextInt();
                    }

                    System.out.println("Введите искомое число: ");
                    int arrFindAllFind = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.findAll(arrFindAll, arrFindAllFind)));
                    break;
                default:
                    break;
            }
        }
    }
}