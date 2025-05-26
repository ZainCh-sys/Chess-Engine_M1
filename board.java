public class board {
    public long whitePawns = 0b0000000011111111000000000000000000000000000000000000000000000000L;
    public long whiteKnights = 0b0100001000000000000000000000000000000000000000000000000000000000L;
    public long whiteBishops = 0b0010010000000000000000000000000000000000000000000000000000000000L;
    public long whiteRooks = 0b100000010000000000000000000000000000000000000000000000000000000L;
    public long whiteQueens = 0b000100000000000000000000000000000000000000000000000000000000000L;
    public long whiteKing = 0b000010000000000000000000000000000000000000000000000000000000000L;

    public long blackPawns = 0b0000000000000000000000000000000000000000000000001111111100000000L;
    public long blackKnights = 0b0000000000000000000000000000000000000000000000000000000001000010L;
    public long blackBishops = 0b0000000000000000000000000000000000000000000000000000000000100100L;
    public long blackRooks = 0b0000000000000000000000000000000000000000000000000000000010000001L;
    public long blackQueens = 0b0000000000000000000000000000000000000000000000000000000000010000L;
    public long blackKing = 0b0000000000000000000000000000000000000000000000000000000000001000L;

    public boolean whiteTurn;
    public int castlingRight;
    public int enPassantSquare;

    // Piece-square tables for positional value
    public static final double[] valueTabel = {
        -5, -4, -3, -3, -3, -3, -4, -5,
        -4, -2,  0,  0,  0,  0, -2, -4,
        -3,  0,  1,  1.5, 1.5, 1,  0, -3,
        -3,  0.5, 1.5, 2, 2, 1.5, 0.5, -3,
        -3,  0,  1.5, 2, 2, 1.5, 0, -3,
        -3,  0.5, 1, 1.5, 1.5, 1, 0.5, -3,
        -4, -2,  0,  0.5, 0.5, 0, -2, -4,
        -5, -4, -3, -3, -3, -3, -4, -5
    };

    public boolean whiteMated() {
      return false;
    }

    public boolean blackMated() {
      return false;
    }

    public float evaluate() {
      if (this.whiteMated()) {
          return -1000.0f;
      }
      if (this.blackMated()) {
          return 1000.0f;
      }
      return 1000.0f;
    }
}
