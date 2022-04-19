package boardgame;

public class Position {
	
	// Atributos
	private Integer row;
	private Integer column;
		
	// Construtor
	public Position(Integer row, Integer column) {
		super();
		this.row = row;
		this.column = column;
	}

	// Métodos Acessores
	public Integer getRow() {
		return row;
	}

	public void setRow(Integer row) {
		this.row = row;
	}

	public Integer getColumn() {
		return column;
	}

	public void setColumn(Integer column) {
		this.column = column;
	}

	// Métodos Específicos
	@Override
	public String toString() {
		return this.getRow() + ", " + this.getColumn();
	}
	
}
