public class BubbleSort {
    public void bubbleShortAlgorithm(int []A, int n){
        boolean swapped;
        int temp;
        for(int i = 0; i<n-1; i++){
            swapped = false;
            for(int j =0; j<n-i-1; j++){
                if(A[j] > A[j++]){
                    temp = A[j];
                    A[j]=A[j++];
                    A[j++] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
                break;
        }
    }
    public void  print(int A[], int n){
        for(int i = 0; i <n; i++){
            System.out.print(A[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []A={10,30,50,23,12,15};
        int n = A.length;
        BubbleSort bs = new BubbleSort();
        bs.bubbleShortAlgorithm(A,n);
        bs.print(A,n);
    }
}
