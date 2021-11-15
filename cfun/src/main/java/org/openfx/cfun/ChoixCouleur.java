package org.openfx.cfun;

public class ChoixCouleur {
    private Couleur couleur;

    public ChoixCouleur(final double etat) {
        if (etat < 0.70)
        {
            couleur = Couleur.vert;
        }
        else
        {
            couleur = Couleur.orange;
        }

        if (etat == 1)
        {
            couleur = Couleur.rouge;
        }
    }

    public Couleur getCouleur() {
        return couleur;
    }
}