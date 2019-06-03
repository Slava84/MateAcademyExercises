import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {4, 8, -3, 17, 1};
        int[] array2 = {5, -17, 56, 0, 3, 4, 7};
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    public static int[] mergeArrays(int[] a1, int[] a2){
        int[] resultArrays = new  int [a1.length + a2.length];
        System.arraycopy(a1, 0, resultArrays, 0, a1.length);
        System.arraycopy(a2, 0, resultArrays, a1.length, a2.length);
        return sort(resultArrays);
    }

    private static int[] sort(int[] arr){
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]) {
                    int temporary = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temporary;
                }
            }
        }
        return arr;
    }
}
