package mainclass;

public class TestExeption {
    void isGreaterThan(int x, int y) throws MyException
    {
        if(x > y)
        {
            throw new MyException();
        }
        else
        {
            System.out.println("Check is ok");
        }
    }
    void isSmallerThan(int x, int y) throws MyException
    {
        if(x < y)
        {
            throw new MyException();
        }
        else
        {
            System.out.println("Check is ok");
        }
    }
    void isEqualtoZero(int x) throws MyException
    {
        if(x==0)
        {
            throw new MyException();
        }
        else
        {
            System.out.println("Check is Ok");
        }
    }
}
