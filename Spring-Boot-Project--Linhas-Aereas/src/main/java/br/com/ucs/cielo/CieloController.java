package br.com.ucs.cielo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ucs.cielo.model.Aeronave;
import br.com.ucs.cielo.model.Reserva;
import br.com.ucs.cielo.model.Rota;
import br.com.ucs.cielo.repository.AeronavesRepository;
import br.com.ucs.cielo.repository.ReservasRepository;
import br.com.ucs.cielo.repository.RotasRepository;

@Controller
public class CieloController {
	
	@Autowired
	private AeronavesRepository aeronavesRepository;
	@Autowired
	private RotasRepository rotasRepository;
	@Autowired
	private ReservasRepository reservasRepository;
	
	@RequestMapping("/")	
	public String index() {
		return "index";
	}
	
	@RequestMapping("listaaeronaves")
	public String listaaeronaves(Model model) {
		
		Iterable<Aeronave> aeronaves = aeronavesRepository.findAll(); 
		model.addAttribute("aeronaves", aeronaves);
		
		return "listaaeronaves";
	}
	
	@RequestMapping(value= "salvaraeronave", method = RequestMethod.POST)
	public String salvarAeronave(@RequestParam("fabricante") String fabricante,
	                     @RequestParam("modelo") String modelo, @RequestParam("capacidade") Integer capacidade, 
	                     Model model ){

	    Aeronave novaAeronave = new Aeronave(fabricante, modelo, capacidade);
	    aeronavesRepository.save(novaAeronave);

	    Iterable<Aeronave> aeronaves = aeronavesRepository.findAll();
	    model.addAttribute("aeronaves", aeronaves);

	    return "listaaeronaves";
	}		

	@RequestMapping("listarotas")
	public String listarotas(Model model) {
		
		Iterable<Rota> rotas = rotasRepository.findAll(); 
		model.addAttribute("rotas", rotas);

		Iterable<Aeronave> aeronaves = aeronavesRepository.findAll(); 
		model.addAttribute("aeronaves", aeronaves);		
		
		return "listarotas";
	}	
	
	@RequestMapping(value= "salvarrota", method = RequestMethod.POST)
	public String salvarRota(@RequestParam("origem") String origem,
	                     @RequestParam("destino") String destino, @RequestParam(value="aeronave_id", required=false) Integer aeronave_id , 
	                     Model model ){

	    Rota novaRota = new Rota(origem, destino, aeronave_id);
	    rotasRepository.save(novaRota);

	    Iterable<Rota> rotas = rotasRepository.findAll();
	    model.addAttribute("rotas", rotas);

	    return "listarotas";
	}		
	
	@RequestMapping("listareservas")
	public String listareservas(Model model) {
		
		Iterable<Reserva> reservas = reservasRepository.findAll(); 
		model.addAttribute("reservas", reservas);
		
		return "listareservas";
	}
	
}
