class CountingSort{  
    int getMax(int[] arr) {
        int arr_size = arr.length;   
        int max = arr[0];

        for(int i = 1; i<arr_size; i++) {  
            if(arr[i] > max)  
                max = arr[i];  
        }

        //maximum element from the array 
        return max; 
    }  
      
    void countSort(int[] arr) {  
        int arr_size = arr.length; 
        int[] output = new int [arr_size + 1];  
        int max = getMax(arr);  
        
        // create count array with size [max+1]
        // and initialize count array with all zeros
        int[] count = new int [max+1];  
        for (int i = 0; i <= max; ++i) {  
            count[i] = 0;   
        }  
            
        for (int i = 0; i < arr_size; i++) {  
            count[arr[i]]++;  
        }  
        
        // find cumulative frequency
        for(int i = 1; i<=max; i++) {
            count[i] += count[i-1];
        }  
        
        for (int i = arr_size - 1; i >= 0; i--) {  
            output[count[arr[i]] - 1] = arr[i];  
            count[arr[i]]--;
        }  
        
        // store the sorted elements into main array
        for(int i = 0; i<arr_size; i++) {  
            arr[i] = output[i];   
        }  
    }  
      
    /* Function to print the array elements */  
    void printArray(int arr[])  
    {  
        int arr_size = arr.length;

        for (int i = 0; i < arr_size; i++) { 
            System.out.print(arr[i] + " ");
        }  
    }  
      
    public static void main(String args[])  
    {  
        int arr[] = { 12, 45, 32, 55, 9, 39, 81, 23, 75, 67 };

        CountingSort countingSort = new CountingSort();  

        System.out.print("\nBefore sorting array elements are - ");  
        countingSort.printArray(arr);  

        countingSort.countSort(arr);  

        System.out.print("\nAfter sorting array elements are - ");  
        countingSort.printArray(arr);
    }  
} 