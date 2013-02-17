package desk;

public class Propability {
	
	int propability[];
	int tp[];						// total propability
	
	public Propability() {
		propability[0] = 5;
		propability[1] = 9;
		propability[2] = 6;
		propability[3] = 16;
		propability[4] = 23;
		propability[5] = 30;
		propability[6] = 9;
		propability[7] = 12;
		propability[8] = 12;
		propability[9] = 12;
		propability[10] = 9;
		propability[11] = 8;
		propability[12] = 3;
		propability[13] = 8;
		propability[14] = 12;
		propability[15] = 12;
		propability[16] = 12;
		propability[17] = 19;
		propability[18] = 10;
		propability[19] = 6;
		propability[20] = 8;
		propability[21] = 23;
		propability[22] = 12;
		propability[23] = 12;
		propability[24] = 16;
		
		/*for(int c = 0; c <= 24; c++) {									// napevno stanovená hodnota podmínky, pozor pøi mìnìní poètu karet!!
			int sum = 0;
			for(int x = 0; x <= c; x++) {
				sum += propability[x];
			}
			tp[c] = sum;
			System.out.println(sum);
			sum = 0;
		}*/
		
		System.out.println(propability[0]);
		
	}
		
	public int getPropability(int i) {
		return 5;
	}
	
	public int getTP(int i) {
		return tp[i];
	}
}
