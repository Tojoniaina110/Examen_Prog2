package Com.Music;

import java.util.Date;

public class ArtistSolo extends Artist {
     private  final String nom;
     private  final String prenom;
     private  final Date dateNaissance;

    public ArtistSolo(Date anneeDebut, String id, String nationalite, String nomScene, Date dateNaissance, String nom, String prenom) {
        super(anneeDebut, id, nationalite, nomScene);
        this.dateNaissance = dateNaissance;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


}
