public interface InnerClassInInterface
{
    public static final int a=1;

    public void callMe();

    static class MyDataType1
    {
        public static void main(String[] args)
        {
            MyDataType1 type1=new MyDataType1();
            System.out.println("MyDataType1 : "+type1);
    //			System.out.println("MyDataType1 : "+type1.a);
        }
    }

    class MyDataType2
    {
        public static void main(String[] args)
        {
            MyDataType2 type2=new MyDataType2();
            System.out.println("MyDataType2 : "+type2);
        }
    }
}
