package com.greedy.level01.basic.student.run;

import java.util.Scanner;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

public class Application {

	public static void main(String[] args) {
		
		/* 최대 10명의 학생 정보를 기록할 수 있게 배열 할당 */
		StudentDTO[] students = new StudentDTO[10];
		
		/* while문 사용하여 학생들의 정보 계속 입력 받기
		 * 계속 추가할 것인지 물어보고 카운트 */
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		while(index < students.length) {
			
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				
				sc.nextLine();
				
				/* 후위연산자 이용해 0부터 index 저장 */
				students[index++] = new StudentDTO(grade, classroom, name, kor, eng, math);
				
				System.out.print("계속 추가할 겁니까? (y/n) : ");
				char answer = sc.nextLine().charAt(0);
				if(answer != 'y' && answer != 'Y') break;
				
				/* 무조건 소문자
				 * char answer = sc.nextLine().toLowerCase().charAt(0);
				 * if( != 'y') break; */
				
				/* 무조건 대문자
				 * char answer = sc.nextLine().toUpperCase().charAt(0);
				 * if(answer != 'Y') break; */
				
				/* 문자열로 받는 경우 - 대/소문자 무시하고 answer가 Y인지 y인지 확인해줌
				 * String answer = sc.nextLine();
				 * if(answer.equalsIgnoreCase("Y")) break;
				 * 
				 * String answer = sc.nextLine();
				 * if(answer.equalsIgnoreCase("y")) break; */
			}
			
			/* 3명 정도의 학생 정보를 입력 받아 객체 배열에 저장
			 * 현재 기록된 학생들의 각각 평균 구하고 정보를 모두 출력 */
			for(int i = 0; i < index; i++) {
				// i < students.length; 라고 범위를 지으면 NullPointerException 발생
				
				int sum = students[i].getKor() + students[i].getEng() + students[i].getMath();
				
				System.out.println(students[i].getInformation() + ", 평균=" + sum/3);
			}
		
	}

}
