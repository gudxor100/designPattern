package flyWeight;

public class GrassFlyweight implements StructureFlyweight {
	public GrassFlyweight() {
		System.out.println("풀 생성");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void display() {
		System.out.println("풀 표시");
	}
}
