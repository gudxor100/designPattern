package proxy;

public class Main {
	public static void main(String[] args) {
		CEO ceo = new CEO();
		Manager manager = new Manager();
		Staff staff = new Staff();

		ceo.setManager(manager);
		manager.setCeo(ceo);
		manager.setStaff(staff);
		staff.setManager(manager);
		
		ceo.process(1);
		ceo.process(2);
		ceo.process(5);
	}
}
