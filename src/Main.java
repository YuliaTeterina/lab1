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
                    System.out.println(solution.islnRange(a,b,num));
                    break;
                case 5:
                    System.out.println("Введите первое число: ");
                    int n1 = scanner.nextInt();

                    System.out.println("Введите второе число: ");
                    int n2 = scanner.nextInt();

                    System.out.println("Введите третье число: ");
                    int n3 = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.isEqual(n1,n2,n3));
                    break;
                case 6:
                    System.out.println("Введите число: ");
                    int abs_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.abs(abs_a));
                case 7:
                    System.out.println("Введите число: ");
                    int is35_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.is35(is35_a));
                case 8:
                    System.out.println("Введите первое число: ");
                    int max3_1 = scanner.nextInt();

                    System.out.println("Введите второе число: ");
                    int max3_2 = scanner.nextInt();

                    System.out.println("Введите третье число: ");
                    int max3_3 = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.max3(max3_1, max3_2, max3_3));
                case 9:
                    System.out.println("Введите первое число: ");
                    int sum2_1 = scanner.nextInt();

                    System.out.println("Введите второе число: ");
                    int sum2_2 = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.sum2(sum2_1, sum2_2));
                case 10:
                    System.out.println("Введите число: ");
                    int day_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.day(day_a));
                case 11:
                    System.out.println("Введите число: ");
                    int listNums_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.listNums(listNums_a));
                case 12:
                    System.out.println("Введите число: ");
                    int chet_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.chet(chet_a));
                case 13:
                    System.out.println("Введите число: ");
                    int numLen_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.numLen(numLen_a));
                case 14:
                    System.out.println("Введите число: ");
                    int square_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    solution.square(square_a);
                case 15:
                    System.out.println("Введите число: ");
                    int triangle_a = scanner.nextInt();

                    System.out.print("Результат: ");
                    solution.rightTriangle(triangle_a);
                case 16:
                    System.out.println("Введите длину массива: ");
                    int arr_len = scanner.nextInt();
                    int[] arr = new int[arr_len];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arr_len; i++){
                        arr[i] = scanner.nextInt();
                    }

                    System.out.println("Введите искомое число: ");
                    int arr_find = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(solution.findFirst(arr, arr_find));
                case 17:
                    System.out.println("Введите длину массива: ");
                    int arr_len2 = scanner.nextInt();
                    int[] arr2 = new int[arr_len2];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arr_len2; i++){
                        arr2[i] = scanner.nextInt();
                    }

                    System.out.print("Результат: ");
                    System.out.println(solution.maxAbs(arr2));
                case 18:
                    System.out.println("Введите длину 1-го массива: ");
                    int arr_first_len = scanner.nextInt();
                    int[] arr_first = new int[arr_first_len];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arr_first_len; i++){
                        arr_first[i] = scanner.nextInt();
                    }

                    System.out.println("Введите длину 2-го массива: ");
                    int arr_second_len = scanner.nextInt();
                    int[] arr_second = new int[arr_second_len];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arr_second_len; i++){
                        arr_second[i] = scanner.nextInt();
                    }

                    System.out.println("Введите позицию вставки: ");
                    int pos = scanner.nextInt();

                    System.out.print("Результат: ");
                    /*int[] arr_res = solution.add(arr_first, arr_second, pos);
                    for(int i=0; i < arr_first_len + arr_second_len; i++){
                        System.out.print(arr_res[i]);
                        System.out.print(" ");
                    }
                    System.out.println();*/
                    System.out.println(Arrays.toString(solution.add(arr_first, arr_second, pos)));
                case 19:
                    System.out.println("Введите длину массива: ");
                    int arr_reverse_len = scanner.nextInt();
                    int[] arr_reverse = new int[arr_reverse_len];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arr_reverse_len; i++){
                        arr_reverse[i] = scanner.nextInt();
                    }

                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.reverseBack(arr_reverse)));
                case 20:
                    System.out.println("Введите длину массива: ");
                    int arr_findAll_len = scanner.nextInt();
                    int[] arr_findAll = new int[arr_findAll_len];

                    System.out.println("Вводите числа по одному: ");
                    for (int i = 0; i < arr_findAll_len; i++){
                        arr_findAll[i] = scanner.nextInt();
                    }

                    System.out.println("Введите искомое число: ");
                    int arr_findAll_find = scanner.nextInt();

                    System.out.print("Результат: ");
                    System.out.println(Arrays.toString(solution.findAll(arr_findAll, arr_findAll_find)));
                default:
                    break;
            }
        }
    }
}