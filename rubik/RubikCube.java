package rubik;

public class RubikCube {
    public static void main(String args[]) {
        System.out.println("Starting...");
        Cube cube = new Cube();
        //cube.rotateCubeLeft();cube.rotateCubeLeft();
        //System.out.println("solved isCubeSolved? " + cube.isCubeSolved());
        cube.randomize();
//        cube.makeDaisy();cube.makeWhiteCross();
//        cube.solveBottomLayer();
//        cube.solveMiddleLayer();
//        cube.makeYellowCross();
//        cube.makeYellowFace();
//        cube.positionTopCorners();
//        cube.finalStep();
        cube.solve();
        cube.printCube();
        cube.printStepsTaken();
        //System.out.println("Number of sticker is: " + cube.countSticker());
    }

}


