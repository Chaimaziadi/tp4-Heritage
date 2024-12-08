// Collection.java - Classe pour gérer la collection d'ustensiles et afficher les résultats
public class Collection {
    static Ustensile[] us = new Ustensile[5]; // Tableau pour stocker les ustensiles

    public static void main(String[] args) {
        // Initialisation des ustensiles avec leurs années de fabrication et caractéristiques
        us[0] = new AssietteRonde(1943, 10); // Assiette ronde de 1943 avec un rayon de 10
        us[1] = new AssietteCarree(1973, 12); // Assiette carrée de 1973 avec un côté de 12
        us[2] = new Cuillere(1950, 20); // Cuillère de 1950 avec une longueur de 20
        us[3] = new Cuillere
