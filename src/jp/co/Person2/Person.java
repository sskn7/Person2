package jp.co.Person2;

public class Person {
	public String name = null;
	public int age = 0;
	
	//コンストラクタ１
	public Person(){}
	
	//コンストラクタ２
	public Person (String name,int age) {
		this.name = name;
		this.age = age;
		//thisとはこのクラスのインスタンスの変数であることを表す。
	}
	
	//コンストラクタ３　演習４
	public Person (String name) {
		this.name = name;
		this.age = 0;
	}
	
	//コンストラクタ４
	public Person (int age) {
		this.name = "名前なし";
		this.age = age;
	}
	
	//コンストラクタ５
	public Person (int age,String name) {
		this.name = name;
		this.age = age;
	}

}
