package org.fudaa.dodico.corba.hydraulique1d;

/**
* org/fudaa/dodico/corba/hydraulique1d/IReseauOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from C:/devel/fudaa/fudaa_devel/dodico/idl/metier/hydraulique1d.idl
* mercredi 6 ao�t 2008 22 h 27 CEST
*/
public interface IReseauOperations extends org.fudaa.dodico.corba.hydraulique1d.IHydraulique1dOperations {

    org.fudaa.dodico.corba.hydraulique1d.IBief[] biefs();

    void biefs(org.fudaa.dodico.corba.hydraulique1d.IBief[] newBiefs);

    org.fudaa.dodico.corba.hydraulique1d.ICasier[] casiers();

    void casiers(org.fudaa.dodico.corba.hydraulique1d.ICasier[] newCasiers);

    org.fudaa.dodico.corba.hydraulique1d.ILiaison[] liaisons();

    void liaisons(org.fudaa.dodico.corba.hydraulique1d.ILiaison[] newLiaisons);

    boolean nbPasPlanimetrageImpose();

    void nbPasPlanimetrageImpose(boolean newNbPasPlanimetrageImpose);

    int nbPasPlanimetrage();

    void nbPasPlanimetrage(int newNbPasPlanimetrage);

    org.fudaa.dodico.corba.hydraulique1d.IBief creeBief();

    org.fudaa.dodico.corba.hydraulique1d.INoeud creeNoeud();

    org.fudaa.dodico.corba.hydraulique1d.singularite.IApport creeApport();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISource creeSource();

    org.fudaa.dodico.corba.hydraulique1d.singularite.IPerteCharge creePerteCharge();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuil creeSeuil();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilLoi creeSeuilLoi();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilGeometrique creeSeuilGeometrique();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilLimniAmont creeSeuilLimniAmont();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilVanne creeSeuilVanne();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilDenoye creeSeuilDenoye();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilTarageAmont creeSeuilTarageAmont();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilTarageAval creeSeuilTarageAval();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilNoye creeSeuilNoye();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuilTranscritique creeSeuilTranscritique();

    org.fudaa.dodico.corba.hydraulique1d.singularite.IDeversoir creeDeversoir();

    org.fudaa.dodico.corba.hydraulique1d.IBarragePrincipal creeBarragePrincipal();

    void creeResultatsReseau();

    void supprimeBiefs(org.fudaa.dodico.corba.hydraulique1d.IBief[] _biefs);

    void supprimeProfils(org.fudaa.dodico.corba.hydraulique1d.IProfil[] profils);

    void supprimeLimites(org.fudaa.dodico.corba.hydraulique1d.ILimite[] limites);

    void supprimeSingularites(org.fudaa.dodico.corba.hydraulique1d.ISingularite[] singularites);

    void supprimeZonesFrottement(org.fudaa.dodico.corba.hydraulique1d.IZoneFrottement[] zones);

    void supprimeZonesPlanimetrage(org.fudaa.dodico.corba.hydraulique1d.IZonePlanimetrage[] zones);

    void supprimeExtremite(org.fudaa.dodico.corba.hydraulique1d.IExtremite extremite);

    void supprimeNoeud(org.fudaa.dodico.corba.hydraulique1d.INoeud noeud);

    org.fudaa.dodico.corba.hydraulique1d.IZonePlanimetrage creeZonePlanimetrage(int indiceProfilDebut, int indiceProfilFin, double taillePas);

    void initIndiceBief();

    void initIndiceNumero();

    org.fudaa.dodico.corba.hydraulique1d.ICasier ajouterCasier();

    void supprimeCasiers(org.fudaa.dodico.corba.hydraulique1d.ICasier[] casiers);

    org.fudaa.dodico.corba.hydraulique1d.ILiaison ajouterLiaison();

    void supprimeLiaisons(org.fudaa.dodico.corba.hydraulique1d.ILiaison[] liaisons);

    void initNumeroCasier();

    void initNumeroLiaison();

    int getIndiceCasier(org.fudaa.dodico.corba.hydraulique1d.ICasier casier);

    int getIndiceLiaison(org.fudaa.dodico.corba.hydraulique1d.ILiaison liaison);

    double getXOrigine();

    double getXFin();

    org.fudaa.dodico.corba.hydraulique1d.IZonePlanimetrage[] zonesPlanimetrage();

    org.fudaa.dodico.corba.hydraulique1d.IZoneFrottement[] zonesFrottement();

    org.fudaa.dodico.corba.hydraulique1d.SIndiceZoneStockage[] getIndicesZonesStockages();

    void setIndicesZonesStockage(org.fudaa.dodico.corba.hydraulique1d.SIndiceZoneStockage[] indicesZonesStockages);

    int getNbPasPlanimetrage();

    org.fudaa.dodico.corba.hydraulique1d.IExtremite[] extremites();

    org.fudaa.dodico.corba.hydraulique1d.IExtremite[] extremitesLibres();

    org.fudaa.dodico.corba.hydraulique1d.IExtremite getExtremiteNumero(int numero);

    org.fudaa.dodico.corba.hydraulique1d.IExtremite getExtremiteContenantLimite(org.fudaa.dodico.corba.hydraulique1d.ILimite limite);

    org.fudaa.dodico.corba.hydraulique1d.INoeud[] noeudsConnectesBiefs();

    org.fudaa.dodico.corba.hydraulique1d.INoeud getNoeudNumero(int numero);

    org.fudaa.dodico.corba.hydraulique1d.IProfil[] profils();

    org.fudaa.dodico.corba.hydraulique1d.ILimite[] limites();

    org.fudaa.dodico.corba.hydraulique1d.ISingularite[] singularites();

    org.fudaa.dodico.corba.hydraulique1d.ISingularite getSingulariteId(int numero);

    boolean hasSingularites();

    boolean hasZonesStockage();

    int getIndiceProfilNumero(int numeroProfil);

    int getIndiceProfilAbscisse(double abscisseProfil);

    int getIndiceBief(org.fudaa.dodico.corba.hydraulique1d.IBief bief);

    org.fudaa.dodico.corba.hydraulique1d.IProfil getProfilNumero(int numeroProfil);

    org.fudaa.dodico.corba.hydraulique1d.IProfil getProfilAbscisse(double abscisseProfil);

    org.fudaa.dodico.corba.hydraulique1d.IBief getBiefContenantProfilNumero(int numeroProfil);

    org.fudaa.dodico.corba.hydraulique1d.IBief getBiefContenantProfilAbscisse(double abscisseProfil);

    org.fudaa.dodico.corba.hydraulique1d.IBief getBiefContenantAbscisse(double abscisse);

    org.fudaa.dodico.corba.hydraulique1d.IBief getBiefContenantSingularite(org.fudaa.dodico.corba.hydraulique1d.ISingularite sing);

    org.fudaa.dodico.corba.hydraulique1d.IBief getBiefNumero(int numeroBief);

    org.fudaa.dodico.corba.hydraulique1d.IZoneFrottement getFrottementContenantProfilNumero(int numeroProfil);

    int getNumeroApparitionProfil(org.fudaa.dodico.corba.hydraulique1d.IProfil profil);

    int nbProfils();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISeuil[] seuils();

    org.fudaa.dodico.corba.hydraulique1d.singularite.IPerteCharge[] pertesCharges();

    org.fudaa.dodico.corba.hydraulique1d.singularite.IApport[] apports();

    org.fudaa.dodico.corba.hydraulique1d.singularite.ISource[] sources();

    org.fudaa.dodico.corba.hydraulique1d.singularite.IDeversoir[] deversoirs();

    int nbPasTempsResultats();

    org.fudaa.dodico.corba.hydraulique1d.ISingularite[] getSingularitesHorsBief();

    double interpoleFond(double abscisse);

    double getAbscisseAbsolue(int numeroBief, double abscisseRelative, double distanceEntreBief);

    double getAbscisseRelative(int numeroBief, double abscisseAbsolue, double abscisseAbsolueDebutBief);
}