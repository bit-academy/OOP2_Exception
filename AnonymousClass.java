public class AnonymousClass
{
    public void anonymousClassMethod()
    {
        Object obj = new Object()
        {
            String name = "MyAnonymousClass";

            public String toString()
            {
                System.out.println(getClass());
                return name;
            }
        };

        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        AnonymousClass ac = new AnonymousClass();
        ac.anonymousClassMethod();
    }
}
