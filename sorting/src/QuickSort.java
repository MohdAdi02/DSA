public class QuickSort {
     public int partition(int []A, int low, int high) {
         int pivot = A[low];
         int start = low;
         int end = high;

         while (start < end) {


             while (A[start] <= pivot) {
                 start++;
             }
             while (A[end] > pivot) {
                 end--;
             }
             if (start < end) {
                 int temp = A[start];
                 A[start] = A[end];
                 A[end] = temp;
             }
        }
         int temp = A[low];
         A[low] = A[end];
         A[end] = temp;
         return end;

     }
     public void printFunction(int []A){
        for(int i = 0; i<A.length; i++){
            System.out.print(A[i]+ " ");
        }
         System.out.println();
     }
     public void quickSortAlgo(int []A,int low, int high){
         if(low<high) {
             int loc = partition(A, low, high);
             quickSortAlgo(A, low, loc - 1);
             quickSortAlgo(A, loc + 1, high);
         }
     }
}
