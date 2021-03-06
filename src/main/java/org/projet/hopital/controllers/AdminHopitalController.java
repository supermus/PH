package org.projet.hopital.controllers;

import org.projet.hopital.entities.Employee;
import org.projet.hopital.metier.IAdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping(value="/adminHopital") // tous les liens pour aller vers la gestion doivent commencer par /adminHopital faut avoir un role admin pour y accerder
public class AdminHopitalController {
	
	// appel � la couche m�tier via l'interface IAdminHopitalMetier + injection
	
	@Autowired
	private IAdminMetier metier;
	
	@RequestMapping(value="/index")
	public String Index(Model model){
		// d�claration + initialisation
		String prenom = null;
		String nom = null;
		Long idEmploye = null;
		model.addAttribute("employee", new Employee());//pour cr�er le formulaire
		Employee employee = null;
		//model.addAttribute("adminHopital", metier.listeDossierPatient());// affichage
		return "adminHopital";
		
	}
	/*@RequestMapping(value="/SaveEmp")
	public String saveEmp(Employee e, BindingResult bindingresult, Model model){ // Bindingresult pour gerer les erreurs de validation
		// d�claration + initialisation
		String prenom = null;
		String nom = null;
		Long idEmploye = null;
		model.addAttribute("employee", new Employee());//pour cr�er le formulaire
		Employee employee = null;
		model.addAttribute("adminHopital", metier.listeDossierPatient());// affichage
		return "pageAdmin";
		
	}*/
}
