package com.greedy.level02.normal.product.manager;

import java.util.Scanner;

import com.greedy.level02.normal.product.model.dto.ProductDTO;

public class ProductManager {

	private ProductDTO[] pro = null;	// =null
	public static int count = 0;		// 현재 추가된 객체 수
	
	Scanner sc = new Scanner(System.in);
	
	/* 초기화 블럭 이용하여 10개의 Product 배열 크기 할당 */
	{
		pro = new ProductDTO[10];	// 초기화
	}
	
	/* do~while문 이용해 반복적으로 메뉴화면 출력 */
	public void mainMenu() {
		
		int menu = 0;
		do {
			
			System.out.println("====== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");	// productInput() 메소드 실행
			System.out.println("2. 제품 전체 조회");	// productPrint() 메소드 실행
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : productInput(); break;
			case 2 : productPrint(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); break;
			default : System.out.println("잘못 선택하셨습니다."); break;
			}
			
		} while(menu != 9);
		
	}
	
	public void productInput() {
		
		/* 키보드로 도서 정보 입력 받아 객체 생성 */
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		/* ProductDTO 생성자 내부에서 ProductController의 count 클래스 변수 값이 1씩 증가 */
		pro[count] = new ProductDTO(pId, pName, price, tax);
		
	}
	
	public void productPrint() {
		
		/* 현재까지 기록된 도서 정보 모두 출력 */
		for(int i = 0; i < count; i++) {
			System.out.println(pro[i].getInformation());
		}
		
	}
	
}
