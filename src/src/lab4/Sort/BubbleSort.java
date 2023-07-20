package lab4.Sort;

import java.util.Arrays;

public class BubbleSort extends SortAlgorithm implements ArrayPrinter {


    @Override
    public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public int[] sort(int[] array) {
        int[] retArray = array;
        for(int i = 0; i < retArray.length; i++){
            for(int j = 0; j < retArray.length-1; j++){
                if(retArray[j] > retArray[j+1]){
                    int temp = retArray[j+1];
                    retArray[j+1] = retArray[j];
                    retArray[j] = temp;
                }
            }
        }
        return retArray;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }
}
