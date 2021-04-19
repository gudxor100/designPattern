package proxy;

public class CEO implements Worker {
	private Manager manager;
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	private void complete() {
		System.out.println("--�۾��Ϸ�--");
	}
	
	@Override
	public void process(int grade) {
		if (grade == 1) {
			System.out.println("CEO�� ���� ó���մϴ�.");
		} else {
			System.out.println("CEO�� ���� ó���� �ʿ䰡 �����ϴ�.");
			manager.process(grade);
		}
		
		complete();
	}
}
