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
        System.out.println(MyInterface.NAME + " �������̽��� �޼ҵ带 ������ ���Դϴ�.");
    }
}

class InterfaceCaller
{
    public void receiveObject(MyInterface mi)
    {
        mi.interfaceMethod();
    }
}
