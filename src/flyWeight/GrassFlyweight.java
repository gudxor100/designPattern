package flyWeight;

public class GrassFlyweight implements StructureFlyweight {
	public GrassFlyweight() {
		System.out.println("Ǯ ����");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void display() {
		System.out.println("Ǯ ǥ��");
	}
}
