package projet;

import java.util.ArrayList;
import java.util.Scanner;

public class java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int saisieMenu = 0;
		boolean finish = false;
		boolean afficherMenu = true;
		String[] enonces = {"Entrez un chiffre compris entre 1 et 5",
							"Entrez un nombre compris entre 10 et 20",
							"Entrez un nombre",
							"Entrez un nombre version 2",
							"Calcule la table de multiplication d'un entier",
							"Calcule la somme des entiers pour arriver au nombre rentré par l'utilisateur",
							"Calcule la factorielle d'un entier",
							"Trouve le nombre le plus grand",
							"Trouve le nombre le plus grand version 2",
							"Calcule la monnaie à rendre selon les achats d'un client",
							"Calcule le nombre de chances pour gagner au tiercé"
		};
		
		//tant que finish est false, la boucle tourne
		while(!finish) {
			
			//tant que afficherMenu est true, on affiche le menu
			if(afficherMenu) {
				//menu principal
				System.out.println("Menu Principal");
				System.out.println("_______________");
				System.out.println("\n");
				// boucle qui affiche les exercices et leurs énoncés
				for(int i=0; i<11; i++) {
					System.out.println((i+1) + " - Exercice " + (i+1) + " (" + enonces[i] + ")");
				}
				//l'utilisateur choisi l'exercice
				System.out.println("Entrez le numéro correspondant à votre choix ou “0” pour quitter le programme:");
				saisieMenu = sc.nextInt();
				afficherMenu = false;
			}
			//si afficherMenu est faux, on affiche directement les exercices
			if(!afficherMenu) {
				switch(saisieMenu) {
					case 0:
						System.out.println("Vous quittez le programme.");
						//on donne la valeur true à finish pour quitter la boucle
						finish = true;
						
						break;
					case 1:
						// exercice 1
						int saisie = 0;
						while(saisie < 1 || saisie > 5) {
							System.out.println("Ecrire un chiffre compris entre 1 et 5:");
							saisie = sc.nextInt();
							if(saisie < 1 || saisie >5) {
								System.out.println("Ce chiffre n'est pas compris entre 1 et 5...");
							}
						}
						
						break;
					case 2:
	//					//exercice 2
						int saisieUtilisateur = 0;
						while(saisieUtilisateur < 10 || saisieUtilisateur > 20) {
							System.out.println("Ecrire un nombre compris entre 10 et 20:");
							saisieUtilisateur = sc.nextInt();
							if(saisieUtilisateur < 10) {
								System.out.println("Plus grand!");
							} else if(saisieUtilisateur > 20) {
								System.out.println("Plus petit!");
							}
						}
						break;
					case 3:
						//lancer ex3
						System.out.println("Ecrire un nombre:");
						int nbr = sc.nextInt();
						int compteur = 1;
						while(compteur <= 10) {
							System.out.println(nbr + compteur);
							compteur++;
						}
						
						break;
					case 4:
						//lancer ex 4
						System.out.println("Ecrire un nombre:");
						int nombre = sc.nextInt();
						for(int i=1; i<=10; i++) {
							System.out.println(nombre + i);
						}
						break;
					case 5:
						//lancer ex 5
						System.out.println("Ecrire un nombre:");
						int nbrMultiplication = sc.nextInt();
						for(int i=0; i <=10; i++) {
							System.out.println(nbrMultiplication + " x " + i + " = " + nbrMultiplication*i);
						}
						break;
					case 6:
						//lancer ex6
						System.out.println("Ecrire un nombre:");
						int sommeEntiers = 0;
						int nbrSomme = sc.nextInt();
						for(int i=1; i <= nbrSomme; i++) {
							sommeEntiers = sommeEntiers + i;
						}
						System.out.println(sommeEntiers);
						break;
					case 7:
						//lancer ex7
						System.out.println("Ecrire un nombre");
						int factorielle = 1;
						int number = sc.nextInt();
						for(int i=1; i <= number; i++) {
							factorielle = factorielle*i;
						}
						System.out.println(factorielle);
					
						break;
					case 8:
						//lancer ex 8
						int[] nombres = new int[20];
						int index = 0;
						for(int i=0; i < 20; i++) {
							System.out.println("Entrez le nombre numéro " + (i + 1));
							nombres[i] = sc.nextInt();
							if(nombres[i]>nombres[index]) {
									index = i;
								}
							}
						System.out.println("Le nombre le plus grand est: " + nombres[index] + ", saisi en position " + (index + 1));
					
						break;
					case 9:
						//lancer ex9
						ArrayList<Integer> tableauListe = new ArrayList<Integer>();
						int index2 = 0;
						do {
							System.out.println("Entrez un nombre, et tapez 0 pour sortir.");
							saisie = sc.nextInt();
							if(saisie != 0) {
								tableauListe.add(saisie);
							}
						} while(saisie != 0);
						
						for(int i=0; i< tableauListe.size(); i++) {
							if(tableauListe.get(i)>tableauListe.get(index2)) {
								index2 = i;
							}
						}
							
						System.out.println("Le nombre le plus grand est : " + tableauListe.get(index2) + ", saisi en position " + (index2 + 1));
	
						break;
					case 10:
						//lancer ex 10
						int prixTotal = 0, billet10e = 0, billet5e = 0, piece1e = 0, reste = 0;
						do {
							System.out.println("Rentrez le prix de l'article, tapez 0 pour arrêter la saisie");
							saisie = sc.nextInt();
							prixTotal = prixTotal + saisie;
						} while(saisie != 0);
						
						//calcul du prix total
						System.out.println("Le total est de " + prixTotal + " euros.");
						System.out.println("Tapez le montant donné:");
						int montantDonne = sc.nextInt();
						//calcul du reste
						reste = montantDonne - prixTotal;
						System.out.println(reste);
						//calcul de la monnaie à rendre
						while(reste>=10) {
							billet10e++;
							reste = reste - 10;
						}
						while(reste>=5) {
							billet5e++;
							reste = reste - 5;
						}
						while(reste>=1) {
							piece1e++;
							reste = reste - 1;
						}
						
						//rendre la monnaie
						System.out.println("Vous devez rendre " + billet10e + " billet(s) de 10 euros, " + billet5e + " billet(s) de 5 euros et " + piece1e + " pièce(s) de 1 euro.");
	
						break;
					case 11:
						//lancer ex 11
						double chevauxPartants, chevauxJoues, factoriellecp, factoriellecj;
						double denominateurx, denominateury;
						
						System.out.println("Rentrez le nombre de chevaux partants:");
						chevauxPartants = sc.nextInt();
						System.out.println("Rentrez le nombre de chevaux joués");
						chevauxJoues = sc.nextInt();
						
						//calcul factorielle de chevauxPartants
						factoriellecp = 1;
						for(int i=1; i<=chevauxPartants; i++) {
							factoriellecp = factoriellecp*i;
						}

						
						//calcul de la factorielle chevauxJoues
						factoriellecj = 1;
						for(int i=1; i<=chevauxJoues; i++) {
							factoriellecj = factoriellecj*i;
						}

						
						//calcul du dénominateur de x
						denominateurx = 1;
						for(int i=1; i<=(chevauxPartants - chevauxJoues); i++) {
							denominateurx = denominateurx*i;
						}
						//calcul du dénominateur de y
						denominateury = factoriellecj*denominateurx;
						System.out.println(denominateury);
						System.out.println("Dans l'ordre, une chance sur " + factoriellecp/denominateurx + " de gagner!");
						System.out.println("Dans le désordre, une chance sur " + factoriellecp/denominateury + " de gagner!");
	
						break;
					default:
						System.out.println("Vous n'avez pas rentré de valeur correspondante à un choix.");
				
				}
			}
			if(!finish) {	
				System.out.println("Voulez vous recommencer l'exercice, ou bien retourner au menu?");
				System.out.println("1 - Recommencer l'exercice");
				System.out.println("2 - Retourner au menu");
				int reponse = sc.nextInt();
				if(reponse == 2) {
					afficherMenu = true;
				}
			}
			
		}
	}
}





