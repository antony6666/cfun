package com.cdv;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.Calendar;

import org.junit.jupiter.api.Test;

class TestPrix {

	@Test
	void test() {
	double a = 0.15;
		
	ChoixMontant calculator = new ChoixMontant();
	
	String letest = calculator.ConstructeurChoixMontant(a);
	assertEquals("zero",letest);
	
	a = 0.40;
	letest = calculator.ConstructeurChoixMontant(a);
	assertEquals("zero cing",letest);
	
	a = 0.60;
	letest = calculator.ConstructeurChoixMontant(a);
	assertEquals("un",letest);
	}

}
