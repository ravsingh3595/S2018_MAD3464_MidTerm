public class Main
{
    public static void main(String args[])
    {
//
//        LambtonStringTools second = new LambtonStringTools();
//        second.binaryToDecimal("1100");
//
//        LambtonStringTools fourth = new LambtonStringTools();
//        fourth.initials(".James .tiBeriUs .kiRK");

        BinaryToDecimal a = new BinaryToDecimal();
        int b = a.binaryToDecimal("00011.11");
        System.out.println(b);

        Reverse first = new Reverse();
        String first1 = first.reverse("LAMBTON");
        System.out.println(first1);

//        ReplaceSubString b1 = new ReplaceSubString();
//        b1.hello();
    }
}
