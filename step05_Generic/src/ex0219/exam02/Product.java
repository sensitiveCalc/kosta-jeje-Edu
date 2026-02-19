package ex0219.exam02;

public class Product<K, M> {
	//상품의 종류
	private K kind; // Tv or Vidio
	
	//상품 모델 정보
	private M model;

	public void setKind(K kind) {
		this.kind = kind;
	}
	public K getKind() {
		return kind;
	}

	public void setModel(M model) {
		this.model = model;
	}
	public M getModel() {
		return model;
	}
}
