import java.util.*;
public class CodeUp_Basic_100Problem {
	
	public static void main(String[] args) {
		
		/*1003 �ٹٲ� ���
		System.out.println("Hello\nWorld");
		*/
		/*1005 ū����ǥ ���� ���
		System.out.println("\"Hello\"");
		*/
		/*1006 ū����ǥ ���� Ÿ ���� ���
		System.out.println("\"!@#$%*()\"");
		*/
		/*1007 "C:\Download\hello.cpp" �� ���
		System.out.println("\"C:\\Download\\hello.cpp\"");
		*/
		/*1008 Ư�����ڸ� ���
		System.out.println("\u250C\u252C\u2510\n");
		System.out.print("\u251C\u253C\u2524\n\n");
		System.out.print("\u2514\u2534\u2518\n");
		*/
		/*1010 ������(int)���� ������ �����ϰ�, ������ �������� ������ �� ������ ����Ǿ� �ִ� ���� �״�� ����غ���.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.printf("%d", i);
		*/
		/*1011 ������(char)���� ������ �ϳ� �����ϰ�, ������ ���ڸ� ������ �� ������ ����Ǿ� �ִ� ���ڸ� �״�� ����غ���.
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.print(st);
		*/
		/*1012 �Ǽ���(float)�� ������ �����ϰ� �� ������ �Ǽ����� ������ �� ����Ǿ� �ִ� �Ǽ����� ����غ���.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.print(fl);
		*/
		/*1013 ����(int) 2���� �Է¹޾� �״�� ����غ���.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i+"\n"+j);
		*/
		/*1014 2���� ����(ASCII CODE)�� �Է¹޾Ƽ� ������ �ٲ� ����غ���.
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(b + "\n" + a);
		*/
		/*1015 �Ǽ�(float) 1���� �Է¹޾� ������ ��, ����Ǿ� �ִ� ���� �Ҽ��� �� ° �ڸ����� �ݿø��Ͽ� �Ҽ��� ���� �� ° �ڸ����� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.printf("%.2f", fl);
		*/
		/*1017 int�� ���� 1���� �Է¹޾� ������ ���̿� �ΰ� 3�� ����غ���
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d %d %d", a, a, a);
		*/
		/*1018 � ���Ŀ� ���߾� �ð��� �Էµ� ��, �״�� ����ϴ� ������ �غ���.
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int minute = sc.nextInt();
		System.out.printf("%d : %d", time, minute);
		*/
		/*1031 10������ �Է¹޾� 8����, 16������ ����غ���.
		Scanner sc = new Scanner(System.in);
		int demi_to_ox = sc.nextInt();
		System.out.printf("%d, %o %x", demi_to_ox, demi_to_ox, demi_to_ox);
		*/
		
		Scanner sc = new Scanner(System.in);
		String hex = sc.next();
		int de = Integer.valueOf(hex, 10);
		System.out.println(de);
		
		
		
		
		
	}

}
