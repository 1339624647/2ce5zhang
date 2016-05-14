package cn.edu.qdu.test;

public class Dog {
	private String name;
    private int age;
	public void sleep() {
		System.out.println("sleep");
	}

	public Dog(String name) {
       super();
       this.name=name;
	}
	
	public Dog(int age) {
		super();
		this.age=age;
		
	}

	public void eat(String food) {
		System.out.println("eat" + food);
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
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

}
