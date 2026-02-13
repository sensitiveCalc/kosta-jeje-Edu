package ex0210.과제;
/**
  상품으로 속성을 관리하는 개체
*/
public class Goods{
	private String code; //상품코드 null
	private String name;//상품이름  null
	private int price;//가격 0 
	private String explain;//설명 null
	
	// 기본 생성자(를 만들고 오버로딩 하는 것을 권장)
	public Goods(String code, String name, int price, String explain) {
		this(code, price, explain); //아래의 생성자를 재사용
		this.name = name;
	}
	
	public Goods(String code, int price, String explain) {
		this.code = code;
		this.price = price;
		this.explain = explain;
	}
	

	//setXxx
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setExplain(String explain) {
		this.explain = explain;
	}
	
	//getXx
	public String getCode() {
		return code;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getExplain() {
		return explain;
	}
	
	
}