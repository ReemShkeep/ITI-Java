package stringutils;

public class StringUtils
{
    public static String betterString(String s1, String s2, BiPredicate<String, String> p)
    {
        if(p.test(s1,s2))
        {
            return s1;
        }
        else
        {
            return s2;
        }
    }
    
    public static void main(String[] args)
    {
        String str1 = new String("Hello");
        String str2 = new String("Welcome");
        String longer = StringUtils.betterString(str1, str2, (s1, s2) -> s1.length() > s2.length());
        System.out.println(longer);
        String first = StringUtils.betterString(str1, str2, (s1, s2) -> true);
        System.out.println(first);
    }    
}
