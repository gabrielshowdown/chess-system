package boardgame;

public class Board {
	
	// Atributos
	private Integer rows;
	private Integer columns;
	private Piece [] [] pieces;
	
	// Construtor
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece [rows][columns];
	}

	// Métodos Acessores
	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}
	
	// Métodos Específicos
	public Piece piece (int rows, int column) {
		return pieces[rows][column];
	}

	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
}
