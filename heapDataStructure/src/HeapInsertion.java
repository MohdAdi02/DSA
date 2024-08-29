
public class HeapInsertion {
    public static void insertMinHeap(int[]heap, int size ,int value){
        heap[size] = value;                                    // heap[0]=value
        int index = size;                                      // index = 0;
        while (index>0 &&  heap[index] < heap[(index-1)/2] ){

            swap(heap,index,(index-1)/2);
            index = (index-1)/2;


        }
    }
    public static void swap(int[] heap, int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String []a){
        int[] heap = new int[6];
        int[] value = {10,7,11,5,4,13};
        int size = 0;

        for(int i =0; i<value.length;i++){
            insertMinHeap(heap,size,value[i]);
            size++;
//            System.out.print("Value "+ heap[i] +" insert ");
            for(int j =0; j<size; j++){
                System.out.print(heap[j]+" ");
            }
            System.out.println();
        }
    }
}


