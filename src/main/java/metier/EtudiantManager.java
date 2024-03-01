package metier;

import doa.Etudiant;
import doa.EtudiantDAO;

public class EtudiantManager {
    public EtudiantDAO etudiantDAO ;

    public EtudiantManager(EtudiantDAO etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }



}
