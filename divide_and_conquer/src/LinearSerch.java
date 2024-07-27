public class LinearSerch
{
    public static int lSearch(int []A, int num)
    {

        for(int i = 0; i< A.length; i++)
        {
            if(num==A[i])
                return i;

        }
        return -1;

    }
//    public static void main(String []args) {
//        int key = 30;
//        int[] A = {100, 20, 30, 40, 50, 60, 80};
//        System.out.println(search(A,80));
//    }
}
