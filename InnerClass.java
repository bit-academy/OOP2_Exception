public class InnerClass
{
    int i;
    int outer = 10;

    public InnerClass(int i)
    {
        this.i = i;
    }

    public class IamInner
    {
        int outer = 20;

        public int getInt()
        {
            return i;
        }

        public void printOuter()
        {
            System.out.println("Outer : " +InnerClass.this.outer);
        }
    }

    public static void main(String[] args)
    {
        InnerClass inner = new InnerClass(5);
        InnerClass.IamInner iamInner = inner.new IamInner();
        System.out.print(iamInner.getClass());
        System.out.print("의 인스턴스 메소드 getInt() : ");
        System.out.println(iamInner.getInt());

        iamInner.printOuter();
    }
}
