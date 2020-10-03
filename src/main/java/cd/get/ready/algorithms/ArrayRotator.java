package cd.get.ready.algorithms;

public class ArrayRotator {


    public int[] rotateLeft(int[] arr, int n) {
        //rotate left the number of times given by int n
        for(int i  = 0; i  < n;  i++) {
            arr = shift(arr);
        }
        return arr;
    }

    private int[] shift(int[] myArray){
        int size = myArray.length;
        int tempZero = myArray[0];

        for(int i = 0; i < size-1;  i++){ //loop through the array
            myArray[i] = myArray[i+1];
        }
        myArray[size-1] = tempZero;
        return myArray;
    }
}
