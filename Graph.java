                                //*|-*-> JAVA <-*-|*//

//===-------------------------------------|  GRAPH  |---------------------------------===//
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

public class Graph{
	private Set<Node> _nodes;			//l'ensemble des noeuds du graphe
	private Set<Arc>  _arcs;			//l'ensemble des arcs du graphe
	private boolean   _est_oriente;		//graphe orienté ou non
	private String 	  _nom;				//nom du graphe
	private int 	  _size;			//Taille du graphe
	private int[][]   _matrice;    	 	// Matrice d'adjacence du graphe
	//private List<Integer> _adjList;	//liste d'adjascence du graphe

	private List<Integer> getNode_ids(Set<Node> snode){
		List<Integer> elem = new ArrayList<>();
		for(Iterator<Node> it = this._nodes.iterator(); it.hasNext();){
			elem.add(it.next().get_nodeId());
		}

		return elem;
	}
	private int rMax(List<Integer> elem){
		int max = elem.get(0);
		for(int i = 1; i < elem.size();i++){
			if(elem.get(i) > max){
				max = elem.get(i);
			}

		}
		return max;
		
	}

	public Graph(String nom, Set<Node> nodes, Set<Arc> arcs, boolean est_oriente){
		this._nom  = nom;
		this._nodes= nodes;
		this._arcs = arcs;
		this._est_oriente = est_oriente;
		this._size = Math.max(rMax(getNode_ids(this._nodes)),nodes.size());
		if (_size <= 0) {
            throw new IllegalArgumentException("Erreur dans la construction du graphe. Le nombre de sommets doit être strictement positif.");
        }
        this._matrice = new int[_size][_size];		
        init_mat();
	}

	public Set<Node> get_nodes(){
		return this._nodes;
	}
	public Set<Arc> get_arcs(){
		return this._arcs;
	}
	public int[][] get_adjMat(){
		return this._matrice;
	}

	public void init_mat(){
		int i=0;
		for(Iterator<Node> it = this._nodes.iterator(); it.hasNext();){
			Node node = this._nodes.iterator().next();
			//System.out.println("Graph NodeValues: " + node.get_nodeId());
			this._matrice[i][node.get_nodeId()]=1;
			i++;
		}
	}

	public void display_adjMat(){
		for(int i=0; i<this._size; i++){
			for(int j=0; j<this._size; j++){
				System.out.println(this._matrice[i][j]);
			}
		}
	}
	public Node get_nodeByName(String nom){
		Node n = new Node();
		Node res = new Node();
		for (Iterator<Node> it = this._nodes.iterator(); it.hasNext();) {
	        n = it.next();
	        if (n.get_nomNode().equals(nom)){
	        	res = n;
	        }
	        else
	        {
	          	System.err.println("Noeud \"" + nom + "\" inexistant.\n");
	          	res = null;
	        }
    	}
    	return res;
	}
	public Arc get_arcByName(String nom){
		Arc a = new Arc();
		Arc res = new Arc();
		for (Iterator<Arc> it = this._arcs.iterator(); it.hasNext(); ) {
	        a = it.next();
	        if (a.get_nomArc().equals(nom)){
	        	res = a;
	        }
	        else
	        {
	          	System.err.println("Arc \"" + nom + "\" inexistant.\n");
	          	res = null;
	        }
    	}
    	return res;

	}
	public String get_nomGraph(){
		return this._nom;
	}
	public boolean est_oriente(){
		return this._est_oriente;
	}
	public void add_node(Node node){
		this._nodes.add(node);
	}
	public void add_arc(Arc arc){
		this._arcs.add(arc);
	}
	public void remove_node(Node node){
		Iterator<Node> it = this._nodes.iterator();
		while (it.hasNext()) {
			if (it.equals(node)) {	// remove even elements
				it.remove();
				break;
			}
		}
	}
	public void remove_arc(Arc arc){
		Iterator<Arc> it = this._arcs.iterator();
		while (it.hasNext()) {
			if (it.equals(arc)) {	// remove even elements
				it.remove();
				break;
			}
		}
	}
}





















