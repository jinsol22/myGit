package homework;


public class ControllableDemo {
	public static void main(String[] args) {
		Notebook nb = new Notebook();
		nb.turnOn();
		nb.turnOff();
		nb.repair();
		Controllable.reset();
	
}
}