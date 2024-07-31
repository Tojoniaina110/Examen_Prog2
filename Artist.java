package Com.Music;

import java.util.Date;

public class Artist {
    private String id;
    private String nomScene;
    private Date anneeDebut;
    private String nationalite;

    public Artist(Date anneeDebut, String id, String nationalite, String nomScene) {
        this.anneeDebut = anneeDebut;
        this.id = id;
        this.nationalite = nationalite;
        this.nomScene = nomScene;
    }

    public Date getAnneeDebut() {
        return anneeDebut;
    }

    public void setAnneeDebut(Date anneeDebut) {
        this.anneeDebut = anneeDebut;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public String getNomScene() {
        return nomScene;
    }

    public void setNomScene(String nomScene) {
        this.nomScene = nomScene;
    }
}
