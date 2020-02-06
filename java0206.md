### 자바 추가

생성자 함수는 타입이 없다 즉 (void형이 아니라) 타입자체가 없다.

**manager.java**
```
package hw_java_0205;

public class Manager2 {
	int max = 20;
	Tv[] arr1;
	Refrigerator[] arr2;
	int idx1 = 0;
	int idx2 = 0;
	
	Manager2(){
		arr1 = new Tv[max];
		arr2 = new Refrigerator[max];
	}
	
	public void insert(int i, String st, int j, int k, int l, String st2) {
		if(idx1 >= max) System.out.println("더이상 들어갈 자리가 없습니다.");
		else {
			Tv tv = new Tv(i, st, j, k, l, st2);
			arr1[idx1] = tv;
			idx1++;
		}
	}
	public void insert(int i, String st, int j, int k, int l) {
		if(idx2 >= max) System.out.println("더이상 들어갈 자리가 없습니다.");
		else {
			Refrigerator re = new Refrigerator(i, st, j, k, l);
			arr2[idx2] = re;
			idx2++;
		}
	}
	void list(int type) {
		if(type == 1) {
			if(idx1 == 0) System.out.println("등록된 리스트가 존재하지 않습니다.");
			else {
				for(int i=0;i<idx1;i++)
					System.out.println(arr1[i].toString());
			}
		}
		else {
			if(idx2 == 0) System.out.println("등록된 리스트가 존재하지 않습니다.");
			else {
				for(int i=0;i<idx2;i++)
					System.out.println(arr2[i].toString());
			}	
		}
	}
}

```
**productTest.java**
```
package hw_java_0205;

public class ProductTest {
	public static void main(String[] args) {
		Manager2 m = new Manager2();
		
		m.insert(1001,"삼성티비1",200000,20,34,"QLED");
		m.insert(1002,"삼성티비2",344000,26,34,"QLED");
		m.insert(1003,"삼성티비3",544000,15,34,"QLED");
		m.insert(1004,"삼성티비4",112000,21,34,"QLED");
		
		
		m.insert(2001,"삼성냉장고1", 340000, 19, 50);
		m.insert(2002,"삼성냉장고2", 640000, 12, 50);
		m.insert(2002,"삼성냉장고3", 840000, 11, 50);
		
		m.list(1);
		System.out.println("-------------------------------------------------------------");
		m.list(2);
	}
}
```

**Reprigerator.java**

```
package hw_java_0205;

public class Refrigerator {
	private int p_num;
	private String p_name;
	private int price;
	private int remain;
	private int L;
	
	public Refrigerator(int i, String n, int p, int r, int l) {
		this.p_num = i;
		this.p_name = n;
		this.price = p;
		this.remain = r;
		this.L = l;
	}
	public String toString() {
		return "품번 : " + p_num  + " " + "|" + " " + "제품이름 : " + p_name + " " + "|" + " " 
			   + "가격 : " + price + " " + "|" + " " + "재고수량 : " + remain + " " + "|" + " "
			   + "제품용량 : " + L;
	}
}
```

**Tv.java**

```
package hw_java_0205;
/*
 * 관리해야 할 제품으로 TV와 냉장고가 있고, 이들 제품의 공통 정보로는 제품번호, 제
 * 품명, 가격 정보, 재고수량이 있으며, 추가 정보로 TV은 인치, 디스플레이타입 정보
 * 를, 냉장고는 용량(L) 정보를 가지고 있다
 * */
public class Tv {
	private int p_num;
	private String p_name;
	private int price;
	private int remain;
	private int inch;
	private String display_type;
	
	public Tv(int i, String n, int p, int r, int inch, String type) {
		this.p_num = i;
		this.p_name = n;
		this.price = p;
		this.remain = r;
		this.inch = inch;
		this.display_type = type;
	}
	public String toString() {
		return "품번 : " + p_num  + " " + "|" + " " + "제품이름 : " + p_name + " " + "|" + " " 
			   + "가격 : " + price + " " + "|" + " " + "재고수량 : " + remain + " " + "|" + " "
			   + "인치 : " + inch + " " + "|" + " " + "디스플레이유형 : " + display_type;
	}
}

```
