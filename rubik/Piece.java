package rubik;

class Piece {
    Sticker F, L, B, R, U, D;

    Piece() {
    }

    Piece(Sticker F, Sticker L, Sticker B, Sticker R, Sticker U, Sticker D) {
        this.F = F;
        this.L = L;
        this.B = B;
        this.R = R;
        this.U = U;
        this.D = D;
    }

    public void U() {
        Sticker tmp = F;
        F = R;
        R = B;
        B = L;
        L = tmp;
    }

    // U prime
    public void _U() {
        Sticker tmp = F;
        F = L;
        L = B;
        B = R;
        R = tmp;
    }

    public void R() {
        Sticker tmp = F;
        F = D;
        D = B;
        B = U;
        U = tmp;
    }

    // R prime
    public void _R() {
        Sticker tmp = F;
        F = U;
        U = B;
        B = D;
        D = tmp;
    }

    // L prime
    public void _L() {
        Sticker tmp = F;
        F = D;
        D = B;
        B = U;
        U = tmp;
    }

    public void L() {
        Sticker tmp = F;
        F = U;
        U = B;
        B = D;
        D = tmp;
    }

    public void F() {
        Sticker tmp = L;
        L = D;
        D = R;
        R = U;
        U = tmp;
    }

    // F prime
    public void _F() {
        Sticker tmp = L;
        L = U;
        U = R;
        R = D;
        D = tmp;
    }
}
