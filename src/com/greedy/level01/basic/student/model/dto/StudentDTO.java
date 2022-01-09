package com.greedy.level01.basic.student.model.dto;

public class StudentDTO {
	
	private int grade;		// 학년
	private int classroom;	// 반
	private String name;	// 이름
	private int kor;		// 국어점수
	private int eng;		// 영어점수
	private int math;		// 수학점수
	
	/* 기본생성자 명시적 작성 */
	public StudentDTO() {}
	
	/* 모든 필드를 초기화 하는 생성자 */
	public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	/* setter */
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	/* getter */
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String gerName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
	/* 모든 필드 값을 문자열로 반환 */
	public String getInformation() {
		return "학년=" + this.grade + ", 반=" + this.classroom + ", 이름=" + this.name + ", 국어=" + this.kor + ", 영어=" + this.eng + ", 수학=" + this.math + ", 평균 =";
	}

}
