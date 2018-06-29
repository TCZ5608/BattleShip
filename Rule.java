
public class Rule {
	private int ship_num;
	private int trap_num;
	private int pot_num;
	private static final int life_num = 15;
	private static final int map_row = 20;
	private static final int map_col = 60;
	private static final int[] beginner = {80, 10, 18};
	private static final int[] intermediate= {50, 20, 18};
	private static final int[] advance = {20, 30, 18};
	private static final int[][] shipLength = {{3},{5}};


	
	public Rule(){
		ship_num = 80;
		trap_num = 10;
		pot_num =18;
	}
	
	public void setLevel(int a) {
		switch (a){
		case 1:
			ship_num = beginner[1];
			trap_num = beginner[2];
			pot_num = beginner[3];
			
		case 2:
			ship_num = intermediate[1];
			trap_num = intermediate[2];
			pot_num = intermediate[3];
			
		case 3:
			ship_num = advance[1];
			trap_num = advance[2];
			pot_num = advance[3];
		}
	}
	
	public int getShipNum() {
		return ship_num;
	}
	
	public int getTrapNum() {
		return trap_num;
	}
	
	public int getPotNum() {
		return pot_num;
	}
	
	public int[][] getShipLength() {
		return shipLength;
	}
	
	public int getLifeNum() {
		return life_num;
	}
	
	public int getMapRow() {
		return map_row;
	}
	
	public int getMapCol() {
		return map_col;
	}
}

