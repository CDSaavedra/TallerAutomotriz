package WorldOffice.TallerAutomotriz.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import WorldOffice.TallerAutomotriz.Interfaces.IhistoricoRepService;
import WorldOffice.TallerAutomotriz.Models.HistoricoRep;
import WorldOffice.TallerAutomotriz.Repositories.HistoricoRepRepository;


@Service
public class HistoricoRepService implements IhistoricoRepService {

	@Autowired
	private HistoricoRepRepository historicoRepRepository;

	@Override
	public Optional<HistoricoRep> findById(Long Id) {
		// TODO Auto-generated method stub
		return historicoRepRepository.findById(Id);
	}

	@Override
	public void save(HistoricoRep historicoRep) {
		historicoRepRepository.save(historicoRep);
		
	}

	@Override
	public List<HistoricoRep> findAll() {
		return historicoRepRepository.findAll();
	}
	
	

	public  void deleteById(Long id) {
			historicoRepRepository.deleteById(id);	
	}




	

}
