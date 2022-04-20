package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{
	
	//Construtor
	public King(Board board, Color color) {
		super(board, color);
	}
	
	// Métodos Específicos
	@Override
	public String toString() {
		return "K";
	}

}
