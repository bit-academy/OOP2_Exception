public class Inheritance
{
    String className;

    public Inheritance()
    {
        System.out.println("[Inheritance �� ������]");
    }

    void printClassName()
    {
        setClassName("Inheritance");
        System.out.println(className);
    }

    void printMyClassName()
    {
        printClassName();
    }

    void setClassName(String className)
    {
        this.className = className;
    }

    public static void main(String[] args)
    {
        Inheritance inheritance = new Inheritance();
        inheritance.printClassName();

        System.out.println("");

        Inheritance inherited = new InheritedClass();
        inherited.printClassName();

    // �Ʒ� ������ ����� �� ����.
    //        inherited.printClassName("new method!");
        InheritedClass inherited2 = (InheritedClass)inherited;
        inherited2.printClassName("new method!");
    }
    }

    class InheritedClass extends Inheritance
    {
    public InheritedClass()
    {
        System.out.println("[InheritedClass �� ������]");
    }

    public void printClassName()
    {
        setClassName("InheritedClass");
        System.out.println(className);
    }

    public void printClassName(String header)
    {
        // Inheritance �������� ������ Instance�� �ٷ�� ���� ����
        // printClassName(String header) �޼ҵ忡 ���� ������ ������ �����Ƿ�, ȣ���� �� ����.
    }
}
