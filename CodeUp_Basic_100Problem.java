import java.util.*;
public class CodeUp_Basic_100Problem {
	
	public static void main(String[] args) {
		
		/*1003 줄바꿔 출력
		System.out.println("Hello\nWorld");
		*/
		/*1005 큰따옴표 포함 출력
		System.out.println("\"Hello\"");
		*/
		/*1006 큰따옴표 포함 타 문자 출력
		System.out.println("\"!@#$%*()\"");
		*/
		/*1007 "C:\Download\hello.cpp" 을 출력
		System.out.println("\"C:\\Download\\hello.cpp\"");
		*/
		/*1008 특수문자를 출력
		System.out.println("\u250C\u252C\u2510\n");
		System.out.print("\u251C\u253C\u2524\n\n");
		System.out.print("\u2514\u2534\u2518\n");
		*/
		/*1010 정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후 변수에 저장되어 있는 값을 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.printf("%d", i);
		*/
		/*1011 문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후 변수에 저장되어 있는 문자를 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		System.out.print(st);
		*/
		/*1012 실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어 있는 실수값을 출력해보자.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.print(fl);
		*/
		/*1013 정수(int) 2개를 입력받아 그대로 출력해보자.
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(i+"\n"+j);
		*/
		/*1014 2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자.
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		System.out.println(b + "\n" + a);
		*/
		/*1015 실수(float) 1개를 입력받아 저장한 후, 저장되어 있는 값을 소수점 셋 째 자리에서 반올림하여 소수점 이하 둘 째 자리까지 출력하시오.
		Scanner sc = new Scanner(System.in);
		float fl = sc.nextFloat();
		System.out.printf("%.2f", fl);
		*/
		/*1017 int형 정수 1개를 입력받아 공백을 사이에 두고 3번 출력해보자
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d %d %d", a, a, a);
		*/
		/*1018 어떤 형식에 맞추어 시간이 입력될 때, 그대로 출력하는 연습을 해보자.
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int minute = sc.nextInt();
		System.out.printf("%d : %d", time, minute);
		*/
		/*1031 10진수를 입력받아 8진수, 16진수로 출력해보자.
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
