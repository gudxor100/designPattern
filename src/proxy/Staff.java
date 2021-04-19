package proxy;

public class Staff implements Worker {
	private Manager manager;
	
	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public void process(int grade) {
		if (grade < 3) {
			System.out.println("STAFF가 처리할 수 없는 일입니다..");
			System.out.println("다시 확인해주세요");
			manager.process(grade);
		} else {
			System.out.println("STAFF가 " + grade + "등급의 일을 처리합니다.");
		}
		
	}
}
