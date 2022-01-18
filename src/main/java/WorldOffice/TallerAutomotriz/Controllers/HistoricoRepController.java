package WorldOffice.TallerAutomotriz.Controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import WorldOffice.TallerAutomotriz.Models.HistoricoRep;
import WorldOffice.TallerAutomotriz.Services.HistoricoRepService;



@RestController
@RequestMapping ("historico")
public class HistoricoRepController {

@Autowired
private HistoricoRepService historicoRepService;


@GetMapping("/ConsultarTH/")
public List<HistoricoRep> findAll(){
return historicoRepService.findAll();
}
@GetMapping("/consHistorico/{id}")
public Optional<HistoricoRep> findById (@PathVariable Long id) {
	return historicoRepService.findById(id);
}

@PostMapping("/crearH")
public void save (@RequestBody HistoricoRep historicoRep) {
	 historicoRepService.save(historicoRep);
}

@DeleteMapping("/borrarH/{id}")

public void deleteById (@PathVariable Long id) {
	 historicoRepService.deleteById(id);
	
	
}



}