public class LambtonStringTools {


    private String s2;

    public LambtonStringTools(){}

    public String reverse(String s)
    {
         char c[] = s.toCharArray();

        for (int i = c.length-1; i >= 0; i--)
        {
            System.out.print(c[i]);
        }
        return null;
    }
    /*public int binaryToDecimal(String s)
    {



       return
    }*/
}
