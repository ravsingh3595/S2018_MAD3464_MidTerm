public class Reverse {

    public String reverse(String s)
    {
        char c[] = s.toCharArray();
        char a[]= new char[c.length];
        for (int i = c.length-1; i >= 0; i--)
            {
                a[(c.length-1)-i] = c[i];
            }
            String output = new String (a);
        return output;
    }
}
