package Lotto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LottoMain {

	private int command = 0;
	private BufferedReader in;
//	Java를 처음 접하시는 분들이 주로 받는 입력방식은 Scanner입니다. 
//	Scanner를 통해 입력을 받을경우 Space Enter를 모두 경계로 인식하기에 입력받은 데이터를 가공하기 매우 편리합니다.
//	하지만 그에비해 BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로 고정되기때문에 입력받은 데이터를 가공하는 작업이 필요할경우가 많습니다. 
//	Scanner에 비해 다소 사용하기 불편하죠. 하지만 많은 양의 데이터를 입력받을경우 BufferedReader를 통해 입력받는 것이 효율면에서 훨씬 낫습니다. 
//	입력시 Buffer 메모리줌으로써 작업속도 차이가 많이납니다.
	private LottoPro program = null;
	
	
	public final int RECOMMANDATION_NUMBER =1;
	public final int PRINT_NUMBER = 2;
	public final int EXIT = 3;
	// 메인함수 호출  1번
	public LottoMain() {
//		InputStreamReader / OutputStreamWriter는 바이트 스트림에서 문자 스트림으로, 
//		또는 문자 스트림에서 바이트 스트림으로의 변환을 제공하는 입출력 스트림이다. 
//		바이트를 읽어서 지정된 문자 인코딩에 따라 문자로 변환하는데 사용한다.

		in = new BufferedReader(new InputStreamReader(System.in));
		// 생성 변수 초기화
		// LottoPro 에서 함수를 찾아 봅시다.
		program = new LottoPro(true);
		// 메인 함수 내에서 실행 되는 것이 아닌, 
		// 메인 함수가 생성한 자기 자신의 인스턴스에 의해 실행되므로,
		// static 메서드가 아닌 start 를 실행 할 수 있습니다. 
		start();
			
	}
	public void start(){
		
		System.out.println("로또 프로그램을 시작합니다.");
		for(int i=0; i<11; i++) {
			System.out.println(i * 10+ "%");
			if( i == 10) {
				System.out.println("환영 합니다.");
			}
		}
		System.out.println();
		do {
			System.out.println("-----------MENU----------");	
			System.out.println("1.추첨 2.보기 3.끝내기");	
			System.out.println("-------------------------");	
			System.out.print(">> ");	
			try {	
				// 변수형 생각
				this.command = Integer.parseInt(in.readLine());	
				} 
			catch (IOException e) {	
					System.out.println("(System)IOException !! try again..");	
					continue;	
					}	
			switch(this.command){	
			case RECOMMANDATION_NUMBER: 
				program.start_recommandation();	
				break;	
			case PRINT_NUMBER:
				program.printNumber();	
				break;	
			case EXIT:
				System.out.println("(System)bye!");	
				return;	
				}	
			} while (true);
	}
	
	public static void main(String[] args) {
		new LottoMain();
	}
}
