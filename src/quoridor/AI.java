package quoridor;

public class AI implements Player {
	private String name;
	private int numWalls;
	private Difficulty dif;
	private String symbol;
	private Direction end;
	public Direction getEnd() {
		return end;
	}
	public void setEnd(Direction end) {
		this.end = end;
	}
	public int getNumWalls() {
		return numWalls;
	}
	public void setNumWalls(int numWalls) {
		this.numWalls = numWalls;
	}
	public Difficulty getDif() {
		return dif;
	}
	public void setDif(Difficulty dif) {
		this.dif = dif;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	AI(Difficulty diff){
		this.dif = diff;
	}
	@Override
	public String getMove() {
		// TODO Auto-generated method stub
		
		return null;
	}
	@Override
	public String getSymbol() {
		// TODO Auto-generated method stub
		return this.symbol;
	}
	@Override
	public void setSymbol(String symbol) {
		// TODO Auto-generated method stub
		this.symbol = symbol;
	}

}
