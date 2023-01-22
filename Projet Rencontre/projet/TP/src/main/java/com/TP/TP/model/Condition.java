/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.TP.TP.model;

import com.TP.TP.BDD.BDD;

/**
 *
 * @author Cédric
 */
public class Condition extends BDD {

    private String conditionid;
    private String sexe;
    private String naissance1;
    private String naissance2;
    private String naissance3;
    private String salaire1;
    private String salaire2;
    private String salaire3;
    private String longitude1;
    private String longitude2;
    private String longitude3;
    private String poids1;
    private String poids2;
    private String poids3;
    private String couleur1;
    private String couleur2;
    private String couleur3;
    private String bacc1;
    private String bacc2;
    private String bacc3;
    private String finoana1;
    private String finoana2;
    private String fiangonana1;
    private String fiangonana2;
    private String fiangonana3;
    private String note;

    public Condition() {
    }

    public Condition(String conditionid, String sexe, String naissance1, String naissance2, String naissance3, String salaire1, String salaire2, String salaire3, String longitude1, String longitude2, String longitude3, String poids1, String poids2, String poids3, String couleur1, String couleur2, String couleur3, String bacc1, String bacc2, String bacc3, String finoana1, String finoana2, String fiangonana1, String fiangonana2, String fiangonana3, String note) {
        this.conditionid = conditionid;
        this.sexe = sexe;
        this.naissance1 = naissance1;
        this.naissance2 = naissance2;
        this.naissance3 = naissance3;
        this.salaire1 = salaire1;
        this.salaire2 = salaire2;
        this.salaire3 = salaire3;
        this.longitude1 = longitude1;
        this.longitude2 = longitude2;
        this.longitude3 = longitude3;
        this.poids1 = poids1;
        this.poids2 = poids2;
        this.poids3 = poids3;
        this.couleur1 = couleur1;
        this.couleur2 = couleur2;
        this.couleur3 = couleur3;
        this.bacc1 = bacc1;
        this.bacc2 = bacc2;
        this.bacc3 = bacc3;
        this.finoana1 = finoana1;
        this.finoana2 = finoana2;
        this.fiangonana1 = fiangonana1;
        this.fiangonana2 = fiangonana2;
        this.fiangonana3 = fiangonana3;
        this.note = note;
    }

    public String getConditionid() {
        return conditionid;
    }

    public void setConditionid(String conditionid) {
        this.conditionid = conditionid;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNaissance1() {
        return naissance1;
    }

    public void setNaissance1(String naissance1) {
        this.naissance1 = naissance1;
    }

    public String getNaissance2() {
        return naissance2;
    }

    public void setNaissance2(String naissance2) {
        this.naissance2 = naissance2;
    }

    public String getNaissance3() {
        return naissance3;
    }

    public void setNaissance3(String naissance3) {
        this.naissance3 = naissance3;
    }

    public String getSalaire1() {
        return salaire1;
    }

    public void setSalaire1(String salaire1) {
        this.salaire1 = salaire1;
    }

    public String getSalaire2() {
        return salaire2;
    }

    public void setSalaire2(String salaire2) {
        this.salaire2 = salaire2;
    }

    public String getSalaire3() {
        return salaire3;
    }

    public void setSalaire3(String salaire3) {
        this.salaire3 = salaire3;
    }

    public String getLongitude1() {
        return longitude1;
    }

    public void setLongitude1(String longitude1) {
        this.longitude1 = longitude1;
    }

    public String getLongitude2() {
        return longitude2;
    }

    public void setLongitude2(String longitude2) {
        this.longitude2 = longitude2;
    }

    public String getLongitude3() {
        return longitude3;
    }

    public void setLongitude3(String longitude3) {
        this.longitude3 = longitude3;
    }

    public String getPoids1() {
        return poids1;
    }

    public void setPoids1(String poids1) {
        this.poids1 = poids1;
    }

    public String getPoids2() {
        return poids2;
    }

    public void setPoids2(String poids2) {
        this.poids2 = poids2;
    }

    public String getPoids3() {
        return poids3;
    }

    public void setPoids3(String poids3) {
        this.poids3 = poids3;
    }

    public String getCouleur1() {
        return couleur1;
    }

    public void setCouleur1(String couleur1) {
        this.couleur1 = couleur1;
    }

    public String getCouleur2() {
        return couleur2;
    }

    public void setCouleur2(String couleur2) {
        this.couleur2 = couleur2;
    }

    public String getCouleur3() {
        return couleur3;
    }

    public void setCouleur3(String couleur3) {
        this.couleur3 = couleur3;
    }

    public String getBacc1() {
        return bacc1;
    }

    public void setBacc1(String bacc1) {
        this.bacc1 = bacc1;
    }

    public String getBacc2() {
        return bacc2;
    }

    public void setBacc2(String bacc2) {
        this.bacc2 = bacc2;
    }

    public String getBacc3() {
        return bacc3;
    }

    public void setBacc3(String bacc3) {
        this.bacc3 = bacc3;
    }

    public String getFinoana1() {
        return finoana1;
    }

    public void setFinoana1(String finoana1) {
        this.finoana1 = finoana1;
    }

    public String getFinoana2() {
        return finoana2;
    }

    public void setFinoana2(String finoana2) {
        this.finoana2 = finoana2;
    }

    public String getFiangonana1() {
        return fiangonana1;
    }

    public void setFiangonana1(String fiangonana1) {
        this.fiangonana1 = fiangonana1;
    }

    public String getFiangonana2() {
        return fiangonana2;
    }

    public void setFiangonana2(String fiangonana2) {
        this.fiangonana2 = fiangonana2;
    }

    public String getFiangonana3() {
        return fiangonana3;
    }

    public void setFiangonana3(String fiangonana3) {
        this.fiangonana3 = fiangonana3;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double note(String supp, String inf, String val) {
        double vall = Double.parseDouble(val);
        double inff = Double.parseDouble(inf);
        double suppp = Double.parseDouble(supp);
        if (vall >= inff && vall <= suppp) {
            return 20.0;
        } else {
            return 0.0;
        }
    }

    public double getNoteNaissance(int naissance) {
        double note = note(this.getNaissance2(), this.getNaissance1(), String.valueOf(naissance));
        note = Double.parseDouble(this.getNaissance3()) * note;
        return note;
    }

    public double getNoteSalaire(double salaire) {
        double note = note(this.getSalaire2(), this.getSalaire1(), String.valueOf(salaire));
        note = Double.parseDouble(this.getSalaire3()) * note;
        return note;
    }

    public double getNoteLongitude(double longitude) {
        double note = note(this.getLongitude2(), this.getLongitude1(), String.valueOf(longitude));
        note = Double.parseDouble(this.getLongitude3()) * note;
        return note;
    }

    public double getNotePoids(double poids) {
        double note = note(this.getPoids2(), this.getPoids1(), String.valueOf(poids));
        note = Double.parseDouble(this.getPoids3()) * note;
        return note;
    }

    public double getNoteCouleur(double couleur) {
        double note = note(this.getCouleur2(), this.getCouleur1(), String.valueOf(couleur));
        note = Double.parseDouble(this.getCouleur3()) * note;
        return note;
    }

    public double getNoteBacc(int bacc) {
        double note = note(this.getBacc2(), this.getBacc1(), String.valueOf(bacc));
        note = Double.parseDouble(this.getBacc3()) * note;
        return note;
    }

    public double getNoteFinoana(int finoana) {
        double note = 0.0;
        if(Integer.parseInt(this.getFinoana1())==finoana){
            note = 20.0;
        }
        note = note * Double.parseDouble(this.getFinoana2());
        return note;
    }

    public double getNoteFiangonana(int fiangonana) {
        double note = note(this.getFiangonana2(), this.getFiangonana1(), String.valueOf(fiangonana));
        note = Double.parseDouble(this.getFiangonana3()) * note;
        return note;
    }

    public double getTotalCoef() {
        double coef = Double.parseDouble(this.getFiangonana3())
                + Double.parseDouble(this.getFinoana2())
                + Double.parseDouble(this.getBacc3())
                + Double.parseDouble(this.getCouleur3())
                + Double.parseDouble(this.getPoids3())
                + Double.parseDouble(this.getLongitude3())
                + Double.parseDouble(this.getSalaire3())
                + Double.parseDouble(this.getNaissance3());
        return coef;
    }

}
