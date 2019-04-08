package fr.p10.miage.rps.contrat;

import fr.p10.miage.rps.model.Client;
import fr.p10.miage.rps.model.Commande;
import fr.p10.miage.rps.model.Ligne;

public interface IVisitor {
    public void visit(Client c);
    public void visit(Commande o);
    public void visit(Ligne l);
    public void afficherCommandes();
}
