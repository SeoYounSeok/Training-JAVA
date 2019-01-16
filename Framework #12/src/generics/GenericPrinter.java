package generics;

// 클래스 내부에서 사용할 데이터 타입을 나중에 인스턴스를 생성할 때 확정하는 것을 제네릭! 
public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString(){
		return material.toString();
	}
	
//	public void printing() {
//		material.doPrinting();
//	}
}