import java.lang.Exception;
class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}
public class OwnException
{
    public static void main(String args[])
    {
        try
        {
            throw new MyException("My own Exception");
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}