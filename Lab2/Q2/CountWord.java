public class CountWord {
    int getCount(String sentence)
    {
        int count = 0;
        String[] arr = sentence.split(" ");
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals("Mohamed"))
            {
                count++;
            }    
        }
        return count;
        // System.out.println(count);
    }
}
