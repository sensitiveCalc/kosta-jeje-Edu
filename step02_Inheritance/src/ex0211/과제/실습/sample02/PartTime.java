package ex0211.과제.실습.sample02;

	
public class PartTime  extends Employee { //서브 클래스에서 변수 재정의
		private int empNo;
		private String eName;
		private String job;
		private int mgr;
		private String hiredate;
		private String deptName;
		private int timePay;
		
		
		//매개변수 생성자
		public PartTime() {}
		public PartTime(int empNo, String eName, String job, int mgr, String hiredate, 
				String deptName, int timePay) {
			super(empNo, eName, job, mgr, hiredate, deptName);
			this.timePay = timePay;
		}
		
		public int getTimePay() {
			return timePay;
		}
		public void setTimePay(int timePay) {
			this.timePay = timePay;
		}

		public void message() {
			System.out.println(super.geteName() + "님은 비정규직 사원입니다.");
			this.toString();
		}
		
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append( super.toString() ); //부모클래스 employee에서 문자열을 불러옴
			sb.append(", timePay =");
			sb.append(timePay);
			sb.append("]");
			
			return sb.toString();
		}
		
}
