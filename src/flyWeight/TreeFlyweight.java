package flyWeight;

public class TreeFlyweight implements StructureFlyweight {
	public TreeFlyweight() {
		System.out.println("나무 생성");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void display() {
		System.out.println("나무 표시");
	}
}
