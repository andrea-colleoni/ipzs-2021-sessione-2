package it.ipzs.corsodocker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import it.ipzs.corsodocker.model.Persona;

@RestController
public class DatiController {

	@GetMapping("/persone")
	public List<Persona> persone() {
		var lista = new ArrayList<Persona>();
		var p = new Persona();
		p.setNome("Mario");
		p.setCognome("Rossi");
		p.setEmail("mario@rossi.com");
		lista.add(p);
		p = new Persona();
		p.setNome("Anna");
		p.setCognome("Bianchi");
		p.setEmail("anna@bianchi.net");
		lista.add(p);
		return lista;
	}
	
	@GetMapping("/persone/{id}")
	public Persona personaPerId(@PathVariable("id") String id) {
		System.out.println(id);
		var p = new Persona();
		p.setNome("Mario");
		p.setCognome("Rossi");
		p.setEmail("mario@rossi.com");
		return p;
	}	
}
