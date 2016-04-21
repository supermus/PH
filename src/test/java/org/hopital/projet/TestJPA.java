package org.hopital.projet;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.projet.hopital.entities.DossierPatient;
import org.projet.hopital.metier.IAdminMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJPA {
	
	@Before
	public void setUp() throws Exception {}

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext context=
		new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
			
			IAdminMetier metier = (IAdminMetier) context.getBean("metier");
			List<DossierPatient> dossierpatient1 = (List<DossierPatient>)metier.listeDossierPatient();
			metier.ajouterDossier(new DossierPatient("03/06/2000",null,null,null));
			metier.ajouterDossier(new DossierPatient("03/06/2001",null,null,null));
			
			List<DossierPatient> dossierpatient2 = metier.listeDossierPatient();
			assertTrue(dossierpatient2.size()==dossierpatient1.size()+2);
			
			
		} catch (Exception e) {
			assertTrue(e.getMessage(),false);
		}
	}

}
