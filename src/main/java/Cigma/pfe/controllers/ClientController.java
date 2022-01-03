package Cigma.pfe.controllers;
import Cigma.pfe.models.Client;
import Cigma.pfe.services.ClientService;
import Cigma.pfe.services.ClientServiceImpl;

public class ClientController {
	
	//ClientService clientService = new ClientServiceImpl();
	//public Client save(Client c ){
	//System.out.println("ClientController level...");
	//return clientService.save(c);
	ClientService clientService;
	public void setClientService(ClientService clientService) {
	this.clientService = clientService;
	}
	
	public ClientController() {
		System.out.println("Call ClientController ....");
		}

}
