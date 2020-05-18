package mx.com.bayport.sai.controllers;

import java.util.Date;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import mx.com.bayport.sai.document.Concepts;
import mx.com.bayport.sai.services.IConceptServices;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class ConceptsRestController {

	@Autowired
	private IConceptServices iConceptService;
	
	@GetMapping("/concepts")
	public List<Concepts> listConcepts(){
	  return  iConceptService.findAll();	
	}
	
	@GetMapping("/concepts/{id}")
	public Optional<Concepts> showConcept(@PathVariable String id){
	//	System.out.println(id);
	//  Optional<Concepts> currentConcept = iConceptService.findById(id);
	 
		return  iConceptService.findById(id);
	}
	
	@PostMapping("/concepts")
	@ResponseStatus(HttpStatus.CREATED)
	public Concepts createConcept(@RequestBody Concepts concept) {
		Concepts currentConcept = concept;
		currentConcept.setfCreation(new Date());
		return iConceptService.save(currentConcept);
	}
	
	@PutMapping("/concepts/{id}")
	public Concepts updateConcept(@RequestBody Concepts concept, @PathVariable String id) {
	      Optional<Concepts> currentConcept = iConceptService.findById(id);
		  Concepts concepts =currentConcept.get();
		  concepts.setAgreement(concept.getAgreement());
		  concepts.setPaid(concept.getPaid());
		  concepts.setName(concept.getName());
		  concepts.setStatus(concept.getStatus());
		return iConceptService.save(concepts);
	} 
	
	@DeleteMapping("/concepts/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteConcepts(@PathVariable String id) {
		iConceptService.delete(id);  
	}
}
