public class Checkloop
{
    public static void main(String[] args)
    {
        if(args.length > 0)
        {
            int len = Integer.valueOf(args[0]);
            for(int i=0; i<len; i++)
            {
                System.out.println(args[1]);
            }
        }    
    }
}