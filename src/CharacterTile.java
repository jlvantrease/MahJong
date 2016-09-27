
public class CharacterTile extends Tile {

	protected char symbol;
	
	public CharacterTile(char symbol){
		this.symbol = symbol;		
	}
	
	public boolean matches(Tile other){
		if(this == other) 
			return true;
		
		if(other == null) 
			return false;
		
		if(getClass() != other.getClass())
			return false;
		
		CharacterTile otherObject = (CharacterTile)other;
		
		return symbol == otherObject.symbol;	
	}
	
	public String toString(){
		
		String temp = Character.toString(symbol);
		
		if (temp.matches("[0-9]")){
			return "Character "+ symbol;
			}else{
				
				switch (temp.toLowerCase()){
					case "N": temp = "North Wind"; break;
					case "E": temp = "East Wind"; break;
					case "W": temp=  "West Wind"; break;
					case "S": temp = "North Wind"; break;
					case "C": temp = "Red Dragon"; break;
					case "F": temp = "Green Dragon"; break;
				}
			}	
		return "Character "+ temp;
			
	}
	
}
