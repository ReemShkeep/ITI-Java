public class IPCutter {
    public static String[] cutter(String ipAddress)
    {
        String[] returnVal;
        returnVal = ipAddress.split("\\.");
        return returnVal;
        // System.out.println("Hello");
        // return "hello";
    }
}