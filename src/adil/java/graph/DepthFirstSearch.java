package adil.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {

	private int vertex;
	private LinkedList<Integer> adj[];

	DepthFirstSearch(int v) {
		vertex = v;
		adj = new LinkedList[vertex];
		for (int i = 0; i < vertex; i++) {
			adj[i] = new LinkedList<>();
		}

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepthFirstSearch dfs = new DepthFirstSearch(4);
		dfs.addEdges(0, 1);
		dfs.addEdges(0, 2);
		dfs.addEdges(1, 2);
		dfs.addEdges(2, 0);
		dfs.addEdges(2, 3);
		dfs.addEdges(3, 3);

		// start dfs with source vertex

		dfs.startDFS(2);

	}

	private void startDFS(int s) {
		// TODO Auto-generated method stub

		boolean visited[] = new boolean[vertex];
		dfsVisiting(s, visited);

	}

	private void dfsVisiting(int s, boolean[] visited) {
		// TODO Auto-generated method stub

		visited[s] = true;
		System.out.println(s + " ");
		Iterator<Integer> iter = adj[s].listIterator();
		while (iter.hasNext()) {
			int n = iter.next();
			if (!visited[n]) {
				dfsVisiting(n, visited);
			}
		}
	}

	private void addEdges(int v, int w) {
		// TODO Auto-generated method stub
		adj[v].add(w);
	}

}
