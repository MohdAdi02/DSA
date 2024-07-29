public class BubbleSort {
    public  void bubbleShortAlgorithm(int []A, int n){
        boolean swapped;
        int temp;
        int i;
        int j;
        for( i = 0; i<n-1; i++){
            swapped = false;

            for( j =0; j<n-i-1; j++){
                if(A[j] > A[j+1]){

                    temp = A[j];
                    A[j]=A[j+1];
                    A[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
    }
    public  void  print(int []A, int n){
        for(int i = 0; i <n; i++){
            System.out.print(A[i] +" ");
            System.out.println();
        }

    }

}
