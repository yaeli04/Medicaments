package com.euroforma.medicaments;

public class Medicament {
    private int codeCIS;
    private String denomination;
    private String formePharmaceutique;
    private String voiesAdmin;
    private String titulaires;
    private String statutAdministratif;
    private String Nb_Molecule;
    private String dateAutorisation;
    private String DateAMM;

    // Constructeur

    // Getter recup et Setter modif pour codeCIS
    public int getCodeCIS() {
        return codeCIS;
    }

    public void setCodeCIS(int codeCIS) {
        this.codeCIS = codeCIS;
    }

    // Getter et Setter pour denomination
    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {

        this.denomination = denomination;
    }

    // Getter et Setter pour formePharmaceutique
    public String getFormePharmaceutique() {
        return formePharmaceutique;
    }

    public void setFormePharmaceutique(String formePharmaceutique) {
        this.formePharmaceutique = formePharmaceutique;
    }

    public void setStatutAdministratif(String statutAdministratif) {
        this.statutAdministratif = statutAdministratif;
    }
    public String getStatutAdministratif() {
        return statutAdministratif;
    }

    // Getter et Setter pour voiesAdmin
    public String getVoiesAdmin() {
        return voiesAdmin;
    }

    public void setVoiesAdmin(String voiesAdmin) {
        this.voiesAdmin = voiesAdmin;
    }

    // Getter et Setter pour titulaires
    public String getTitulaires() {
        return titulaires;
    }

    public void setTitulaires(String titulaires) {
        this.titulaires = titulaires;
    }

    public String getNb_molecule() {

        return Nb_Molecule;

    }

    public void setNb_molecule(String Nb_Molecule)
    {
        this.Nb_Molecule = Nb_Molecule;
    }

    public void setDateAutorisation(String dateAutorisation) {
        this.dateAutorisation = dateAutorisation;
    }

    public String getDateAutorisation() {
        return dateAutorisation ;
    }
    public String getDateAMM() {

        return DateAMM;
    }

    public void setDateAMM(String DateAMM)
    {
        this.DateAMM = DateAMM;
    }
}
