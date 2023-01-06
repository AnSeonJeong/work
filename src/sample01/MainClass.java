package sample01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("헬로우 자바");
		
		// 한줄 주석문	-> 컴파일이 되지 않는다
		/*
		   범위 주석문 
		   HTML <!---->	
		   JSP  <%----%>
		   mySQL --
		   PYTHON # """ 주석문 """
		 */
		
		System.out.println("Hello World"); // 개행O
		
		System.out.print("Hello"); // 개행X
		
		System.out.print("월드");
		
		// 기능 : escape sequence
		//       \n(개행), \b(backspace), \"(따옴표를 출력), \t(띄어쓰기), \\
		
		System.out.print("World\n");
		
		System.out.println("\b헬로우");
		
		System.out.println("\"Hello World\"");
		
		System.out.println("\tHello\tWorld");
		System.out.println("\t월드\t헬로");
		
		System.out.println("\\헬로우 월드\\");
		
		System.out.printf("--%s--\n", "Hello"); // f: format, Hello == 문자열(String), 개행X
        //                  표현자료형      값
		
		System.out.println(1024);
		
		System.out.println("Hello" + "World");
		
	}

}
