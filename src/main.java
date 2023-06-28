import entities.Biclycle;
import entities.Car;
import entities.Vehicle;

public class main {

	public static void main(String[] args) {
		Vehicle v = new Biclycle(false, false, 0, 0, 0, false, null, 0, false, false, 0);
		
		System.out.println(v.toString());
	}

}
