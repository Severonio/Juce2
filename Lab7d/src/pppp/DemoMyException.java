package pppp;

public class DemoMyException {
    public static void main(String[] args) {
        ZeroException zeroException = new ZeroException();
        zeroException.DivideIntoZero(0);
    }
}

class ZeroException
{
    public void DivideIntoZero(int i)
    {
        try{
            System.out.println(20/i);
        }
        catch (ArithmeticException j)
        {
            System.out.println("Found: " + j);
        }
    }
}
