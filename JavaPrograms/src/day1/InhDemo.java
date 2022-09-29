package day1;
class Animal  //parent class
{
	public void eat() {
		System.out.println("All animals can eat");
	}
}

class Dog extends Animal  //child class 1
{
	public void bark() {
		System.out.println("Dogs can bark");
	}
}

class Cow extends Animal  //child class 2
{
	public void milk() {
		System.out.println("Can give milk");
	}
}

class Puppy extends Dog
{
	public void weep() {
		System.out.println("Puppy can weep");
	}
}
public class InhDemo {

	public static void main(String[] args) {
		Dog d = new Dog(); //child 1
		d.bark();
		d.eat();
		
		Cow c = new Cow();  //child 2
		c.milk();
		c.eat();

//		Puppy p = new Puppy();
//		p.bark();
//		p.eat();
//		p.weep();
	}

}
