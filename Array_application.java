
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Array_application {
    

	private static class TrainSchedule {
		int arrivalTime, deptTime;
		TrainSchedule(int arrivalTime, int deptTime)
		{
			this.arrivalTime = arrivalTime;
			this.deptTime = deptTime;
		}
		public String toString()
		{
			return "(" + this.arrivalTime + ","
				+ this.deptTime + ")";
		}
	}

	private static class SortByArrival
		implements Comparator<TrainSchedule> {
		@Override
		public int compare(TrainSchedule o1,
						TrainSchedule o2)
		{
			return o1.arrivalTime - o2.arrivalTime;
		}
	}
	
	public static int countPlatforms(int[] arr, int[] dep){
		TrainSchedule[] trains
			= new TrainSchedule[arr.length];
		for (int i = 0; i < arr.length; i++) {
			trains[i] = new TrainSchedule(arr[i], dep[i]);
		}

		Arrays.sort(trains, new SortByArrival());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(trains[0].deptTime);
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			TrainSchedule curr = trains[i];
	
			if (curr.arrivalTime <= pq.peek()) {
				count++;
			}
			else {
				pq.poll();
			}
			pq.add(curr.deptTime);
		}
		
		return count;
	}

	public static void main(String[] args)
	{
		int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
		int res = countPlatforms(arr, dep);
		System.out.println(res);
	}

    
}
