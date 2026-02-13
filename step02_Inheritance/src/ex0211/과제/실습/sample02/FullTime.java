package ex0211.과제.실습.sample02;

public class FullTime extends Employee {
	private int salary;
	private int bonus;
	
	public FullTime() {}
	public FullTime(int empNo, String eName, String job, int mgr, String hiredate, 
			String deptName, int salary, int bonus) {
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.salary= salary;
		this.bonus= bonus;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void message() {
		System.out.println(super.geteName() + "님은 정규직 사원입니다.");
		this.toString();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append( super.toString() ); //부모클래스 employee에서 문자열을 불러옴
		sb.append(", salary =");
		sb.append(salary);
		sb.append(", bonus =");
		sb.append(bonus);
		sb.append("]");
		
		return sb.toString();
	}
	
}
