public class TestAlgo {
    public static void main(String[] args) {
//        int []A={9,8,7,6,5,2,5,1};
//        int n = A.length;
//        BubbleSort bs = new BubbleSort();
//        bs.bubbleShortAlgorithm(A,n);
//        bs.print(A,n);




//        int []A = {6,5,8,9,3,10};
//        int n = A.length;
//        QuickSort qs = new QuickSort();
//        qs.quickSortAlgo(A, 0,n-1);
//        qs.printFunction(A);



//        int []A = {5, 21, 32,5,2,9};
//        int n = A.length;
//        InsertionSort is = new InsertionSort();
//        is.insertionAlgorithm(A);
//        is.printFunction(A);



//        int []arr = {0,5,2,4,1,2,1,3,2};
//        int n = arr.length;
//        int k = 5;
//        CountingSort cs = new CountingSort();
//        cs.countingSortAlgorithm(arr);
//        for(int i = 0; i<n; i++){
//            System.out.print(arr[i]);
//        }
//        System.out.println();



        int []A ={170, 45, 75, 90, 802, 24, 2, 66};
        int n = A.length;
        Radixsort rs = new Radixsort();
        rs.radixSort(A,n);
        for(int i =0; i<n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
