package rubik;

class Cube {
    Piece pieces[][][];

    int len =3;

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

    public boolean solvedFace() {
        Sticker prev = Sticker.Z;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                Sticker curr = pieces[i][j][0].F;
                if (curr != prev && prev != Sticker.Z) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
    }

    public void printLeft() { // x==0 is Left.
        System.out.println("Left:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = len-1; j >=0; j--) {
                System.out.print(pieces[i][0][j].L + " ");
            }
            System.out.println();
        }
    }

    public boolean solvedLeft() {
        Sticker prev = Sticker.Z;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                Sticker curr = pieces[i][0][j].L;
                if (curr != prev && prev != Sticker.Z) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
    }

    public void printBack() { // y==2 is Back.
        System.out.println("Back:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = len-1; j >=0; j--) {
                System.out.print(pieces[i][j][2].B + " ");
            }
            System.out.println();
        }
    }

    public boolean solvedBack() {
        Sticker prev = Sticker.Z;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= 0; j--) {
                Sticker curr = pieces[i][j][2].B;
                if (curr != prev && prev != Sticker.Z) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
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

    public boolean solvedRight() {
        Sticker prev = Sticker.Z;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                Sticker curr = pieces[i][2][j].R;
                if (curr != prev && prev != Sticker.Z) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
    }

    public void printUp() { // z==2 is Up.
        System.out.println("Up:");
        int len = 3;
        for (int i = len-1; i >=0; i--) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[2][j][i].U + " ");
            }
            System.out.println();
        }
    }

    public boolean solvedUp() {
        Sticker prev = Sticker.Z;
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                Sticker curr = pieces[2][j][i].U;
                if (curr != prev && prev != Sticker.Z) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
    }

    public void printDown() { // z==0 is Down.
        System.out.println("Down:");
        int len = 3;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(pieces[0][j][i].D + " ");
            }
            System.out.println();
        }
    }

    public boolean solvedDown() {
        Sticker prev = Sticker.Z;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                Sticker curr = pieces[0][j][i].D;
                if (curr != prev && prev != Sticker.Z) {
                    return false;
                }
                prev = curr;
            }
        }
        return true;
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
        _L();_U();L();
    }

    public void leftTriggerStep4() { // U’ + Left Trigger
        _U();leftTrigger();
    }

    public void rightTriggerStep4() { // U + Right Trigger
        U();rightTrigger();
    }

    public void rotateCubeLeft() { // rotate the cube in the direction of U
        U();M();_D();
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

    public void M() { // rotate middle layer in the same direction as U
        // z = 1;
        Piece tmp = pieces[1][0][0];
        pieces[1][0][0] = pieces[1][2][0];pieces[1][0][0].U();
        pieces[1][2][0] = pieces[1][2][2];pieces[1][2][0].U();
        pieces[1][2][2] = pieces[1][0][2];pieces[1][2][2].U();
        pieces[1][0][2] = tmp;pieces[1][0][2].U();

        tmp = pieces[1][1][0];
        pieces[1][1][0] = pieces[1][2][1];pieces[1][1][0].U();
        pieces[1][2][1] = pieces[1][1][2];pieces[1][2][1].U();
        pieces[1][1][2] = pieces[1][0][1];pieces[1][1][2].U();
        pieces[1][0][1] = tmp;pieces[1][0][1].U();
    }

    public void _D() { // rotate lower(down) layer in the same direction as U
        // z = 0;
        Piece tmp = pieces[0][0][0];
        pieces[0][0][0] = pieces[0][2][0];pieces[0][0][0].U();
        pieces[0][2][0] = pieces[0][2][2];pieces[0][2][0].U();
        pieces[0][2][2] = pieces[0][0][2];pieces[0][2][2].U();
        pieces[0][0][2] = tmp;pieces[0][0][2].U();

        tmp = pieces[0][1][0];
        pieces[0][1][0] = pieces[0][2][1];pieces[0][1][0].U();
        pieces[0][2][1] = pieces[0][1][2];pieces[0][2][1].U();
        pieces[0][1][2] = pieces[0][0][1];pieces[0][1][2].U();
        pieces[0][0][1] = tmp;pieces[0][0][1].U();
    }

    public void L() {
        // x = 0;
        Piece tmp = pieces[0][0][0];
        pieces[0][0][0] = pieces[2][0][0];pieces[0][0][0].L();
        pieces[2][0][0] = pieces[2][0][2];pieces[2][0][0].L();
        pieces[2][0][2] = pieces[0][0][2];pieces[2][0][2].L();
        pieces[0][0][2] = tmp;pieces[0][0][2].L();

        tmp = pieces[1][0][0];
        pieces[1][0][0] = pieces[2][0][1];pieces[1][0][0].L();
        pieces[2][0][1] = pieces[1][0][2];pieces[2][0][1].L();
        pieces[1][0][2] = pieces[0][0][1];pieces[1][0][2].L();
        pieces[0][0][1] = tmp;pieces[0][0][1].L();
    }

    public void _L() {
        L();L();L();
    }

    public void _U() {
        U();U();U();
    }

    public void _R() {
        // x = 2;
        Piece tmp = pieces[0][2][0];
        pieces[0][2][0] = pieces[2][2][0];pieces[0][2][0]._R();
        pieces[2][2][0] = pieces[2][2][2];pieces[2][2][0]._R();
        pieces[2][2][2] = pieces[0][2][2];pieces[2][2][2]._R();
        pieces[0][2][2] = tmp;pieces[0][2][2]._R();

        tmp = pieces[1][2][0];
        pieces[1][2][0] = pieces[2][2][1];pieces[1][2][0]._R();
        pieces[2][2][1] = pieces[1][2][2];pieces[2][2][1]._R();
        pieces[1][2][2] = pieces[0][2][1];pieces[1][2][2]._R();
        pieces[0][2][1] = tmp;pieces[0][2][1]._R();
    }

    public void F() {
        // y = 0;
        Piece tmp = pieces[0][0][0];
        pieces[0][0][0] = pieces[0][2][0];pieces[0][0][0].F();
        pieces[0][2][0] = pieces[2][2][0];pieces[0][2][0].F();
        pieces[2][2][0] = pieces[2][0][0];pieces[2][2][0].F();
        pieces[2][0][0] = tmp;pieces[2][0][0].F();

        tmp = pieces[1][0][0];
        pieces[1][0][0] = pieces[0][1][0];pieces[1][0][0].F();
        pieces[0][1][0] = pieces[1][2][0];pieces[0][1][0].F();
        pieces[1][2][0] = pieces[2][1][0];pieces[1][2][0].F();
        pieces[2][1][0] = tmp;pieces[2][1][0].F();
    }

    public void _F() {
        F();F();F();
    }

    public void F2() {
        F();F();
    }

    public void R() {
        _R();_R();_R();
    }


    public void yellowCrossStep5() {// F U R U’ R’ F’ (yellow cross)
        F();U();R();_U();_R();_F();
    }

    public void yellowFaceStep6() {// R U R’ U R U2 R’ (Yellow Face)
        R();U();_R();U();R();U();U();_R();
    }

    public void topCornersStep7() {// L’ U R U’ L U R’ R U R’ U R U2 R’ (top corners)
        _L();U();R();_U();L();U();_R();
        yellowFaceStep6();
    }

    public void cwStep8() {// F2 U R’ L F2 L’ R U F2
        F2();U();_R();L();F2();_L();R();U();F2();
    }

    public void randomize() {
        // randomize.
        for(int i=0;i<10;i++) {
            leftTrigger();rightTrigger();
        }
    }

    public boolean isCubeSolved() {
        return solvedFace() && solvedLeft() && solvedBack() && solvedRight() && solvedUp() && solvedDown();
    }

    public boolean isDaisy() {
        Sticker w = Sticker.W;
        return pieces[2][0][1].U == w && pieces[2][1][2].U == w && pieces[2][2][1].U == w && pieces[2][1][0].U == w;
    }

    public boolean whiteCross() {
        Sticker w = Sticker.W;
        return pieces[0][0][1].D == w && pieces[0][1][2].D == w && pieces[0][2][1].D == w && pieces[0][1][0].D == w;
    }

    public void makeDaisy() {
        //System.out.println("Making Daisy...");
        int count=0;
        while (!isDaisy() && count++ < 100) {
            //printUp();
            if (pieces[2][2][1].U == Sticker.W) {
                U();
            } else if (pieces[2][2][1].R == Sticker.W) {
                _R();
            } else if (pieces[1][2][0].R == Sticker.W) {
                while (pieces[2][1][0].U == Sticker.W) {
                    U();
                }
                _F();
            } else if (pieces[1][2][0].F == Sticker.W) {
                while (pieces[2][2][1].U == Sticker.W) {
                    U();
                }
                R();
            } else if (pieces[0][2][1].R == Sticker.W || pieces[0][2][1].D == Sticker.W) {
                while (pieces[2][2][1].U == Sticker.W) {
                    U();
                }
                R();
            } else {
                rotateCubeLeft();
            }
        }
        //printUp();
    }

    public void makeWhiteCross() {
        while (!whiteCross()) {
            while(pieces[2][1][0].F != pieces[1][1][0].F) {
                U();
            }
            F2();
            rotateCubeLeft();
        }
    }

    public void solveBottomLayer() {
        int noWorkTry=0;
        while (!solvedDown() && noWorkTry<100) {
            if (pieces[2][2][0].R == Sticker.W) {
                while (pieces[2][2][0].F != pieces[1][1][0].F) {
                    rotateCubeLeft();
                    _U();
                }
                rightTrigger();
                noWorkTry=0;
            } else if (pieces[2][2][0].F == Sticker.W) {
                U();
                while (pieces[2][0][0].F != pieces[1][1][0].F) {
                    rotateCubeLeft();
                    _U();
                }
                leftTrigger();
                noWorkTry=0;
            } else if (pieces[2][2][0].U == Sticker.W) {
                while (pieces[0][2][0].D == Sticker.W && pieces[0][2][0].F == pieces[0][1][0].F) {
                    rotateCubeLeft();
                    _U();
                }
                rightTrigger();
                noWorkTry=0;
            } else {
                // System.out.println("noWorkTry: " + noWorkTry);
                // printDown();
                noWorkTry++;
                rotateCubeLeft();
                if(noWorkTry>3) {
                    rightTrigger();
                }
            }
        }
    }

    /**
     * Check if middle layer is solved.
     *
     * @return
     */
    public boolean isSolvedMiddleLayer() {
        return pieces[1][0][0].F == pieces[1][1][0].F && pieces[1][1][0].F == pieces[1][2][0].F &&
                pieces[1][0][2].L == pieces[1][0][1].L && pieces[1][0][1].L == pieces[1][0][0].L &&
                pieces[1][0][2].B == pieces[1][1][2].B && pieces[1][1][2].B == pieces[1][2][2].B &&
                pieces[1][2][2].R == pieces[1][2][1].R && pieces[1][2][1].R == pieces[1][2][0].R;
    }

    public void fixWhitePiece() {
        if (pieces[2][2][0].R == Sticker.W) {
            while(pieces[2][2][0].F != pieces[1][1][0].F) {
                rotateCubeLeft();_U();
            }
            U();
            rightTrigger();
        } else {
            if (pieces[2][2][0].F != Sticker.W) {
                System.out.println(pieces[2][2][0].R + " Exception...Impossible " + pieces[2][2][0].F);
                printFace();printUp();printRight();
            }
            U();// bring it on L from L
            while(pieces[2][0][0].F != pieces[1][1][0].F) {
                rotateCubeLeft();_U();
            }
            leftTrigger();
        }
    }

    public void solveMiddleLayer() {
        int steps = 0;
        while (!isSolvedMiddleLayer() && steps++ < 1000) {
            // keep solving
            if (!solvedDown()) {
                System.out.println("Problem encountered step: " + steps);
                printDown();
            }
            int turns = 0;
            while (pieces[2][1][0].F == Sticker.Y || pieces[2][1][0].U == Sticker.Y) {
                //System.out.println("turns: " + turns);
                U();
                turns++;
                if (turns > 4) {
                    turns = 0;
                    while (pieces[1][2][0].F == pieces[1][1][0].F && pieces[1][2][0].R == pieces[1][2][1].R) {
                        rotateCubeLeft();
                    }
                    rightTrigger();
                    _U();
                    solveBottomLayer();
                }
            }
            while (pieces[2][1][0].F != pieces[1][1][0].F) {
                rotateCubeLeft();
                _U();
            }
            if (pieces[2][1][0].U == pieces[1][2][1].R) {
                U();
                rightTrigger();
                _U();
            } else {
                // match left.
                if (pieces[2][1][0].U != pieces[1][0][1].L) {
                    System.out.println("Exception occurred");
                }
                _U();
                leftTrigger();
            }
            if (pieces[2][2][0].F == Sticker.W || pieces[2][2][0].R == Sticker.W) {
                solveBottomLayer();
            } else {
                System.out.println("Exception occurred, TopRightFace...U:" + pieces[2][2][0].U + " F:" + pieces[2][2][0].F + ",R:" + pieces[2][2][0].R);
            }
            rotateCubeLeft();
        }
    }

    public boolean isYellowCross() {
        return pieces[2][1][0].U == Sticker.Y && pieces[2][1][2].U == Sticker.Y &&
                pieces[2][0][1].U == Sticker.Y && pieces[2][2][1].U == Sticker.Y;
    }

    public int countYellowEdge() {
        int yellowEdge = 0;
        if (pieces[2][1][0].U == Sticker.Y) yellowEdge++;
        if (pieces[2][1][2].U == Sticker.Y) yellowEdge++;
        if (pieces[2][0][1].U == Sticker.Y) yellowEdge++;
        if (pieces[2][2][1].U == Sticker.Y) yellowEdge++;
        return yellowEdge;
    }

    public int countYellowCorner() {
        int yellowCorner = 0;
        if (pieces[2][0][0].U == Sticker.Y) yellowCorner++;
        if (pieces[2][0][2].U == Sticker.Y) yellowCorner++;
        if (pieces[2][2][0].U == Sticker.Y) yellowCorner++;
        if (pieces[2][2][2].U == Sticker.Y) yellowCorner++;
        return yellowCorner;
    }

    public boolean isYellowCornerOnTopLeftUp() {
        return pieces[2][0][0].U == Sticker.Y;
    }

    public boolean isYellow9and12Pos() {
        return pieces[2][1][2].U == Sticker.Y && pieces[2][0][1].U == Sticker.Y;
    }

    public boolean isYellowLine() {
        return pieces[2][1][0].U == Sticker.Y && pieces[2][1][2].U == Sticker.Y;
    }

    public void makeYellowCross() {
        int steps = 0;
        while (!isYellowCross() && steps++ < 100) {
            while (!isYellow9and12Pos() && !isYellowLine() && steps++ < 100) {
                if (countYellowEdge() < 1) {
                    yellowCrossStep5();
                } else {
                    //printUp();
                    U();
                }
            }
            yellowCrossStep5();
        }
    }

    public void makeYellowFace() {
        int steps = 0;
        while (!solvedUp() && steps++ < 100) {
            if (countYellowCorner() == 1) {
                while (!isYellowCornerOnTopLeftUp()) {
                    U();
                }
            } else {
                while (pieces[2][0][0].L != Sticker.Y && steps++ < 100) {
                    U();
                }
            }
            yellowFaceStep6();
        }
    }

    public int numberOfFaceMatchingTopCorner() {
        int ans = 0;
        if (pieces[2][0][0].L == pieces[2][0][2].L) ans++;
        if (pieces[2][0][2].B == pieces[2][2][2].B) ans++;
        if (pieces[2][2][2].R == pieces[2][2][0].R) ans++;
        if (pieces[2][0][0].F == pieces[2][2][0].F) ans++;
        return ans;
    }

    public void positionTopCorners() {
        int steps = 0;
        while (numberOfFaceMatchingTopCorner() < 4 && steps++ < 100) {
            if (numberOfFaceMatchingTopCorner() == 1) {
                while (pieces[2][0][0].L != pieces[2][0][2].L) {
                    U();
                }
            }
            topCornersStep7();
        }
        // match corners with corresponding face.
        while (pieces[2][0][0].L != pieces[1][0][0].L) {
            U();
        }
    }

    public void solve() {
        int steps = 0;
        while (!isCubeSolved() && steps++ < 10) {
            // 1. Create Daisy
            makeDaisy();
            // 2. Make white cross
            makeWhiteCross();
            // 3. solve bottom layer.
            solveBottomLayer();
            // 4. Solve middle layer.
            solveMiddleLayer();
            // 5. yellow cross.
            makeYellowCross();
            // 6. Yellow Face
            makeYellowFace();
            // 7. Top corners
            positionTopCorners();
        }
    }
}
