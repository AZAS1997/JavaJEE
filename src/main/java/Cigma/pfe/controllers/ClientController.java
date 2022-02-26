package Cigma.pfe.controllers;
import Cigma.pfe.models.Client;
import Cigma.pfe.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
@Controller
public class ClientController {
@Autowired
	private ClientService service ;

	@PostMapping("/create")
	public Client save(Client clt) {
		return service.save(clt);
	}
	@PutMapping("/update")
	public Client modify(Client clt) {
		return service.modify(clt);
	}
	public void remove(long idClt) {
		service.remove(idClt);
	}
	@GetMapping("/{id}")
	public Client getOne(long idClt) {
		return service.getOne(idClt);
	}
	@GetMapping("/all")
	public List<Client> getAll() {
		return service.getAll();
	}

}
