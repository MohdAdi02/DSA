public class Radixsort {
    public int  getMAx(int []A,int n){
        int max = A[0];
        for(int i = 0; i<n; i++){
            if(A[i]> max){
                max = A[i];
            }
        }
        return max;
    }
    public void countSort(int []A, int n, int pos){
        int []b    = new int[n];
        int []count = new int [10];
        for(int i =0; i<n; i++){
            count[(A[i]/pos)%10]++;
        }
        for(int i =1; i<10; i++){
            count[i] = count[i-1] + count[i];
        }
        for(int i =n-1; i>=0; i--){
            b[count[(A[i]/pos)% 10]  -1] = A[i];
            count[(A[i]/pos)%10]--;
        }
        for(int i =0; i<n; i++){
            A[i] = b[i];
        }
    }
    public void radixSort(int []A, int n  ){
        int pos=1;
        int max = getMAx(A,n);
        for(pos =1; max/pos>0; pos*=10){
            countSort(A,n, pos);
        }

    }
}
