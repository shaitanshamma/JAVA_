public class Arrays7 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        replace(array, -2);
    }

    public static void replace(int[] arr, int n) {
        if(n>=0){
        for (int i = 0; i < arr.length; i++) {
            if (i + n < arr.length) {
                arr[i] = arr[n + i];
            } else if (i + n >= arr.length) {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
            }
        }else {
            for (int i = (arr.length-1);i>0; i--) {
                if ((i + n < 0)) {
                  arr[i]= 0;
                    System.out.print(arr[i]);
                } else  {
                     arr[i] = arr[i+n];
                }
                System.out.print(arr[i]);
            }
        }
    }
}
