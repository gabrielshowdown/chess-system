package boardgame;

public class Piece {

	// Atributos
	protected Position position;
	private Board board;
	
	// Construtor
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	// Métodos Acessores
	protected Board getBoard() {
		return board;
	}

	
}
