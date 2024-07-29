public class TestAlgo {
    public static void main(String[] args) {
        int []A={9,8,7,6,5,2,5,1};
        int n = A.length;
        BubbleSort bs = new BubbleSort();
        bs.bubbleShortAlgorithm(A,n);
        bs.print(A,n);
    }
}
