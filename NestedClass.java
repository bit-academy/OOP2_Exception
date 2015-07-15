public class NestedClass
{
    static int i = 10;

    static class IamNested
    {
        public int getInt()
        {
            return i;
        }

        public static int getInt2()
        {
            return i;
        }
    }

    public static void main(String[] args)
    {
        System.out.print("클래스 메소드 getInt() : ");
        System.out.println(IamNested.getInt2());

        IamNested nested = new IamNested();
        System.out.print("인스턴스 메소드 getInt() : ");
        System.out.println(nested.getInt());
        System.out.println(nested.getClass());
    }
}
