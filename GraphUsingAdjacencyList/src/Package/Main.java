package Package;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Printing a Graph using its Adjacency List");
		System.out.println("-----------------------------------------");
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number of vertices in the graph");
			int numberOfVertices = scanner.nextInt();
			Graph graph = new Graph(numberOfVertices);
			for(int index = 0; index < numberOfVertices; index++) {
				System.out.println("Enter the number of adjacent vertices for this"
						+ " vertex "+(index+1));
				int adjVertexCount = scanner.nextInt();
				for(int adjVertexIndex = 0; adjVertexIndex <  adjVertexCount; adjVertexIndex++) {
					System.out.println("Enter the adjacent vertex "+(adjVertexIndex+1));
					int adjVertex = scanner.nextInt();
					graph.FillAnEdge(index, adjVertex);
				}
			}
			graph.PrintGraph();
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getMessage());
		}
	}
}
