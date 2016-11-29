package kr.ac.course.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

public class Subject {

	private int year;
	private int semester;
	@NotEmpty(message = "코드를 입력하시오.")
	private String code;
	@NotEmpty(message = "과목명을 입력하시오.")
	private String name;
	@NotEmpty(message = "과목 코드를 입력하시오.")
	private String type;
	
	private int credit;
	
	// 생성자 구현
	public Subject() {
		
	}
	
	public Subject(int year, int semester, String code, String name, String type, int credit) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.type = type;
		this.credit = credit;
	}
	
	//getter & setter 구현
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

	//toString 구현
	public String toString() {
		return  year + "	" + semester + "	" + code + "	" + name + "	" + type + "	" + credit;
	}
	
}
