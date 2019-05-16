package fr.p10.miage.visitorClient.model;

import fr.p10.miage.visitorClient.contrat.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class GroupeClient {
    private String name;
    public List<Client> clients = new ArrayList<Client>();

    public GroupeClient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void accept(IVisitor visitor){

    }

    public  void addClient(Client c){
        clients.add(c);
    }
}
