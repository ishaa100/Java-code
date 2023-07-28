import java.util.HashMap;
public class Marks_list {
    
	public static void main(String[] args){
		// Create an empty hash map by declaring object
		// of string and integer type
		HashMap<String, Integer> map = new HashMap<>();

		// Adding elements to the Map
		// using standard put() method
		map.put("Maths", 100);
		map.put("Physics", 85);
		map.put("Chemistry", 86);

		
		System.out.println("Size of map is:- "
						+ map.size());

		
		System.out.println(map);

		
		if (map.containsKey("Maths")) {

			// Mapping
			Integer a = map.get("Maths");

			
			System.out.println("value for key"+ " \"Maths\" is:- " + a);
		}
	}
}


