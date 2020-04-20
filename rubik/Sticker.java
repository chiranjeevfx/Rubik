package rubik;

enum Sticker {
    R(1),
    B(2),
    O(3),
    G(4),
    Y(5),
    W(6),
    Z(-1);
    int pos;

    Sticker(int pos) {
        this.pos = pos;
    }
}

