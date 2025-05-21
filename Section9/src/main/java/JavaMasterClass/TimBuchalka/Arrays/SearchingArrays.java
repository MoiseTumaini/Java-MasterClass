package JavaMasterClass.TimBuchalka.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class SearchingArrays {

    public static void main(String[] args) {
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray); // Arrays.sort(sArray, Collections.reverseOrder()); -> Sorts in descending order
        System.out.println(Arrays.toString(sArray));

        if (Arrays.binarySearch(sArray, "Mark") >= 0){
            System.out.println("Found Mark in the list");
        }
    }
}
