package flyWeight;

public class TreeFlyweight implements StructureFlyweight {
	public TreeFlyweight() {
		System.out.println("唱公 积己");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void display() {
		System.out.println("唱公 钎矫");
	}
}
