package proxy;

public class CEO implements Worker {
	private Manager manager;
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	private void complete() {
		System.out.println("--작업완료--");
	}
	
	@Override
	public void process(int grade) {
		if (grade == 1) {
			System.out.println("CEO가 직접 처리합니다.");
		} else {
			System.out.println("CEO가 직접 처리할 필요가 없습니다.");
			manager.process(grade);
		}
		
		complete();
	}
}
