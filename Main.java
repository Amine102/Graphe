                                    //*|-*-> JAVA <-*-|*//

//===-------------------------------------|  MAIN  |----------------------------------===//
//                                                                              	 //
// Creators: 	|Amine Boulahmel| 		 		|David Tremblet|      	 //
// Contacts: <amine.boulahmel@etu.univ-nantes.fr>   <david.tremblet@etu.univ-nantes.fr>  //
//                                                	              		         //
//===---------------------------------------------------------------------------------===//

/* 
 * Copyright (Java) 2019 
 * Ce programme est gratuit et peut être redistribué et/ou modifié
 * sans aucune contrainte.
 * 
 * Ce programme est distribué en espérant qu'il soit utile,
 * mais SANS GARANTIE; sans même de garantie implicite de
 * MARCHANDABILITE ou FITNESS POUR UN BUT PARTICULIER. 
 *
 * Si vous écrivez vos propres modifications pour GRAPH, c'est
 * votre choix d'autoriser ou non cette exception à s'appliquer 
 * à votre modification.
 * Si vous ne le souhaitez pas, supprimez cette notification d'exception.
 */

import java.util.*;

public class Main{
	public static void main(String[] args){
		Node a = new Node("A",1);
		Node b = new Node("B",2);
		Node elements1[] = {a, b};
		Set<Node> nodes = new HashSet<Node>(Arrays.asList(elements1));
		Arc a_b = new Arc("A->B",a,b);
		Arc elements2[] = {a_b};
		Set<Arc> arcs = new HashSet<Arc>(Arrays.asList(elements2));
		
		Graph g = new Graph("Flot", nodes, arcs,true);
		//g.display_adjMat();


	}
}
