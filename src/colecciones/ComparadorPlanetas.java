package colecciones;

import java.util.Comparator;

public class ComparadorPlanetas implements Comparator<Planeta> {

	@Override
	public int compare(Planeta o1, Planeta o2) {
		
		return (int)(o1.getDistacia()-o2.getDistacia());
	}

	
	
}
