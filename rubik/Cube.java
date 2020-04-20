package rubik;

class Cube {
    Piece pieces[][][];

    Cube() {
        pieces = new Piece[3][3][3];// z(vertical),x(horizontal),y(face to back)
        // bottom layer
        pieces[0][0][0] = new Piece(Sticker.R, Sticker.B, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.W);
        pieces[0][0][1] = new Piece(Sticker.Z, Sticker.B, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.W);
        pieces[0][0][2] = new Piece(Sticker.Z, Sticker.B, Sticker.O, Sticker.Z, Sticker.Z, Sticker.W);
        pieces[0][1][0] = new Piece(Sticker.R, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.W);
        pieces[0][1][1] = new Piece(Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.W);
        pieces[0][1][2] = new Piece(Sticker.Z, Sticker.Z, Sticker.O, Sticker.Z, Sticker.Z, Sticker.W);
        pieces[0][2][0] = new Piece(Sticker.R, Sticker.Z, Sticker.Z, Sticker.G, Sticker.Z, Sticker.W);
        pieces[0][2][1] = new Piece(Sticker.Z, Sticker.Z, Sticker.Z, Sticker.G, Sticker.Z, Sticker.W);
        pieces[0][2][2] = new Piece(Sticker.Z, Sticker.Z, Sticker.O, Sticker.G, Sticker.Z, Sticker.W);

        //middle layer
        pieces[1][0][0] = new Piece(Sticker.R, Sticker.B, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z);
        pieces[1][0][1] = new Piece(Sticker.Z, Sticker.B, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z);
        pieces[1][0][2] = new Piece(Sticker.Z, Sticker.B, Sticker.O, Sticker.Z, Sticker.Z, Sticker.Z);
        pieces[1][1][0] = new Piece(Sticker.R, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z);
        pieces[1][1][1] = new Piece(Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z);
        pieces[1][1][2] = new Piece(Sticker.Z, Sticker.Z, Sticker.O, Sticker.Z, Sticker.Z, Sticker.Z);
        pieces[1][2][0] = new Piece(Sticker.R, Sticker.Z, Sticker.Z, Sticker.G, Sticker.Z, Sticker.Z);
        pieces[1][2][1] = new Piece(Sticker.Z, Sticker.Z, Sticker.Z, Sticker.G, Sticker.Z, Sticker.Z);
        pieces[1][2][2] = new Piece(Sticker.Z, Sticker.Z, Sticker.O, Sticker.G, Sticker.Z, Sticker.Z);

        //top layer
        pieces[2][0][0] = new Piece(Sticker.R, Sticker.B, Sticker.Z, Sticker.Z, Sticker.Y, Sticker.Z);
        pieces[2][0][1] = new Piece(Sticker.Z, Sticker.B, Sticker.Z, Sticker.Z, Sticker.Y, Sticker.Z);
        pieces[2][0][2] = new Piece(Sticker.Z, Sticker.B, Sticker.O, Sticker.Z, Sticker.Y, Sticker.Z);
        pieces[2][1][0] = new Piece(Sticker.R, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Y, Sticker.Z);
        pieces[2][1][1] = new Piece(Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Z, Sticker.Y, Sticker.Z);
        pieces[2][1][2] = new Piece(Sticker.Z, Sticker.Z, Sticker.O, Sticker.Z, Sticker.Y, Sticker.Z);
        pieces[2][2][0] = new Piece(Sticker.R, Sticker.Z, Sticker.Z, Sticker.G, Sticker.Y, Sticker.Z);
        pieces[2][2][1] = new Piece(Sticker.Z, Sticker.Z, Sticker.Z, Sticker.G, Sticker.Y, Sticker.Z);
        pieces[2][2][2] = new Piece(Sticker.Z, Sticker.Z, Sticker.O, Sticker.G, Sticker.Y, Sticker.Z);
    }

    public void printFace() { // y==0 is face.
        System.out.println("Face:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[i][j][0].F + " ");
            }
            System.out.println();
        }
    }

    public void printLeft() { // x==0 is Left.
        System.out.println("Left:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[i][0][j].L + " ");
            }
            System.out.println();
        }
    }

    public void printBack() { // y==2 is Back.
        System.out.println("Back:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[i][j][2].B + " ");
            }
            System.out.println();
        }
    }

    public void printRight() { // x==2 is Right.
        System.out.println("Right:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[i][2][j].R + " ");
            }
            System.out.println();
        }
    }

    public void printUp() { // z==2 is Up.
        System.out.println("Up:");
        int len = 3;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[2][i][j].U + " ");
            }
            System.out.println();
        }
    }

    public void printDown() { // z==0 is Down.
        System.out.println("Down:");
        int len = 3;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[0][i][j].D + " ");
            }
            System.out.println();
        }
    }

    public int countSticker() {
        System.out.println("Counting sticker:");
        int ans = 0;
        int len = 3;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = 0; k < len; k++) {
                    Piece p = pieces[i][j][k];
                    if (!p.F.equals(Sticker.Z)) {
                        ans++;
                    }
                    if (!p.L.equals(Sticker.Z)) {
                        ans++;
                    }
                    if (!p.B.equals(Sticker.Z)) {
                        ans++;
                    }
                    if (!p.R.equals(Sticker.Z)) {
                        ans++;
                    }
                    if (!p.U.equals(Sticker.Z)) {
                        ans++;
                    }
                    if (!p.D.equals(Sticker.Z)) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public void printCube() {
        printFace();
        printLeft();
        printBack();
        printRight();
        printUp();
        printDown();
    }

    public void rightTrigger() { // RUR_
        R();
        U();
        _R();
    }

    public void leftTrigger() { // _L _U L
        // _L();_U();L();
    }

    public void U() {
        // z = 2;
        Piece tmp = pieces[2][0][0];
        pieces[2][0][0] = pieces[2][2][0];pieces[2][0][0].U();
        pieces[2][2][0] = pieces[2][2][2];pieces[2][2][0].U();
        pieces[2][2][2] = pieces[2][0][2];pieces[2][2][2].U();
        pieces[2][0][2] = tmp;pieces[2][0][2].U();

        tmp = pieces[2][1][0];
        pieces[2][1][0] = pieces[2][2][1];pieces[2][1][0].U();
        pieces[2][2][1] = pieces[2][1][2];pieces[2][2][1].U();
        pieces[2][1][2] = pieces[2][0][1];pieces[2][1][2].U();
        pieces[2][0][1] = tmp;pieces[2][0][1].U();
    }

    public void R() {
    }

    public void _R() {

    }
}
