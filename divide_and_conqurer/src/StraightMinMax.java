public class StraightMinMax
{
    public static class MinMax
    {
        int min;
        int max;
    }
    static MinMax minMaxElement(int []A){
        int max =A[0];
        int min =A[0];

        for (int i=0; i<A.length;i++) {

            if(A[i]>max)
                max=A[i];
            if(A[i]<min)
                min = A[i];
        }
        MinMax res = new MinMax();
        res.max =max;
        res.min =min;
        return res;
    }
//    static int minimumElement(int[] A)
//    {
//        int min = A[0];
//        for (int i=0; i<A.length;i++) {
//
//            if(A[i]<min){
//                min=A[i];
//            }
//        }
//        return min;

//    public static void main(String []args)
//    {
//        int []A = {100, 20 ,30 ,40, 50, 60, 80};
//        System.out.println("minimum Element is " +minimumElement(A));
//        System.out.println("MAximum Elements is "+ maximumElement(A));
//    }

}
