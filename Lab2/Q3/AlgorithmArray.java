public class AlgorithmArray {
    public int max(int[] array)
    {
        int maxVal = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] > maxVal)
            {
                maxVal = array[i];
            }    
        }
        return maxVal;
    }

    public int min(int[] array)
    {
        int minVal = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < minVal)
            {
                minVal = array[i];
            }            
        }
        return minVal;
    }
}
