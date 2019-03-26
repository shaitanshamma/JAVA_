public class Arrays {
    public static void main(String[] args) {
        int [] array1 = {1,0,0,1,0,0,1,1,0,1};
        printArray(array1);
        for(int i = 0; i<array1.length; i++){
            if (array1[i]==0){
                array1[i] = 1;
            } else array1[i] = 0;
        } System.out.println();
        printArray(array1);
    }

    public static void printArray(int [] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}