/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.API;

import com.TP.TP.service.Service_client;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Cédric
 */
@RestController
public class API {

    @PostMapping("/inscription")
    public boolean inscriptionAPI(
            @RequestParam("nom") String nom,
            @RequestParam("sexe") String sexe,
            @RequestParam("naissance") String naissance,
            @RequestParam("salaire") String salaire,
            @RequestParam("longitude") String longitude,
            @RequestParam("poids") String poids,
            @RequestParam("couleur") String couleur,
            @RequestParam("bacc") String bacc,
            @RequestParam("finoana") String finoana,
            @RequestParam("fiangonana") String fiangonana,
            @RequestParam("lettre") String lettre) {
        Service_client serv = new Service_client();
        return serv.inscription(nom, sexe, naissance, salaire, longitude, poids, couleur, bacc, finoana, fiangonana, lettre);
    }
    @PostMapping("/giveMyLove")
    public String conditionAPI(
            @RequestParam("client_id") String client_id,
            @RequestParam("sexe") String sexe,
            @RequestParam("naissance1") String naissance1,
            @RequestParam("naissance2") String naissance2,
            @RequestParam("naissance3") String naissance3,
            @RequestParam("salaire1") String salaire1,
            @RequestParam("salaire2") String salaire2,
            @RequestParam("salaire3") String salaire3,
            @RequestParam("longitude1") String longitude1,
            @RequestParam("longitude2") String longitude2,
            @RequestParam("longitude3") String longitude3,
            @RequestParam("poids1") String poids1,
            @RequestParam("poids2") String poids2,
            @RequestParam("poids3") String poids3,
            @RequestParam("couleur1") String couleur1,
            @RequestParam("couleur2") String couleur2,
            @RequestParam("couleur3") String couleur3,
            @RequestParam("bacc1") String bacc1,
            @RequestParam("bacc2") String bacc2,
            @RequestParam("bacc2") String bacc3,
            @RequestParam("finoana1") String finoana1,
            @RequestParam("finoana2") String finoana2,
            @RequestParam("fiangonana1") String fiangonana1,
            @RequestParam("fiangonana2") String fiangonana2,
            @RequestParam("fiangonana3") String fiangonana3,
            @RequestParam("note") String note
    ) throws JsonProcessingException {
        Service_client serv = new Service_client();
        ObjectMapper mapper = new ObjectMapper();
        Object[] ret = serv.giveMyLoves(
            client_id,
            sexe,
            naissance1,
            naissance2,
            naissance3,
            salaire1,
            salaire2,
            salaire3,
            longitude1,
            longitude2,
            longitude3,
            poids1,
            poids2,
            poids3,
            couleur1,
            couleur2,
            couleur3,
            bacc1,
            bacc2,
            bacc3,
            finoana1,
            finoana2,
            fiangonana1,
            fiangonana2,
            fiangonana3,
            note);
        String jsonInString = mapper.writeValueAsString(ret);
        return jsonInString;
    }
    @PostMapping("/note")
    public String noteTEXTEAPI(@RequestParam("client_id") String client_id) throws JsonProcessingException {
        Service_client serv = new Service_client();
        String note = serv.noteTEXTE(client_id);
        return note;
    }
}
