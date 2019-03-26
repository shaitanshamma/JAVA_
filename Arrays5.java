public class Arrays5 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,6,7,9,11,44,55,22,11};
        int max = arr[0];
        int min = arr [0];
            for(int i = 0; i < arr.length; i++){
                if (max < arr[i]){
                    max=arr[i];
                }
            }
            for(int i = 0; i < arr.length; i++){
                if (min > arr[i]){
                    min = arr[i];
                }
            }
            System.out.println(max);
            System.out.println(min);
    }
 }

