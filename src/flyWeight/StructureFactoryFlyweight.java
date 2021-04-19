package flyWeight;

import java.util.HashMap;

public class StructureFactoryFlyweight {
	public static HashMap<String, StructureFlyweight> map = 
			new HashMap<String, StructureFlyweight>();
	
	public static StructureFlyweight getStructure(String type) {
		StructureFlyweight structure = map.get(type);
		
		if(structure == null) {
			switch (type) {
				case "TREE": 
					structure = new TreeFlyweight();
					break;
				case "GRASS": 
					structure = new GrassFlyweight();
					break;
				case "ROAD": 
					structure = new RoadFlyweight();
					break;
				case "WALL": 
					structure = new WallFlyweight();
					break;
			}
			
			map.put(type, structure);
		}
		
		return structure;
	}
}
