package flyWeight;

public class RoadFlyweight implements StructureFlyweight {
	public RoadFlyweight() {
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
