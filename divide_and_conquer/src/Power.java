public class Power
{
    public  int poweOfNumber(int a, int b)
    {
        int ans;
        int mid;
        if(b==1){
            return a;
        }else{
            mid = b/2;
            ans = poweOfNumber(a,mid);
        }
        if (b%2==0){

            return ans*ans;
        }else{
            return ans*ans*a;
        }
    }
}
