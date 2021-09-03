package model;

public class Store {
	Zone[] z;
	int numberOfZones;
	
	public Store() {
		this.z = new Zone[100];
		this.numberOfZones = 0;
	}
	
	public Zone[] getZones() {
		Zone[] z = new Zone[numberOfZones];
		for(int i=0; i<numberOfZones; i++) {
			z[i] = this.z[i];
		}
		return z;
	}

	public int[] getStats(String name) {
		int[] stat = new int[2];
		
		int nor = 0;
		int nod = 0;
		
		
		for(int i=0; i<numberOfZones; i++) {
			MovieRecord[] mr = new MovieRecord[z[i].nor];
			for(int a=0; a<z[i].nor; a++) {
				mr[a] = z[i].movieRecord[a];
			}
			
			for(int j=0; j<mr.length; j++) {
				if(mr[j].getName().equals(name)) {
					nor++;
					nod += mr[j].getNumberOfDVDs();
				}
			}
		}
		
		stat[0] = nor;
		stat[1] = nod;
		
		return stat;
	}
	
	public void addZones(Zone[] zone2) {
		for(int i=0; i<zone2.length; i++) {
			this.z[numberOfZones] = zone2[i];
			this.numberOfZones++;
		}
	}
}
