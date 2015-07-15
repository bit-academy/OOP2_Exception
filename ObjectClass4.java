public class ObjectClass4
{
    public String myID;

    public ObjectClass4(String myID)
    {
        this.myID=myID;
    }

    public void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("객체가 수거됨 : "+myID);
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args)
    {
//        System.runFinalizersOnExit(true);
        ObjectClass4 object=new ObjectClass4("1");
        System.gc();
    }
}
