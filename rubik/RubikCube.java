package rubik;

public class RubikCube {
    public static void main(String args[]) {
        System.out.println("Starting...");
        Cube cube = new Cube();
        cube.rotateCubeLeft();
        cube.printCube();
        //System.out.println("Number of sticker is: " + cube.countSticker());
//        cube.printFace();
//        cube.printLeft();
//        cube.printBack();
//        cube.printRight();
//        cube.printUp();
//        cube.printDown();
    }
}


