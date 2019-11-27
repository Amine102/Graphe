                                	//*|-*-> JAVA <-*-|*//

//===-------------------------------------|  NODE  |----------------------------------===//
//                                                                               		 //
// Creators: 			|Amine Boulahmel| 		 		|David Tremblet|            	 //
// Contacts: <amine.boulahmel@etu.univ-nantes.fr>   <david.tremblet@etu.univ-nantes.fr>  //
//                                                	                			         //
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

public class Node{
	private List<Arc> _larc;	//determine le nombre d'arc associé au noeud
	private String _nom;		//nom du noeud
	private int _id;

	public Node(String nom, List<Arc> l, int id){
		this._larc = l;
		this._nom = nom;
		this._id = id;
	}
	public Node(String nom, int id){
		this._larc = new ArrayList<Arc>();
		this._nom = nom;
		this._id = id;
	}
	public Node(){
		this._larc = new ArrayList<Arc>();
		this._nom = new String();
		this._id = 0;
	}

	public List<Arc> get_lArcs(){
		return this._larc;
	}
	public String get_nomNode(){
		return this._nom;
	}
	public int get_nodeId(){
		return this._id;
	}
	public void set_nom(String nom){
		this._nom=nom;
	}
	public void set_larcs(List<Arc> l){
		this._larc = l;
	}
	
}
