public class TestAlgorithm
{
    public static void main(String[] args) {
        int []A = {10,20,80,100, 400,78};
        StraightMinMax.MinMax res = StraightMinMax.minMaxElement(A);
        System.out.println(res.max);
        System.out.println(res.min);
    }
}
