public class LambtonStringTools {


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
    public int binaryToDecimal(String s)
    {
        double a = 0;
        int b = 0;
        a = Double.parseDouble("s");


       return b;
    }

    public void initials(String s)
    {
       // String text = "this is a.line is. over";

        int a = 0;
        boolean capitalize = true;
        StringBuilder sb = new StringBuilder(s);
        while (a < sb.length()) {
            if (sb.charAt(a) == '.') {
                capitalize = true;
            } else if (capitalize && !Character.isWhitespace(sb.charAt(a))) {
                sb.setCharAt(a, Character.toUpperCase(sb.charAt(a)));
                capitalize = false;
            }
            a++;
        }
        System.out.println(sb.toString());
    }
//        char c[] = s.toCharArray();
//        if(c.)
//        {
//            System.out.println(c[0].);
//        }
//    }

    public char mostFrequent(String s)
    {

        char c;
        char c1[] = s.toCharArray();
        for (int i = 0; i < c1.length-1; i++) {

            c= c1[i] ;
           // if(c1[i] = c1[i+1])
            {

            }

        }


        return c;
    }


    public String replaceSubString(String s1, String s2, String s3)
    {

        return null;
    }
}
