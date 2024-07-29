public class TestAlgo {
    public static void main(String[] args) {
        int []A={10,30,50,23,12,15};
        int n = A.length;
        BubbleSort bs = new BubbleSort();
        bs.bubbleShortAlgorithm(A,n);
        bs.print(A,n);
    }
}
