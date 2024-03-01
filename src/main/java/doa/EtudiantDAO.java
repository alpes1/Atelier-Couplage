package doa;
import java.util.*;
public class EtudiantDAO {
    List<Etudiant> etudiants = new ArrayList<>();

    public EtudiantDAO(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    public Etudiant addEtudiant (Etudiant etd )
    {
        for ( Etudiant etudiant : etudiants )
        {
            if(etudiant.getEmail().equals(etd.getEmail()))
                return etudiant ;
        }
        etudiants.add(etd);
        return etd ;
    }
}
