public class Main {

    public static void main(String[] args) {
        Puzzle p = new Puzzle();

        timeTesting stopWatch = new timeTesting();
        stopWatch.start();

        p.setFileLocation("D:\\IIT\\2ND YEAR\\2ND SEMESTER\\Algorithms Theory, Design and Implementation\\Coursework\\Algo\\puzzle_1280.txt");
        p.initializePuzzleArray();
        p.fillPuzzleArray();
        UndirectedGraph g = new UndirectedGraph();
        p.createGraph(g);
        p.printPathDetails(g);

        stopWatch.stop();

        System.err.println("elapsed time: " + stopWatch.getElapsedTime());


    }

}
