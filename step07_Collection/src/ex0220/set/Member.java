package ex0220.set;

public class Member {
	private String name;
	private int age;
	private String addr;
	
	public Member() {}
	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public int hashCode() {
		//System.out.println("1");
		return name.hashCode(); //이름객체를 가진 해시코드 반환
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("2");
		if(obj instanceof Member m) {
			if( name.equals(m.getName()) && age == m.getAge() ) {
				return true; //이름 중복
			}
		}
		
		return false;
	}
}
