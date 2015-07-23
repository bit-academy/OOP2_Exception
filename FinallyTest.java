import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyTest {
	public static void main(String[] args) {
		FileInputStream inFile = null;

		int count = 0;
		int ch = -1;

		try {
			inFile = new FileInputStream(args[0]);

			while ((ch = inFile.read()) != -1) {
				count++;
			}

			System.out.println(args[0] + " 파일의 바이트 수: " + count);
		} catch (FileNotFoundException e) {
			System.err.println(args[0] + "파일이 없습니다.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inFile != null) {
				try {
					inFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("finally 부분 실행");
			}
		}
	}
}
