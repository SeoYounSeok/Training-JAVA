package Sample;

import java.util.Scanner;

public class StudentSample {

	public static void main(String[] args) {
		// 입력 받기 위해서 스캐너 클래스 사용합니다.
		
		Scanner input = new Scanner(System.in);
		
		int korean, english , math, science ,program,music;
		
		int sum, ave;
		
		char grade = ' ';
		System.out.println("과목에 따른 점수를 입력하세요. ");
		
		System.out.print("국어: ");
		korean = input.nextInt();
		
		System.out.print("영어: ");
		english = input.nextInt();

		System.out.print("수학: ");
		math = input.nextInt();

		System.out.print("과학: ");
		science = input.nextInt();

		System.out.print("프로그래밍: ");
		program = input.nextInt();

		System.out.print("음악: ");
		music = input.nextInt();
		
		sum = korean+english+math+science+program+music ;
		ave = sum/6;
		
		System.out.println("당신의 성적의 합은" + sum + "입니다! ");
		System.out.println("당신의 성적의 평균은" + ave + "입니다! ");
		
		if(ave >=90) {
			grade = 'A';
		}
		else if(ave >=80) {
			grade = 'B';
		} 
		else {
			grade = 'F';
		}
		System.out.println("당신의 학점은" + grade + "입니다! ");
		
		input.close();
	}
}
