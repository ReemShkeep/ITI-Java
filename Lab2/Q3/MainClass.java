public class MainClass {
    public static void main(String[] args)
    {
        int[] arrInt = new int[1000];
        // AlgorithmArray myaAlg = new AlgorithmArray();
        BinarySearch binSearchObj = new BinarySearch();
        for (int i = 0; i < 1000; i++)
        {
            arrInt[i] = i*2;
            // System.out.println(arrInt[i]);
        }
        // int x = binSearchObj.binSearch(arrInt, 27);
        int x = binSearchObj.binSearch(arrInt, 60);
        System.out.println(x);
        /* To calculate the min, max array elements and the time execution */
        /*int x = myaAlg.max(arrInt);
        System.out.println("Max Number in Array is " + x);
        x = myaAlg.min(arrInt);
        System.out.println("Min Number in Array is " + x);
        
        System.out.println("The Time execution is " + System.nanoTime());*/
    }
}
