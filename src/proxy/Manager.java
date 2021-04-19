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
			System.out.println("MANAGER가 처리할 수 없는 일입니다..");
			System.out.println("다시 확인해주세요");
			ceo.process(grade);
		} else if (grade == 2) {
			System.out.println("MANAGER가 " + grade + "등급의 일을 처리합니다.");
		} else {
			System.out.println("MANAGER가 직접 처리할 필요가 없습니다.");
			staff.process(grade);
		}
	}

}
