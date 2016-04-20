package org.projet.hopital.controllers;

import org.projet.hopital.metier.IAdminHopitalMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping(value="/adminHopital") // tous les liens pour aller vers la gestion doivent commencer par /adminHopital
public class AdminHopitalController {
	
	// appel à la couche métier via l'interface IAdminHopitalMetier + injection
	
	@Autowired
	private IHopitalMetier metier;
	
	@RequestMapping(value="/index")
	public String Index(Model model){
		return "pageAdmin";
		
	}
}