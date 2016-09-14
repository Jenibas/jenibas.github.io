import java.util.Scanner;

public class Minstep {
	public static void main(String[] args) {
		int n;
		Scanner read = new Scanner(System.in);
		n = read.nextInt();
		int firstStep[] = new int[n];
		int lastStep[] = new int[n];
		for (int count = 0; count < n; count++) {
			firstStep[count] = read.nextInt();
			lastStep[count] = read.nextInt();
		}
		read.close();
		for (int count = 0; count < n; count++) {
			
			int stepsToTravel = lastStep[count] - firstStep[count];
			if (stepsToTravel > -1) {
			
				int n1= 1;
				int countSteps = 0;
				if (stepsToTravel > 1) {
					String output = "1 1";
					countSteps = countSteps + 2;
					stepsToTravel = stepsToTravel - 2;
					while (stepsToTravel > 0) {
						
						if (stepsToTravel >= (2 * n1 + 2)) {
							countSteps = countSteps + 2;
							
							stepsToTravel = stepsToTravel - (2 * n1) - 2;
							n1++;
						} else if (stepsToTravel == (2 * n1 + 1)) {
							countSteps = countSteps + 2;
							
							stepsToTravel = stepsToTravel - (2 * n1) - 1;
						} else if (stepsToTravel == (2 * n1)) {
							{
								if (n1== 1) {
									countSteps = countSteps + 1;
									output = output.concat(" " + (2 * n1));
									stepsToTravel = stepsToTravel - 2;
									continue;
								}
								countSteps = countSteps + 2;
								
							}

						} else {
							countSteps++;
							
							stepsToTravel = 0;
						}
					}
					
				} else if (stepsToTravel == 1) {
					countSteps++;
				}

				System.out.println(countSteps);
			} else {
				System.out.println("Invalid input");
			}
		}
	}
}
