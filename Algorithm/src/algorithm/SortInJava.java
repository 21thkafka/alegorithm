package algorithm;

public class SortInJava {
	//Arrays 클래스가 primitive 타입 데이터를 위한 정렬 메서드를 제공
	int [] data = new int [capacity];
	//꽉차있는 경우
	Arrays.sort(data);
	//꽈차지 않고 SIZE개의 데이터만 있다면 다음과 같이 한다.
	Arrays.sort(data, 0, size);
	//int 이외의 다른 primitive타입 데이터(double, char 등)에 대해서도 제공
	//String도 Arrays.sort로 정렬, ArrayList같은 컬렉션은 Collections.sort 메서드로 정렬
	
}
//사용자 지정 객체 비교시 1. Comparable Interface
public class Fruit implements Comparable<Fruit>{
	public String name;
	public int quantity;
	public Fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	//과일 명 기준으로 정렬
	public int compareTo(Fruit other) {
		return name.compareTo(other.name);
	/* 다른 기준 : 수량
	 public int campareTo(Fruit other){
	 	return quantity - other.quantity;
	 	}
	 }	
	 */
	}

}
	Fruit [] fruits = new Fruit[4];
	fruits [0] = new Fruit("Pineapple", 70);
	fruits [1] = new Fruit("Apple", 100);
	fruits [2] = new Fruit("Orange", 80);
	fruits [3] = new Fruit("Banana", 90);
	
	Arrays.sort(fruits);
	}
	
	// 하나의 객체 타입에 대해서 2가지 이상의 기준으로 정렬을 지원하려면 Comparator를 사용
	Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
		public int compare(Fruit fruit1, Fruit fruit2) {
			return fruit1.name.compareTo(fruit2.name);
		}
	};
	Comparator<Fruit> quantComparator = new Comparator<Fruit>() {
		public int compare(Fruit fruit1, Fruit fruit2) {
			return fruit1.quantity - fruit2.quantity;
		}
	};
	
	//Comparator interface를 implement하는 어떤 class의 객체
	Arrays.sort(fruits, nameComparator);
	//or
	Arrays.sort(fruits, quantComparator);	
	
	//Comparator를 사용할때 가장 깔끔한 형태. 
	/*
	 * public class Fruit{
	 * 	public String name;
	 * 	public int quantity;
	 * 	public Fruit(String name, int quantity){
	 * 		this.name = name;
	 * 		this.quantity = quantity;
	 * }
	 * 사실상 규칙이므로 클래스 공유하며 쓰기 때문에 static을 붙여줌
	 * public static Comparator<Fruit> nameComparator = new Comparator<Fruit>(){
	 * 		public int compare(Fruit fruit1, Fruit fruit2){
	 * 			return fruit1.name.compareTo(fruit2.name);
	 * 		}
	 * }
	 * public static Comparator<Fruit> quantComparator = new Comparator<Fruit>(){
	 * 		public int compare(Fruit fruit1, Fruit fruit2){
	 * 			return fruit1.quantity - fruit2.quantity;
	 * 		}
	 * };
	 * }
	 */
}
