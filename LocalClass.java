public class LocalClass
{
    public void methodCall(final int i)
    {
        class Local
        {
            public void localClassMethod()
            {
                System.out.println("인스턴스 바깥 메소드의 변수 i : " + i);
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
