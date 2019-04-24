package popcorn;

public class popcornMaker {
public static void main(String[] args) {
	Microwave bob = new Microwave();
	Popcorn mom= new Popcorn("kernels");
	bob.putInMicrowave(mom);
	bob.setTime(5);
	bob.startMicrowave();
	mom.eat();
} 
}
