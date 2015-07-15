package myPackage;

public class MethodFieldRestrict
{
    private int value;

    private MethodFieldRestrict(int value)
    {
        value = this.value;
    }

    int getValue()
    {
        return value;
    }

    protected void printValue()
    {
        System.out.println(value);
    }

    public static void main(String[] args)
    {
        new MethodFieldRestrict(5);
    }
}
