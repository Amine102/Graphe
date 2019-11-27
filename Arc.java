                                   //*|-*-> JAVA <-*-|*//

//===-------------------------------------|  ARC  |-----------------------------------===//
//                                                                               	 //
// Creators: 	|Amine Boulahmel| 		 		|David Tremblet|         //
// Contacts: <amine.boulahmel@etu.univ-nantes.fr>   <david.tremblet@etu.univ-nantes.fr>  //
//                                                	                	    	 //
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
 * à votre modifications.
 * Si vous ne le souhaitez pas, supprimez cette notification d'exception.
 */

import java.util.*;

public class Arc{
	private Node _deb_node;		//determine le noeud de debut
	private Node _fin_node;		//determine le noeud de fin
	private String _nom;		//nom de l'arc

	public Arc(String nom, Node debNode, Node finNode){
		this._nom = nom;
		this._deb_node = debNode;
		this._fin_node = finNode;
	}
	public Arc(){
		this._nom = new String();
		this._deb_node = new Node();
		this._fin_node = new Node();
	}

	public Node get_deb_node(){
		return this._deb_node;
	}
	public Node get_fin_node(){
		return this._fin_node;
	}
	public String get_nomArc(){
		return this._nom;
	}
	public void set_deb_node(Node debNode){
		this._deb_node = debNode;
	}
	public void set_fin_node(Node finNode){
		this._fin_node = finNode;
	}
}
