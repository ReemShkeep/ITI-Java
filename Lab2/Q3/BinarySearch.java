public class BinarySearch {
    public int binSearch(int[] array, int num)
    {
        int len = array.length;
        int start = 0, end = len-1, mid = len/2;
        for (int i = 0; i <= end; i++)
        {
                if(num == array[mid])
                {
                    System.out.print("This number exists ");
                    return array[mid];
                }
                else if(num < array[mid])
                {
                    end = mid;
                    mid = (start + end) / 2;
                }
                else if(num > array[mid])
                {
                    start = mid;
                    mid = ( start + end ) / 2;
                }
        }
        System.out.println("This Number is not exist in the Array");
        return -1;
    }    
}
