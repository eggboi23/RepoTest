package Labs;

public class Cat {
	
	//Attributes
	private String name;
	private int age;
	private int height;
	
	//Constructors
	public Cat() {
		this.name = "Brandon";
		this.age = 0;
		this.height = 1;
	}
	
	public Cat(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	//Methods
	
	public boolean equals(Cat other) {
		return this.name.equals(other.name) &&
				this.age == other.age &&
				this.height == other.height;
	}
	
	public String toString() {
		String output = "Name: " + this.name + "\n";
		output += "Age: " + this.age + "\n";
		output += "Height: " + this.displayHeight() + "\n";
		return output;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public String displayHeight() {
		int feet = this.height / 12;
		int inches = this.height % 12;
		return feet + " Ft " + inches + " inches ";
	}
	
	public void displayStats() {
		System.out.println(getName() + " is " + getAge() + " years old");
		System.out.println(getName() + " is " + displayHeight() + "\n");
	}
	
	public void grow() {
		int randomAge = (int) (Math.random() * 100) + 1;
		this.age += randomAge;
		int randomHeight = (int) (Math.random() * 500) + 1;
		this.height += randomHeight;
	}
	
	public void compareTo(Cat cat) {
		if (this.age > cat.age)
			System.out.print(this.name + " is older than " + cat.name + " and ");
		else if (this.age == cat.age)
			System.out.print(this.name + " is the same age as " + cat.name + " and ");
		else
			System.out.print(this.name + " is younger than " + cat.name + " and ");
		
		if (this.height > cat.height)
			System.out.println("is also bigger");
		else if (this.height == cat.height)
			System.out.println("is the same size");
		else
			System.out.println("is also smaller");
	}
}
