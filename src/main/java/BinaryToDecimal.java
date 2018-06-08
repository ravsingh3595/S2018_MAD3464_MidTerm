public class BinaryToDecimal
{
    public int binaryToDecimal(String s)
    {
        char[] c = s.toCharArray();
        double ans = 0;
        for (int k = 0; k < c.length - 1; k++)
        {
            if((c[k]-48) - (int)c[k]-48 == 0)
            {
                if(c[k] == 48 | c[k] == 49)
                    {
                        for (int i = c.length - 1, j = 0; i >= 0; i--, j++)
                        {
                            ans = ans + ((c[j] - 48) * (Math.pow(2, i)));
                        }
                  }
            }
            else
                {
                    ans = -1;
                }
        }
        return (int)ans;
    }


}
