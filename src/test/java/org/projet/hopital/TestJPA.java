package org.projet.hopital;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.entities.Medical;
import org.projet.hopital.metier.IAdminMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestJPA {
	@Before
	public void setUp() throws Exception {
	}
	/*@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext app=
					new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}*/
	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext context=
					new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			IAdminMetier metier=(IAdminMetier) context.getBean("metier");
			
			metier.ajouterMedical(new Medical("test", "test", "test"));
			
		} catch (Exception e) { assertTrue(e.getMessage(),false);}}
}