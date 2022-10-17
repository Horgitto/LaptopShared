package cokingPlant.cokeRun;

public class CokeOutput {
	
	public int ProcessCoke(int cokingTime, int ovenAmount, CokeOven oven) {
		
		return 0;
	}
	
	public int ProcessCokeDefaultOven(int cokingTime, int ovenAmount) {
		CokeOven defaultOven = new CokeOven(40);
		int cycles = 0;
		int hoursLeftInDay = 24;
		while(hoursLeftInDay>=0) {
			hoursLeftInDay=-cokingTime;
			cycles++;
		}
		return ovenAmount*defaultOven.getCapacity()*cycles;
		// daily coke output using default oven capacity
	}
	
}


class CokeOven{
	private int capacityInTons;
	public CokeOven(int tons) {
		this.capacityInTons = tons;
	}
	public int getCapacity() {
		return capacityInTons;
	}
}