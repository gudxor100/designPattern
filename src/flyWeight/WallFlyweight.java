package flyWeight;

public class WallFlyweight implements StructureFlyweight {
	public WallFlyweight() {
		System.out.println("�� ����");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void display() {
		System.out.println("�� ǥ��");
	}
}
