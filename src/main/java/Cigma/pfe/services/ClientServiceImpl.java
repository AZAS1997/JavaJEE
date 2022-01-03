package Cigma.pfe.services;
import Cigma.pfe.models.Client;
import Cigma.pfe.repositories.ClientRepository;
import Cigma.pfe.repositories.ClientRepositoryImpl;


public class ClientServiceImpl implements ClientService{
	
	
	//ClientRepository clientRepository = new ClientRepositoryImpl();
	//@Override
	
	ClientRepository clientRepository ;
	
	public void setClientRepository(ClientRepository clientService) {
		this.clientRepository = clientService;
		}

	public Client save(Client c) {
	System.out.println("Service Layer : ClientServiceImpl Level... ");
	return clientRepository.save(c);
	}
	

	public ClientServiceImpl() {
		System.out.println("Call ClientServiceImpl ....");
	}
	
	
	}


