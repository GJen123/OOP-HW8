
public abstract class Pokemon implements Fightable {
	private String nickName;
	private PokemonType type;
	private int cp;
	
	public Pokemon(String nickName, PokemonType type, int cp){
		this.nickName = nickName;
		this.type = type;
		this.cp = cp;
	}
	
	public void setNickName(String nickName){
		this.nickName = nickName;
	}
	public String getNickName(){
		return nickName;
	}
	
	public PokemonType getType(){
		return type;
	}
	
	public void setCp(int cp){
		this.cp = cp;
	}
	public int getCp(){
		return cp;
	}
	
	public abstract void attack();
}
