public class LocalClass
{
    public void methodCall(final int i)
    {
        class Local
        {
            public void localClassMethod()
            {
                System.out.println("�ν��Ͻ� �ٱ� �޼ҵ��� ���� i : " + i);
                System.out.println(getClass());
            }
        }

        Local local = new Local();
        local.localClassMethod();
    }

    public static void main(String[] args)
    {
        LocalClass local = new LocalClass();
        local.methodCall(5);
    }
}
