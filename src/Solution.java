public class Solution {
    public double fraction(double x) {
        return x - (int)x;
    }

    public int charToNum(char x){
        return (int)x - 48;
    }

    public boolean is2Digits(int x){
        if ((x > 9 && x < 100) || (x < -9 && x > -100)){
            return true;
        }
        else {
            return false;
        }
    }

    public  boolean islnRange(int a, int b, int num){
        if (a > b){
            if (num <= a && num >= b){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            if (num <= b && num >= a){
                return true;
            }
            else {
                return false;
            }
        }
    }

    public boolean isEqual(int a, int b, int c){
        if (a == b && b == c){
            return true;
        }
        else{
            return false;
        }
    }

    public int abs(int x){
        if (x >= 0){
            return x;
        }
        else{
            return -x;
        }
    }

    public boolean is35(int x){
        if ((x % 3) * (x % 5) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int max3(int x, int y, int z){
        if ((x > y) && (x > z)) {
            return x;
        }
        if ((y > x) && (y > z)) {
            return y;
        }
        return z;
    }

    public int sum2(int x, int y){
        int s = x + y;
        if ((s < 20) && (s > 9)){
            return 20;
        }
        return s;
    }

    public String day(int x){
        switch(x){
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
        }
        return "это не день недели";
    }

    public String listNums(int x){
        String s = "";
        for (int i = 0; i <= x; i++){
            s += Integer.toString(i);
            s += " ";
        }
        return s;
    }

    public String chet(int x){
        String s = "";
        for (int i = 0; i <= x; i = i + 2){
            s += Integer.toString(i);
            s += " ";
        }
        return s;
    }

    public int numLen(long x){
        int len = 0;
        while (x > 0){
            x = x / 10;
            len++;
        }
        return len;
    }

    public void square(int x){
        for (int i = 0; i < x; i++){
            String cur_s = "";
            for (int j =0; j < x; j++){
                cur_s += "*";
            }
            System.out.println(cur_s);
        }
    }

    public void rightTriangle(int x){
        for (int i = 0; i < x; i++){
            String cur_s = "";
            for (int j =0; j < x - i - 1; j++){
                cur_s += " ";
            }
            for (int j = 0; j < i + 1; j++){
                cur_s += "*";
            }
            System.out.println(cur_s);
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i =0; i < arr.length; i++){
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public int maxAbs(int[] arr){
        int cur_max = arr[0];
        for (int i=1; i < arr.length; i++){
            if (abs(cur_max) < abs(arr[i]))
                cur_max = arr[i];
        }
        return cur_max;
    }

    public int[] add(int[] arr, int[] ins, int pos){
        int[] res = new int[arr.length + ins.length];
        for(int i = 0; i < pos; i++){
            res[i] = arr[i];
        }
        for(int i = 0; i < ins.length; i++){
            res[pos + i] = ins[i];
        }
        for(int i = 0; i < arr.length - pos; i++){
            res[pos + ins.length + i] = arr[pos + i];
        }
        return res;
    }

    public int[] reverseBack(int[] arr){
        int[] res = new int[arr.length];
        for (int i=arr.length-1; i>= 0; i--){
            res[arr.length - 1 - i] = arr[i];
        }
        return res;
    }

    public int[] findAll(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == x)
                count++;
        }
        int[] res_arr = new int[count];
        int cur_count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == x){
                res_arr[cur_count] = i;
                cur_count++;
            }
        return res_arr;
    }
}