package proxy;

public class Manager implements Worker {
	private CEO ceo;
	private Staff staff;
	
	public void setCeo(CEO ceo) {
		this.ceo = ceo;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	@Override
	public void process(int grade) {
		if (grade < 2) {
			System.out.println("MANAGER�� ó���� �� ���� ���Դϴ�..");
			System.out.println("�ٽ� Ȯ�����ּ���");
			ceo.process(grade);
		} else if (grade == 2) {
			System.out.println("MANAGER�� " + grade + "����� ���� ó���մϴ�.");
		} else {
			System.out.println("MANAGER�� ���� ó���� �ʿ䰡 �����ϴ�.");
			staff.process(grade);
		}
	}

}
