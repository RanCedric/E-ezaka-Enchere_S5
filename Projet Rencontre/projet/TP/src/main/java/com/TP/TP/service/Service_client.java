/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.service;

import com.TP.TP.BDD.BDD;
import com.TP.TP.model.Client;
import com.TP.TP.model.Condition;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cédric
 */
public class Service_client {
    public boolean inscription(String nom, String sexe, String naissance, String salaire, String longitude, String poids, String couleur, String bacc, String finoana, String fiangonana, String lettre) {
        boolean ret = false;
        if(checkValues(nom, sexe, naissance, salaire, longitude, poids, couleur, bacc, finoana, fiangonana, lettre)) {
            ret = true;
            Client client = new Client("0", nom, sexe, naissance, salaire, longitude, poids, couleur, bacc, finoana, fiangonana, lettre);
            client.dontSave("clientid");
            client.save();
        }
        return ret;
    }
    
    private boolean checkValues(String nom, String sexe, String naissance, String salaire, String longitude, String poids, String couleur, String bacc, String finoana, String fiangonana, String lettre) {
        boolean ret = true;
        if(
                nom.equals("")
                ||sexe.equals("")
                ||naissance.equals("")
                ||salaire.equals("")
                ||longitude.equals("")
                ||poids.equals("")
                ||couleur.equals("")
                ||bacc.equals("")
                ||finoana.equals("")
                ||fiangonana.equals("")
                ||lettre.equals("")){
            ret = false;
        }
        return ret;
    }
    
    public Object[] giveMyLoves(
            String client_id,
            String sexe,
            String naissance1,
            String naissance2,
            String naissance3,
            String salaire1,
            String salaire2,
            String salaire3,
            String longitude1,
            String longitude2,
            String longitude3,
            String poids1,
            String poids2,
            String poids3,
            String couleur1,
            String couleur2,
            String couleur3,
            String bacc1,
            String bacc2,
            String bacc3,
            String finoana1,
            String finoana2,
            String fiangonana1,
            String fiangonana2,
            String fiangonana3,
            String note
    ) {
        Condition condition = new Condition(client_id,sexe,naissance1,naissance2,naissance3,salaire1,salaire2,salaire3,
                longitude1,longitude2,longitude3,poids1,poids2,poids3,couleur1,couleur2,
                couleur3,bacc1,bacc2,bacc3,finoana1,finoana2,fiangonana1,fiangonana2,fiangonana3,note);
        
        Object[] obj = ListCondition(condition);
        ArrayList<Client> liste = (ArrayList<Client>) obj[0];        
        ArrayList<Double> listeNote = (ArrayList<Double>) obj[1];
        
        String req = "delete from condition where conditionid = '"+client_id+"'";
        condition.confirme(req);
        condition.save();
        
        return obj;
    }
    
    public double getNoteFor(Client client,Condition condition){
        double note = 0.0;
        // note naissance
        double naissance = condition.getNoteNaissance(client.getNaissance());
        
        // note salaire
        double salaire = condition.getNoteSalaire(client.getSalaire());
        
        // note longitude
        double longitude = condition.getNoteLongitude(client.getLongitude());
        
        // note poids
        double poids = condition.getNotePoids(client.getPoids());
        
        // note couleur
        double couleur = condition.getNoteCouleur(client.getCouleur());
        
        // note bacc
        double bacc = condition.getNoteBacc(client.getBacc());
        
        // note finoana 
        double finoana = condition.getNoteFinoana(client.getFinoana());
        
        // note fiangonana 
        double fiangonana = condition.getNoteFiangonana(client.getFiangonana());
        
        // calcul note
        double coef_total = condition.getTotalCoef();
        note = naissance + salaire + longitude + poids + couleur + bacc + finoana + fiangonana;
        note = note / coef_total;
        
        // verification de sexe
        if(client.getSexe() == Integer.parseInt(condition.getSexe())){
            note = -1;
        }
        return note;
    }
    
    public Object[] ListCondition(Condition condition){
        Client clientTopony = new Client();
        clientTopony.getById(condition.getConditionid());
        ArrayList<String[]> cache = clientTopony.select();
        ArrayList<Client> listeAll= new ArrayList<Client>();
        
        for(int i = 0;i<cache.size();i++){
            String[] hm = cache.get(i);
            String client_id = hm[0];
            String nom = hm[1];
            String sexe= hm[2];
            String naissance= hm[3];
            String salaire= hm[4];
            String longitude= hm[5];
            String poids= hm[6];
            String couleur= hm[7];
            String bacc= hm[8];
            String finoana= hm[9];
            String fiangonana= hm[10];
            String lettre= hm[11];
            Client caache = new Client(client_id,  nom,  sexe,  naissance,  salaire,  longitude,  poids,  couleur,  bacc,  finoana,  fiangonana,  lettre);
            listeAll.add(caache);
        }
        
        ArrayList<Client> vrai = new ArrayList<>();
        ArrayList<Double> note = new ArrayList<>();
        ArrayList<String> toetra= new ArrayList<>();
        for(int i = 0 ; i < listeAll.size();i++){
            // verifiena oe mitovy am le note tadiaviny 
            if(getNoteFor(listeAll.get(i),condition)>= Double.parseDouble(condition.getNote())){
                // verifiena oe le olona io ko ve mifanaraka aminy
                // alaina aloha condition an le olona
                Condition cachecondition = new Condition();
                String idd = String.valueOf(listeAll.get(i).getClient_id());
                cachecondition.getById(idd);
                // alaina le note tadiavn le ol koa 
                String notecache = cachecondition.getNote();
                if(getNoteFor(clientTopony,cachecondition)>= Double.parseDouble(notecache)){
                    vrai.add(listeAll.get(i));
                    note.add(getNoteFor(listeAll.get(i),condition));                    
                    toetra.add(toetra(listeAll.get(i)));
                }
            }
        }
        Object[] ret = new Object[3];
        ret[0] = vrai;
        ret[1] = note;
        ret[2] = toetra;
        return ret;
    }


    public int countOccurrences(String text, String word) {
    int count = 0;
    if (text != null) {
        Scanner scanner = new Scanner(text);
        while (scanner.hasNext()) {
            if (scanner.next().equalsIgnoreCase(word)) {
                count++;
            }
        }
    }
    return count;
}
    
    public String toetra(Client client){
        String ret = "RAS";
        return ret;
    }
    
    public int count(String text) {
    if (text != null) {
        return text.length();
    }
    return 0;
}
    
    public String noteTEXTE(String client_id){
        // alaina aloha texte any
        //Client client = new Client();
        //client.getById(client_id);
        //String texte = client.getLettre();
        
        //
        String texte = client_id; 
        
        double note = 0.0;
        
        // -1
        int nombre_tsy = countOccurrences(texte,"tsy");
        // +1
        int nombre_tia = countOccurrences(texte,"tia");
        // +1
        int nombre_mianatra = countOccurrences(texte,"mianatra");
        // +1
        int nombre_neny = countOccurrences(texte,"neny");
        // +1
        int nombre_dada = countOccurrences(texte,"dada");
        // +1
        int nombre_papa = countOccurrences(texte,"papa");
        // +1
        int nombre_mama = countOccurrences(texte,"mama");
        // -1
        int nombre_izaho = countOccurrences(texte,"izaho");
        // +1
        int nombre_izahay = countOccurrences(texte,"izahay");
        
        note += (-1*nombre_tsy);
        note += (+1*nombre_tia);
        note += (+1*nombre_mianatra);
        note += (+1*nombre_neny);
        note += (+1*nombre_dada);
        note += (+1*nombre_papa);
        note += (+1*nombre_mama);
        note += (-1*nombre_izaho);
        note += (+1*nombre_izahay);
        
        //negation
        //note += (-1*nombre_tsy);
        
        
       /*if(nombre_tsy>0) note += -1;
       if(nombre_tia>0) note += 1;
       if(nombre_mianatra>0) note += 1;
       if(nombre_neny>0) note += 1;
       if(nombre_dada>0) note += 1;
       if(nombre_papa>0) note += 1;
       if(nombre_mama>0) note += 1;
       if(nombre_izaho>0) note += -1;
       if(nombre_izahay>0) note += 1;*/
        
        int isa_caractere = count(texte);
        if(isa_caractere<100){
            note+=-1;
        }
        else if(isa_caractere>=100 && isa_caractere<200){
            note+= 2;
        }
        else if(isa_caractere>=200){
            note+= 3;
        }
        
        if (note<0){
            note = 0;
        }
      
        else if (note>9){
            note = 20;
        }
        else{
            note = (note*20)/9;
        }
        
        return String.valueOf(note);
        //return texte;
    }
}
