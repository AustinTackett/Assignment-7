//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] matrix1 = {{0, 3, 1},
                           {0, 0, 1},
                           {1, 1, 0}};


        if(IsDirected.isDirected(matrix1))
            System.out.println("Directed");
        else
            System.out.println("Undirected");


        //*********************************************************

        int[][] matrix2 = {{0, 1, 0, 0, 0, 0, 0, 0},
                           {1, 0, 1, 0, 0, 1, 0, 0},
                           {0, 1, 0, 1, 0, 0, 1, 0},
                           {0, 0, 1, 0, 1, 0, 0, 1},
                           {1, 0, 0, 1, 0, 1, 0, 0},
                           {0, 1, 0, 0, 1, 0, 1, 0},
                           {0, 0, 1, 0, 0, 1, 0, 1},
                           {0, 0, 0, 1, 0, 0, 1, 0}};

        FindEveryPath.findEveryPath(matrix2, 1, 6);
    }
}