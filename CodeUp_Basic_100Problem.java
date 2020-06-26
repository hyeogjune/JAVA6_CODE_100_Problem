import java.util.*;
import java.util.regex.Pattern;
public class CodeUp_Basic_100Problem {
	
	private static final char A = 0;

	

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
		/*1037 정수 입력받아 ASCII CODE 출력
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		char b = (char) a;
		System.out.println(b);
		*/
		/*1041 문자 입력받아 다음 문자 출력
		Scanner sc = new Scanner(System.in);
		char c = sc.nextLine().charAt(0);
		System.out.printf("%c", c+1 );
		*/		
		/*1042 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a/b);
		*/
		/*1044 정수를 1개 입력받아 1만큼 더해 출력해보
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a+1);
		*/
		/*1045 정수 2개 입력받아 자동 계산하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d", a+b, a/b, a*b, a%b, a-b);
		*/
		/*1046 정수 3개 입력받아 합과 평균 출력하기
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat(); 
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		System.out.printf("%.1f %.1f", a+b+c, (a+b+c)/3);
		*/
		/*1047 Shift를 이용해 정수 1개 입력받아 2배 곱해 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d", a<<1); // a에 2^1배 곱해서 출력. 
		*/
		/*1048 한 번에 2의 거듭제곱 배로 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print("a에 2^b를 곱하면 : ");
		System.out.printf("%d", a<<b);
		*/
		/*1050 두 정수 입력받아 비교하기1
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
		*/
		/*1052 두 정수 입력받아 비교하기4
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a==b) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		*/
		/*1053 참 거짓 바꾸기
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		if(a==true) {
			System.out.print(!a);
		}
		*/
		/*1054 둘 다 참일 경우만 참 출력하기
		Scanner sc = new Scanner(System.in);
		boolean a = sc.nextBoolean();
		boolean b = sc.nextBoolean();
		if(a==true && b==true) {
			System.out.print(true);
		}
		else System.out.print(false);
		*/
		/*1059 비트단위로 NOT 하여 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.printf("%d", ~a); // bitwise -는 0의개수 +1 하고 -붙이면됨
		*/
		
		/*1060 비트단위로 AND 하여 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d", a&b);
		*/
		/*1063 두 정수 입력받아 큰 수 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a>b ? a:b);
		*/
		/*1064 정수 3개 입력받아 가장 작은 수 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.print((a>b ? a:b) < c ? c:(a>b ? a:b) );
		*/
		/*1065 정수 3개 입력받아 짝수만 출력하기
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a%2==0) {
			System.out.println(a);
		}
		if(b%2==0) {
			System.out.println(b);
		}
		if(c%2==0) {
			System.out.println(c);
		}
		else {
			System.out.print("짝수 없음");
		}
		*/
		/*1066 정수 3개 입력받아 짝/홀 출력하기(설명)
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(b%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		if(c%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		*/
		/*1067 정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
		Scanner sc = new Scanner(System.in); 
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			if(a>0) {
				System.out.print("PLUS & EVEN");
			}
			else {
				System.out.print("MINUS & EVEN");
			}
		}
		
		else {
			if(a>0) {
				System.out.print("PLUS & ODD");
			}
			else {
				System.out.print("MINUS & ODD");
			}
		}
		*/
		/*1069 평가 입력받아 다르게 출력하기
		Scanner sc = new Scanner(System.in); 
		char gr = sc.next().charAt(0);
		if(gr == 'A') {
			System.out.print("best!!");
		}
		*/
		/*1070 월 입력받아 계절 출력하기
		Scanner sc = new Scanner(System.in); 
		int weather = sc.nextInt();
		switch(weather) {
			case 1 : System.out.print("Winter"); break;
			case 2 : System.out.print("Winter"); break;
			case 3 : System.out.print("Spring"); break;
			case 4 : System.out.print("Spring"); break;
			case 5 : System.out.print("Spring"); break;
			case 6 : System.out.print("Summer"); break;
			case 7 : System.out.print("Summer"); break;
			case 8 : System.out.print("Summer"); break;
			case 9 : System.out.print("fall"); break;
			case 10 : System.out.print("fall"); break;
			case 11 : System.out.print("fall"); break;
			case 12 : System.out.print("Winter");			
		}
		*/
		/*1071  0 입력될 때까지 무한 출력하기1
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			System.out.println(num);
		}
		*/
		/*1072 정수 입력받아 계속 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수의 개수는 : ");
		int num = sc.nextInt();
		int[] temp = new int[num];
		for(int i = 0; i<temp.length; i++) {
			temp[i] = i+1;
		}
		for(int i = 0; i<temp.length; i++) {
			System.out.print(" "+temp[i]);
		}
		*/
		/*1074 정수 1개 입력받아 카운트다운 출력하기1 (for문 사용)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num; i>0; i--) {
			System.out.println(i);
		}
		*/
		/*1075 정수 1개 입력받아 카운트다운 출력하기2 (while문 사용)
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num != 0) {
			num--;
			System.out.println(num);
		}
		*/
		/*1076 문자 1개 입력받아 알파벳 출력하기
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		do {
			System.out.println(c);
			c--;
		}while(c>64);
		*/
		/*1077 정수 1개 입력받아 그 수까지 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 0; i<a; i++) {
			System.out.println(i);
		}
		*/
		/*1078 [기초-종합] 짝수 합 구하기
		Scanner sc = new Scanner(System.in);
		int even_sum = sc.nextInt();
		int sum = 0;
		for(int i = 0; i<=even_sum; i++) {
			if(i%2 == 0) {
				sum += i;
			}			
		}
		System.out.print(sum);
		*/
		/*1079 원하는 문자가 입력될 때까지 반복 출력하기
		Scanner sc = new Scanner(System.in);
		char until_q = sc.next().charAt(0);
		while(until_q != 'q') {
			until_q = sc.next().charAt(0);
			System.out.println(until_q);
		}
		*/
		/*1080 [기초-종합] 언제까지 더해야 할까?
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int temp = 0;
		for(int i = 0; sum<=a; i++) {
			sum += i;
			temp = i-1;
		}
		System.out.print(temp);
		*/
		/*1081 [기초-종합] 주사위를 2개 던지면?
		int n = (int) (Math.random()*10) + 1;
		int m = (int) (Math.random()*10) + 1;
		
		System.out.print("주사위 값 : ");
		System.out.println(n + " " + m);
		System.out.println("경우의 수");
		for(int i = 0; i<=n; i++) {
			for(int j = 0; j<=m; j++) {
				System.out.println(i + " " + j);
			}
		}
		*/
		/*1082 [기초-종합] 16진수 구구단?
		Scanner sc = new Scanner(System.in);
		String st = sc.next();// hex로 변환하기 위한 문자열 입력
		
		boolean check = Pattern.matches("[A-Z]", st);
		
		if(check) {
			int hex = Integer.parseInt(st, 16); // String을 16진수로 변환
				for(int i = 0; i<16; i++) {
					System.out.printf("%X * %X = %X \n", hex,i,hex*i);
				}
			}
		*/
		/*1083 3 6 9 게임의 왕이 되자!
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i = 1; i<input; i++) {
			if(i%10 == 3 || i%10 == 6 || i%10 == 9 || i%30 ==0) {
				System.out.print(" " + "X");
			}
			else {
				System.out.print(" " + i);
			}
			if(i/30 == 1 && i%3 == 0 && i != 30) {
				System.out.print("X");
			}
		}
		*/
		/*1084 빛 섞어 색 만들기 (조합, 경우의 수)
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		
		for(int i = 0; i<r; i++) {
			for(int j = 0; j<g; j++) {
				for(int k = 0; k<b; k++) {
					System.out.println(i + " " + j + " " + k);
					count ++ ;
				}
			}
		}
		
		System.out.println(" " + count);
		*/
		/* 1085 소리 파일 저장용량 계산하기
		Scanner sc = new Scanner(System.in);
		int hz = sc.nextInt();
		int bit = sc.nextInt();
		int ch = sc.nextInt();
		int rec_s = sc.nextInt();;
		float result = (float) (hz*bit*ch*rec_s)/(8*(2<<9)*(2<<9)); // 8bit 나눠서 byte로 만든후  MB로 변환,, 원래있던 2를 이동해서 2^10 두번 옮김
		check(hz, bit, ch, rec_s);
		
		System.out.printf("%.1f MB",result);
		}
		public static void check(int hz, int bit, int ch, int rec_s) {
			if(hz<=48000 && bit<=32 && bit%8 == 0 && ch<= 5 && rec_s<= 6000) {
				return;
			}
			else {
				System.out.println("재입력");
				}
		}
		*/
		/*1086 그림 파일 저장용량 계산하기
		Scanner sc = new Scanner(System.in);
		int w_pix = sc.nextInt();
		int h_pix = sc.nextInt();
		int bit = sc.nextInt();
		float result = (float) (w_pix * h_pix * bit) / (8*(2<<19));
		System.out.printf("%.2f MB", result);
		*/
		
	}
}


