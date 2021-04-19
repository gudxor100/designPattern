package flyWeight;

public class Main {
	public static void main(String[] args) {
		String [][] map = new String[4][4];
		map[0][0] = "W"; map[0][1] = "W"; map[0][2] = "R"; map[0][3] = "T";
		map[1][0] = "G"; map[1][1] = "G"; map[1][2] = "R"; map[1][3] = "T";
		map[2][0] = "G"; map[2][1] = "G"; map[2][2] = "R"; map[2][3] = "T";
		map[3][0] = "G"; map[3][1] = "G"; map[3][2] = "R"; map[3][3] = "T";
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				StructureFlyweight sf = null;
				switch (map[i][j]) {
					case "W":
						sf = StructureFactoryFlyweight.getStructure("WALL");
						break;
					case "G":
						sf = StructureFactoryFlyweight.getStructure("GRASS");
						break;
					case "R":
						sf = StructureFactoryFlyweight.getStructure("ROAD");
						break;
					case "T":
						sf = StructureFactoryFlyweight.getStructure("TREE");
						break;
				}
				
				sf.display();
			}
		}
		
		//for compare
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				StructureFlyweight sf = null;
//				switch (map[i][j]) {
//					case "W":
//						sf = new WallFlyweight();
//					case "G":
//						sf = new GrassFlyweight();
//					case "R":
//						sf = new RoadFlyweight();
//					case "T":
//						sf = new TreeFlyweight();
//				}
//				
//				sf.display();
//			}
//		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("ÃÑ °É¸° ½Ã°£(ms) : " + (endTime - startTime));
	}
}
