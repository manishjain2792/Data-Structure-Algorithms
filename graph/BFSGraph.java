package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {

	private int V;
	private LinkedList<Integer> adj[];
	
	
	@SuppressWarnings("unchecked")
	public BFSGraph(int v) {
		V=v;
		adj=new LinkedList[v];
		
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList<Integer>();
		}
	}
	void addEdge(int v,int e){
		adj[v].add(e);
	}
	
	void BFS(int s){
		
		boolean visited[]=new boolean[V];
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		visited[s]=true;
		list.add(s);
		
		while(list.size()!=0){
			s=list.poll();
			System.out.println(s+"   ");
			
			Iterator<Integer> itr=adj[s].listIterator();
			while(itr.hasNext()){
				int n=itr.next();
				if(!visited[n])
				{
					visited[n]=true;
					list.add(n);
				}
			}
					
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSGraph  bfsg=new BFSGraph(4);
		 bfsg.addEdge(0, 1);
		 bfsg.addEdge(0, 2);
		 bfsg.addEdge(1, 2);
		 bfsg.addEdge(2, 0);
		 bfsg.addEdge(2, 3);
		 bfsg.addEdge(3, 3);
 
        System.out.println("sBreadth First Traversal "+
                           "(starting from vertex 2)");
 
        bfsg.BFS(2);

	}

}
