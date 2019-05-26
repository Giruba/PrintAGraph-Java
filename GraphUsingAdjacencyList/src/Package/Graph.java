package Package;

import java.util.LinkedList;

public class Graph {
	private int numberOfVertices;
	private LinkedList<Integer> []adjacencyList;
	
	public Graph(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
		this.adjacencyList = new LinkedList[this.numberOfVertices];
	}
	
	public void SetGraphVertices(int value) {
		this.numberOfVertices = numberOfVertices;
	}
	
	public void SetAdjacencyList(LinkedList<Integer> []adjList) {
		this.adjacencyList = adjList;
	}
	
	public void FillAnEdge(int sourceVertex, int destinationVertex) {
		if(this.adjacencyList[sourceVertex] == null) {
			this.adjacencyList[sourceVertex] = new LinkedList<Integer>();
		}
		this.adjacencyList[sourceVertex].add(destinationVertex);
	}
	
	public int GetGraphVertices() {
		return this.numberOfVertices;
	}
	
	public LinkedList<Integer>[] GetGraphAdjacencyList(){
		return this.adjacencyList;
	}
	
	public LinkedList<Integer> GetAdjacenyListOfGivenVertex(int vertex){
		return this.adjacencyList[vertex];
	}
	
	public void PrintGraph() {
		for(int index = 0; index < this.numberOfVertices; index++) {
			System.out.println("Vertex is "+index);
			System.out.println("--- The corresponding adjacency list is ---");
			for(int adjIndex = 0; adjIndex < this.adjacencyList[index].size(); adjIndex++) {
				System.out.print(this.adjacencyList[index].get(adjIndex)+ " ");
			}
			System.out.println();
		}
	}
}
