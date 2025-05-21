package JavaMasterClass.TimBuchalka.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * <p> Create a program using arrays that sorts a list of integers in descending order.
 * <ul>
 *     <li> First, create an array of randomly generated integers. </li>
 *     <li> Print the array before you sort it. </li>
 *     <li> And print the array after you sort it. </li>
 *     <li> You can choose to create a new sorted array or just sort the current array. </li>
 * </ul>
 * </p>
 *
 */
public class ArrayChallenge {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] intArray = new Integer[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArray));

    }

    /**
     * This method sorts an array in descending order manuel. Instead of using the collections method
     * @param array
     * @return int[]
     */
    private static int[] sortIntegers(int[] array){

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;

        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}
