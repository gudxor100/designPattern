package proxy;

public class Staff implements Worker {
	private Manager manager;
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public void process(int grade) {
		if (grade < 3) {
			System.out.println("STAFF�� ó���� �� ���� ���Դϴ�..");
			System.out.println("�ٽ� Ȯ�����ּ���");
			manager.process(grade);
		} else {
			System.out.println("STAFF�� " + grade + "����� ���� ó���մϴ�.");
		}
		
	}
}
