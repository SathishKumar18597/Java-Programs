package softSauveExample;


public class CheckRound3 {

	static int count = 0;

	static int gasrefill(int fuel, int limit[], int locStation[], int distance) {
		int match = 0, nextStation = 0;
		for (int i = 0; i < limit.length - 1; i++) {
			if (distance == locStation[i]) {
				match = locStation[i];
				nextStation = locStation[i + 1];
			}

				if (fuel < (nextStation - match)) {
					for (int j = 0; j < limit.length; j++) {
						if (i == j) {
							fuel = fuel + limit[j];
							count++;
							return fuel;
						}
					}
				
			}
		}
		return fuel;
	}

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the number of GasStations");
		int numberOfStation = 3;
		int locStation[] = new int[] {12,15,17};
		////System.out.println("Enter the location of the Stations");
		//for (int i = 0; i < locStation.length; i++)
			//locStation[i] = scan.nextInt();
		//System.out.println("Enter the stations that provide fuel");
		/*int availStation = scan.nextInt();
		if (numberOfStation != availStation) {
			System.out.println("Invalid Scenario");
			System.exit(0);
		}
		System.out.println("Enter the limit of each station");*/
		int limit[] = new int[] {3,2,3};
		/*for (int i = 0; i < limit.length; i++)
			limit[i] = scan.nextInt();
		System.out.println("Enter the total distance from home to the office ");*/
		int distance = 20;
		//System.out.println("Enter the available fuel in the car initialy");
		int fuel = 12;
		//scan.close();

		for (int i = 1, j = 0; i <= distance && j < locStation.length - 1; i++) {
			if (i == locStation[j]) {
				fuel = gasrefill(fuel, limit, locStation, i);
				j++;

			}
			fuel--;
			if (fuel < 0) {
				System.out.println("Office can't be reached");
			}

		}
		System.out.println(count);
		System.out.println(fuel);
	}
}