package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{
	
	//Construtor
	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	// Métodos Específicos
	@Override
	public String toString() {
		return "R";
	}

}
