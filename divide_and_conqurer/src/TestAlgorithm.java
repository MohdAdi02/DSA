public class TestAlgorithm
{
    public static void main(String[] args) {
//        int []A = {10,20,80,100, 400,78};
//        StraightMinMax.MinMax res = StraightMinMax.minMaxElement(A);
//        System.out.println(res.max);
//        System.out.println(res.min);


//        int key;
//        int ans = LinearSerch.lSearch(A,900);
//        System.out.println(ans);



        int []A={10,20,30,40,50,90,110,120,150};
        int key = 120;
        int i = 0;
        int j = 8;
        System.out.println(BinarySearch.bSearch(A,i,j,key));
    }
}
