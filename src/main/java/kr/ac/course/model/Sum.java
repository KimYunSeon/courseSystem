package kr.ac.course.model;

public class Sum {

	private int subj1; //전선
	private int subj2; //전기
	private int subj3; //전지
	private int subj4; //일교
	private int subj5; //핵교
	private int subj6; //교필
	private int sum;
	
	public Sum(){
		this.subj1 = 0;
		this.subj2 = 0;
		this.subj3 = 0;
		this.subj4 = 0;
		this.subj5 = 0;
		this.subj6 = 0;
		this.sum = 0;
	}
	
	public void setSum(int subj1, int subj2, int subj3, int subj4, int subj5, int subj6,int sum){
		this.subj1 = subj1;
		this.subj2 = subj2;
		this.subj3 = subj3;
		this.subj4 = subj4;
		this.subj5 = subj5;
		this.subj6 = subj6;
		this.sum = sum;
	}

	

	public int getSubj1() {
		return subj1;
	}

	public void setSubj1(int subj1) {
		this.subj1 = subj1;
	}

	public int getSubj2() {
		return subj2;
	}

	public void setSubj2(int subj2) {
		this.subj2 = subj2;
	}

	public int getSubj3() {
		return subj3;
	}

	public void setSubj3(int subj3) {
		this.subj3 = subj3;
	}

	public int getSubj4() {
		return subj4;
	}

	public void setSubj4(int subj4) {
		this.subj4 = subj4;
	}

	public int getSubj5() {
		return subj5;
	}

	public void setSubj5(int subj5) {
		this.subj5 = subj5;
	}

	public int getSubj6() {
		return subj6;
	}

	public void setSubj6(int subj6) {
		this.subj6 = subj6;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "전선=" + subj1 + ", 전기=" + subj2 + ", 전지=" + subj3 + ", 일교=" + subj4 + ", 핵교=" + subj5
				+", 교필=" + subj5+ ", 합계=" + sum + "";
	}
	
	
}
