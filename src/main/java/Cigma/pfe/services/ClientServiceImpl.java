package Cigma.pfe.services;

import Cigma.pfe.repositories.ClientRepository;
import Cigma.pfe.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service

public class ClientServiceImpl implements ClientService {

@Autowired
ClientRepository clientRepository;

    @Transactional

    public Client save(Client clt) {
        return clientRepository.save(clt);
    }
    @Override
    @Transactional
    public Client modify(Client newClt) {
        Client oldClt = clientRepository.findById(newClt.getId()).get();
        oldClt.setName(newClt.getName());
        return clientRepository.save(oldClt);
    }
    @Override
    @Transactional
    public void remove(long idClt) {
        clientRepository.deleteById(idClt);
    }
    @Override
    public Client getOne(long idClt) {
        return clientRepository.findById(idClt).get();
    }
    @Override
    public List<Client> getAll() {
        return (List<Client>) clientRepository.findAll();
    }

}



