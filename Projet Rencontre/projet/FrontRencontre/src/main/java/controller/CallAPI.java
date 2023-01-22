package controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import wiremock.com.fasterxml.jackson.databind.ObjectMapper;

public class CallAPI {

    public boolean callInscriptionAPI(String nom, String sexe, String naissance, String salaire, String longitude, String poids, String couleur, String bacc, String finoana, String fiangonana, String lettre) {
        try {
            URL url = new URL("http://localhost:8080/inscription?");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            con.setDoOutput(true);
            DataOutputStream out = new DataOutputStream(con.getOutputStream());
            out.writeBytes("nom=" + nom + "&sexe=" + sexe + "&naissance=" + naissance + "&salaire=" + salaire + "&longitude=" + longitude + "&poids=" + poids + "&couleur=" + couleur + "&bacc=" + bacc + "&finoana=" + finoana + "&fiangonana=" + fiangonana + "&lettre=" + lettre);
            out.flush();
            out.close();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            return Boolean.parseBoolean(response.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Object[] callGiveMyLoveAPI(String client_id, String sexe, String naissance1, String naissance2, String naissance3, String salaire1, String salaire2, String salaire3, String longitude1, String longitude2, String longitude3, String poids1, String poids2, String poids3, String couleur1, String couleur2, String couleur3, String bacc1, String bacc2, String bacc3, String finoana1, String finoana2, String fiangonana1, String fiangonana2, String fiangonana3, String note) {
        Object[] ret = new Object[2];
        try {
            String apiUrl = "http://localhost:8080/giveMyLove?";
            // Ajout des paramètres de la requête
            String argument = "client_id=" + client_id + "&sexe=" + sexe + "&naissance1=" + naissance1 + "&naissance2=" + naissance2 + "&naissance3=" + naissance3 + "&salaire1=" + salaire1 + "&salaire2=" + salaire2 + "&salaire3=" + salaire3 + "&longitude1=" + longitude1 + "&longitude2=" + longitude2 + "&longitude3=" + longitude3 + "&poids1=" + poids1 + "&poids2=" + poids2 + "&poids3=" + poids3 + "&couleur1=" + couleur1 + "&couleur2=" + couleur2 + "&couleur3=" + couleur3 + "&bacc1=" + bacc1 + "&bacc2=" + bacc2 + "&bacc3=" + bacc3 + "&finoana1=" + finoana1 + "&finoana2=" + finoana2 + "&fiangonana1=" + fiangonana1 + "&fiangonana2=" + fiangonana2 + "&fiangonana3=" + fiangonana3 + "&note=" + note;
            apiUrl += argument;

            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String jsonString = br.readLine();
            ObjectMapper objectMapper = new ObjectMapper();
            ret = objectMapper.readValue(jsonString, Object[].class);
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }

    public String callnoteTEXTEAPI(String texte) {
        String apiUrl = "http://localhost:8080/note";
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Ajout des propriétés de la requête
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

            // Envoi des paramètres de la requête
            String urlParameters = "client_id=" + texte;
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();
            wr.close();

            // Lecture de la réponse de l'API
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            return content.toString();
        } catch (Exception e) {
            System.out.println("eeqcesqcesqef : " + e.getMessage());
            return "000";
        }
    }

}
