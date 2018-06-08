public class BinaryToDecimal
{
    public int binaryToDecimal(String s)
    {
        char[] c = s.toCharArray();
        double ans = 0;
        for (int i = c.length-1,j=0; i >=0 ; i--,j++)
        {
            ans = ans +((c[j]-48)*(Math.pow(2,i)));
        }
        return (int)ans;
    }


}
