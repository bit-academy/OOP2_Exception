public class InterfaceTest
{
    public static void main(String[] args)
    {
        InterfaceCaller ic = new InterfaceCaller();
        MyInterface impl = new InterfaceImpl();
        ic.receiveObject(impl);
    }
}

class InterfaceImpl implements MyInterface
{
    public void interfaceMethod()
    {
        System.out.println(MyInterface.NAME + " 인터페이스의 메소드를 구현한 것입니다.");
    }
}

class InterfaceCaller
{
    public void receiveObject(MyInterface mi)
    {
        mi.interfaceMethod();
    }
}
