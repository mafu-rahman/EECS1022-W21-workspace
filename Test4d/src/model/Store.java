package model;

public class Store {
	Zone[] zone;
	int noz;
	
	
	
	public Store() {
		this.zone = new Zone[100];
		this.noz = 0;
	}
	
	/*
	 * Accessors
	 */
	
	public Zone[] getZones() {
		Zone[] z = new Zone[noz];
		for(int i=0; i<noz; i++) {
			z[i] = this.zone[i];
		}
		return z;
	}

	public int[] getStats(String name) {
		int[] stat = new int[2];
		
		int nor = 0;
		int nod = 0;
		
		
		for(int i=0; i<noz; i++) {
			MovieRecord[] mr = new MovieRecord[zone[i].nor];
			for(int a=0; a<zone[i].nor; a++) {
				mr[a] = zone[i].movieRecord[a];
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
	
	
	/*
	 * Mutators
	 */
	
	public void addZones(Zone[] z) {
		for(int i=0; i<z.length; i++) {
			this.zone[noz] = z[i];
			this.noz++;
		}
	}
}
