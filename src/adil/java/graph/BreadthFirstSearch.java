package adil.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {

	private int vertex;
	private LinkedList<Integer> adj[];

	BreadthFirstSearch(int v) {
		// TODO Auto-generated constructor stub
		vertex = v;
		adj=new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreadthFirstSearch bfsObj = new BreadthFirstSearch(4);
		bfsObj.addEdges(0, 1);
		bfsObj.addEdges(0, 2);
		bfsObj.addEdges(1, 2);
		bfsObj.addEdges(2, 0);
		bfsObj.addEdges(2, 3);
		bfsObj.addEdges(3, 3);
		
		System.out.println("Starting Breadth First Traversal "+ 
                "(from vertex 2)"); 
		bfsObj.bfsTraversal(2);

	}

	private void bfsTraversal(int s) {
		// TODO Auto-generated method stub
		boolean visited[]=new boolean[vertex];
		LinkedList<Integer> queue=new LinkedList<>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0) {
			
			s=queue.poll();
			System.out.println(s+" ");
			Iterator<Integer> iter=adj[s].listIterator();
			while(iter.hasNext()) {
				int n=iter.next();
				if(!visited[n]) {
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}

	private void addEdges(int v, int w) {
		// TODO Auto-generated method stub
		adj[v].add(w);
	}

}
