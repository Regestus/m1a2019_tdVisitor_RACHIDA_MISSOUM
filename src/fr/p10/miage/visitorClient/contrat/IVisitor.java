package fr.p10.miage.visitorClient.contrat;

import fr.p10.miage.visitorClient.model.Client;
import fr.p10.miage.visitorClient.model.Commande;
import fr.p10.miage.visitorClient.model.Ligne;

public interface IVisitor {
    public void visit(Client c);
    public void visit(Commande o);
    public void visit(Ligne l);
    public void afficherCommandes();
}
