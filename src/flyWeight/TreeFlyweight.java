package flyWeight;

public class TreeFlyweight implements StructureFlyweight {
	public TreeFlyweight() {
		System.out.println("���� ����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void display() {
		System.out.println("���� ǥ��");
	}
}
