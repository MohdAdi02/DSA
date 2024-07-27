public class BinarySearch {
    public static int bSearch(int[] A, int i, int j, int key) {
        if (i == j) {
            if (A[i] == i) {
                return i;
            } else {
                return -1;
            }
        } else {
            int mid = (i + j) / 2;

            if (A[mid] == key) {
                return mid;
            } else {
                if (A[mid] > key) {
                    return bSearch(A, i, mid - 1, key);
                } else {
                    return bSearch(A, mid + 1, j, key);
                }
            }
        }
    }
}