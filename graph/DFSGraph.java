package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {
	private int V;
	private LinkedList<Integer> adj[];
	
	
	@SuppressWarnings("unchecked")
	public DFSGraph(int v) {
		V = v;
		adj=new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
	}

	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}

	void DFSProcess(int v,boolean visited[]){
		visited[v]=true;
		System.out.println(v+" ");
		
		Iterator<Integer> itr=adj[v].listIterator();
		while(itr.hasNext()){
			int n=itr.next();
			if(!visited[n])
				DFSProcess(n, visited);
		}
				
	}
	
	void DFS(int v){
		boolean visited[]=new boolean[V];
		
		for(int i=0;i<V;i++)
			if(visited[i]==false)
				DFSProcess(v, visited);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFSGraph  dfsg=new DFSGraph(4);
		 dfsg.addEdge(0, 1);
		 dfsg.addEdge(0, 2);
		 dfsg.addEdge(1, 2);
		 dfsg.addEdge(2, 0);
		 dfsg.addEdge(2, 3);
		 dfsg.addEdge(3, 3);

       System.out.println("Depth First Traversal "+
                          "(starting from vertex 2)");

       dfsg.DFS(2);

	}

}
