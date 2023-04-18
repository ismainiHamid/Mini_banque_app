package ma.banque.app.IServices;

import ma.banque.app.IMetier.IMetier;
import ma.banque.app.entities.Client;

public interface IClientService extends IMetier<Client> {
    Client findByCni(String cni);
}