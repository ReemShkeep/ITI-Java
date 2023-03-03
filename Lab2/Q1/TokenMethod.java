import java.util.StringTokenizer;

public class TokenMethod {
    public static void cutter(String ipAddress)
    {
        StringTokenizer arr = new StringTokenizer(ipAddress, "\\.");
        int len = arr.countTokens();
        for (int i = 0; i < len; i++)
        {
            System.out.println(arr.nextToken("\\."));   
        }
    }
}
