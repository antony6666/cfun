package com.cdv;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCouleur {

	@Test
	void test() {
		//test couleur vert
		Couleur vert = Couleur.vert;
		ChoixCouleur newChoixv = new ChoixCouleur(0.6);
		assertEquals(vert, newChoixv.getCouleur());
		
		//test couleur orange
		Couleur orange = Couleur.orange;
		ChoixCouleur newChoixo = new ChoixCouleur(0.8);
		assertEquals(orange, newChoixo.getCouleur());
		
		//test couleur rouge
		Couleur rouge = Couleur.rouge;
		ChoixCouleur newChoixr = new ChoixCouleur(1);
		assertEquals(rouge, newChoixr.getCouleur());
}

}
