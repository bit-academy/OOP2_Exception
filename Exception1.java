public class Exception1
{
    public static void main(String[] args)
    {
        try
        {
            int i = 1/0;
        } catch(ArithmeticException ae)
        {
            System.out.println("�����꿹�� : " + ae);
            ae.printStackTrace();
        } catch(Exception e)
        {
            System.out.println("��Ÿ ���� : " + e);
        } finally
        {
            System.out.println("try ������ ����� ���� �����.");
        }
    }
}
