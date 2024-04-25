import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class FindEveryPath {
    public static void findEveryPath(int[][] matrix, int u, int w) {
        Queue<ArrayList<Integer>> frontier = new LinkedList<>();
        ArrayList<Integer> visited = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        path.add(u);
        frontier.add(path);

        while(!frontier.isEmpty()) {
            path = frontier.poll();
            int vertex = path.getLast();


            if(vertex == w && path.size() == 5)
                System.out.println(path);

            if(!visited.contains(vertex)) {
                visited.add(vertex);
                for (int adjacentVertex = 0; adjacentVertex < matrix[0].length; adjacentVertex++) {
                    if (matrix[vertex][adjacentVertex] != 0) {
                        ArrayList<Integer> tempPath = new ArrayList<>(path);
                        tempPath.add(adjacentVertex);
                        frontier.offer(tempPath);
                    }
                }

            }
        }



    }
}
