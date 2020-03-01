import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;



public class Dog extends Animal {
	public Dog(String a, int i) {
		this.name = a;
		this.nol= i;
	}

	public String toString() {
		return name + nol;
	}
	
	public static void main(String[] args) {}
}
