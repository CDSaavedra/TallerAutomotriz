package WorldOffice.TallerAutomotriz.Interfaces;


import java.util.List;
import java.util.Optional;

import WorldOffice.TallerAutomotriz.Models.HistoricoRep;

public interface IhistoricoRepService  {
	
Optional<HistoricoRep> findById	(Long Id);

void save(HistoricoRep historicoRep);

List<HistoricoRep> findAll();

void deleteById(Long id);
}


