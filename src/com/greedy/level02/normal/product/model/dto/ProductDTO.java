package com.greedy.level02.normal.product.model.dto;

import com.greedy.level02.normal.product.manager.ProductManager;

public class ProductDTO {

	private int pId;		// 제품 번호
	private String pName;	// 제품명
	private int price;		// 제품 가격
	private double tax;		// 제품 세금
	
	/* 기본 생성자
	 * ProductDTO 객체 생성 시 마다 ProductManager의 객체 수 count를 1 증가 */
	public ProductDTO() {
		ProductManager.count++;		// static이므로 클래스명.필드명 으로 접근
	}
	
	/* 번호, 명, 가격, 세금을 초기화 하는 생성자
	 * ProductDTO 객체 생성 시 마다 ProductManager의 객체 수 count를 1 증가 */
	public ProductDTO(int pId, String pName, int price, double tax) {
		this.pId = pId;
		this.pName = pName;
		this.price = price;
		this.tax = tax;
		
		ProductManager.count++;		// static이므로 클래스명.필드명 으로 접근
	}
	
	/* setter */
	public void setPld(int pld) {
		this.pId = pld;
	}
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	/* getter */
	public int getPId() {
		return pId;
	}
	
	public String getPName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getTax() {
		return tax;
	}
	
	/* 모든 필드 값을 문자열로 반환 */
	public String getInformation() {
		return "제품 번호=" + this.pId + ", 제품명=" + this.pName + ", 제품 가격=" + this.price + ", 제품 세금=" + this.tax + "입니다.";
	}
	
}
