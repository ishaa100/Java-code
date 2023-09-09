import java.util.ArrayList;
import java.util.List;
public class First_lastElement {

	public static void getFirstLat(List<Integer> list)	{

		System.out.println("ArrayList contains: " + list);
		if (list != null && !list.isEmpty()) {
			if (list.get(0) < list.get(list.size() - 1)) {

				System.out.println("Minimum Value: "
								+ list.get(0));
				System.out.println("Maximum Value: "
						+ list.get(list.size() - 1));
				return;
			}

			else {

				
				System.out.println("Minimum Value: "
							+ list.get(list.size() - 1));
				System.out.println("Maximum Value: "
								+ list.get(0));
				return;
			}
		}
	}

	public static void main(String[] args)
	{
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);

		getFirstLat(al);
	}
}
    

