public class MergeAlgorithm {
    public void merged(int []A, int l, int mid, int h){
        int []arr = new int [h - l +1];

        int index1 = l;     // tracking 1st array means first part of array
        int index2 = mid+1; // tracking 2nd array means 2nd part of array
        int index = 0;      // tracking new array

        while(index1<=mid && index2<=h){
            if(A[index1]<A[index2]){
                arr[index++] = A[index1++];
            }else{
                arr[index++]=A[index2++];
            }
        }
        while(index1<=mid){
            arr[index++] = A[index1++];
        }
        while (index2<=h){
            arr[index++]=A[index2++];
        }
        for(int i =0, j =l; i<arr.length; i++, j++){
            A[j]=arr[i];
        }
    }

    public void mergesort(int []A,int l,int h){
        if(l<h){
            int mid = (l+h)/2;
            mergesort(A,l,mid);
            mergesort(A, mid+1,h);
            merged(A,l,mid,h);
        }
    }
}
