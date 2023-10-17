package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        int SalaireDeBase = 400;
        int Prime = 250;
        int Quota = 10;

        System.out.println("Saisir le nombre de ventes sur la semaine :");
        int NombreDeVante = clavier.nextInt();
        clavier.close();

        if ( NombreDeVante >= Quota) {

            System.out.println("Félisitation vous avez remplie le quota de vente !");
        }

        else{
            int ecart = Quota - NombreDeVante;
            System.out.println("Vous avez pas remplie le quota. Il manque " + ecart + " ventes" );
        }


        
    }
    
}
