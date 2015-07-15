public class Inheritance
{
    String className;

    public Inheritance()
    {
        System.out.println("[Inheritance 의 생성자]");
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

    // 아래 문장은 실행될 수 없다.
    //        inherited.printClassName("new method!");
        InheritedClass inherited2 = (InheritedClass)inherited;
        inherited2.printClassName("new method!");
    }
    }

    class InheritedClass extends Inheritance
    {
    public InheritedClass()
    {
        System.out.println("[InheritedClass 의 생성자]");
    }

    public void printClassName()
    {
        setClassName("InheritedClass");
        System.out.println(className);
    }

    public void printClassName(String header)
    {
        // Inheritance 데이터형 변수로 Instance를 다루고 있을 때는
        // printClassName(String header) 메소드에 대한 정보가 변수에 없으므로, 호출할 수 없다.
    }
}
