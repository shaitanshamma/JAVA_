public class Arrays6 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2};
        check(arr);
    }

    public static void check(int[] arr) {
        int summ = 0;
        int summ2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            summ += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            summ2 += arr[i];
        }
        if (summ == summ2) {
            System.out.println("Сумма двух половин массива равна!");
        } else {
            System.out.println("Сумма двух половин массива не равна!");
        }

    }
}

