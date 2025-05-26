# Chess-Engine_M1
Chess Engine_M1 made with java

# Chess Board Evaluation

This Java project defines a `board` class representing a chessboard using bitboards for piece positions and provides basic infrastructure for evaluating board states.

---

## Overview

- Uses **64-bit long integers** as bitboards to represent positions of chess pieces on the board.
- Each piece type (pawns, knights, bishops, rooks, queens, kings) has a separate bitboard for **white** and **black** pieces.
- Provides placeholders for:
  - Checking checkmate status (`whiteMated()`, `blackMated()`).
  - Evaluating board position (`evaluate()`).
  - Evaluating black king safety (`evaluateBlackKing()`).

---

## Key Concepts

- Bitboards: Each `long` represents an 8x8 chessboard, with bits set to `1` representing presence of pieces.
- Position evaluation is based on material and piece-square tables (not fully implemented yet).
- The code uses binary literals (prefixed with `0b`) and the `L` suffix for `long` literals.

---

## Usage

Create an instance of the `board` class to represent a specific board state.

```java
board chessBoard = new board();
float evaluation = chessBoard.evaluate();
System.out.println("Board evaluation: " + evaluation);

