package org.openfx.cfun;

public class ChoixMontant {

	public String ConstructeurChoixMontant(double a) {
		
		if (a <= 0.25) {
			return "zero";
		}else if (a > 0.25 && a < 0.5) {
			return "zero cing";
		}else if (a > 0.5 && a < 1) {
			return "un";
		}
		return null;
	}

}