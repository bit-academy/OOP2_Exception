public class Exception1
{
    public static void main(String[] args)
    {
        try
        {
            int i = 1/0;
        } catch(ArithmeticException ae)
        {
            System.out.println("수연산예외 : " + ae);
            ae.printStackTrace();
        } catch(Exception e)
        {
            System.out.println("기타 예외 : " + e);
        } finally
        {
            System.out.println("try 구문을 벗어나기 전에 실행됨.");
        }
    }
}
