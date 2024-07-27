public class MinMax {
    public static class min1max1{
        int min;
        int max;
    }

    public static min1max1 max_min(int[]A,int i,int j) {
        int mid = (i+j)/2;

        min1max1 mm = new min1max1();
        if (i == j) {
            mm.min = A[i];
            mm.max = A[j];
            return mm;
        } else if (i == j - 1) {
            if (A[i] > A[j]) {
                mm.max = A[i];
                mm.min = A[j];
                return mm;
            } else {
                mm.max = A[j];
                mm.min = A[i];
                return mm;
            }
        } else {
            mid = (i+j)/2;
            min1max1 left=max_min(A, i, mid);
            min1max1 right=max_min(A,mid+1, j);
            mm.min=Math.min(left.min, right.min);
            mm.max=Math.max((left.max),right.max);
            return mm;
        }
    }

}
