import java.util.Arrays;

public class MergeTwoArraysApp {
    public static void main(String[] args) {
        int[] array1 = {4, 8, 10};
        int[] array2 = {5, 7, 9};
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }

    private static int[] mergeArrays(int[] firstArr, int[] secondArr) {
        int[] resultArr = new int[firstArr.length + secondArr.length];
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < resultArr.length; i++) {
            if (index1 == firstArr.length) {
                resultArr[i] = secondArr[index2];
                index2++;
            } else if (index2 == secondArr.length) {
                resultArr[i] = firstArr[index1];
                index1++;
            }
            if (index1 < firstArr.length && index2 < secondArr.length) {
                if (firstArr[index1] < secondArr[index2]) {
                    resultArr[i] = firstArr[index1];
                    index1++;
                } else {
                    resultArr[i] = secondArr[index2];
                    index2++;
                }
            }
        }
        return resultArr;
    }
}

