public class MergeSortTest {
    public static void main (String[] args){

        int [] array = new int [5];
        array [0] = 4 ;
        array [1] = 2 ;
        array [2] = 5 ;
        array [3] = 3 ;
        array [4] = 1 ;
        System.out.println("given:");
        displayArray(array);
        mergeSort(array,  array.length);
        System.out.println("\nsorted:");
        displayArray(array);
        


    }

public static void merge (
    int [] array , int [] left , int [] right, int lsize, int rsize){

    int i = 0, j =0 , k=0; 
    while (i<lsize& j<rsize){
        if (left[i]<= right[j]){
            array[k] = left[i];
            i++;
        }else {
            array[k] = right[j];
            j++;
        }
        k++;
    }
    while (i<lsize){
        array[k]= left [i];
        i++;
        k++;
    }
    while (j<rsize){
        array[k]=right[j];
        j++;
        k++;
    }
}

public static void displayArray (int [] array){
    for (int i=0; i<array.length; i++){
        System.out.print(array[i]+ " ");
    }
}

public static void mergeSort (int [] array, int size){
    if (size <2){
        return; 
    }
    int mid = size/2;
    int [] left = new int [mid];
    int [] right = new int [size - mid];
    
    for (int i=0; i<mid ;i++){
        left [i]=array[i];
    }
    for (int i=mid; i<size ; i++){
        right[i-(mid)] = array[i];
    }
    mergeSort(left ,left.length);
    mergeSort(right ,right.length);
    merge(array, left, right, left.length, right.length);
}

}
