package draft;

 public class OffensivePlayer extends NFLPlayer implements Celebrator {

	 private int receptions;
	 private double rushingyds;
	 private double YAC;
	 private int carries;
	
	
	public OffensivePlayer(String aname, int anumber) {
		super(aname, anumber);
	}
	
	public void setReceptions(int receptions1){
		receptions1 = receptions;
	}
	
	public int getReceptions(){
		return receptions;
	}
	
	public void setCarries(int carry1){
		carry1 = carries;
	}
	
	public double getCarries(){
		return carries;
	}
	
	public void setRushingyds(double rushingyds1){
		rushingyds1 = rushingyds;
	}

	public double getRushingyds(){
		return rushingyds;
	}
	
	
	
	@Override
	public String toString() {
		return "OffensivePlayer [receptions=" + receptions + ", rushingyds=" + rushingyds + ", YAC=" + YAC
				+ ", carries=" + carries + ", getReceptions()=" + getReceptions() + ", getCarries()=" + getCarries()
				+ ", getRushingyds()=" + getRushingyds() + ", "
				+ (getHeight() != null ? "getHeight()=" + getHeight() + ", " : "") + "getWeight()=" + getWeight() + ", "
				+ (getPosition() != null ? "getPosition()=" + getPosition() + ", " : "") + "getYards()=" + getYards()
				+ ", getTouchdowns()=" + getTouchdowns() + ", "
				+ (getCollege() != null ? "getCollege()=" + getCollege() + ", " : "") + "getFortyYardTime()="
				+ getFortyYardTime() + ", getVerticalJump()=" + getVerticalJump() + "]";
	}

	@Override
	public void celebrate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void wave() {
		
	}

	@Override
	public void backflip() {
		
	}

	@Override
	public void smiles() {
		
	}
	
	

	

	
}
 class DefensivePlayer extends NFLPlayer implements Celebrator {

	 private int tackles;
	 private int interceptions;
	 private int fumbleRecover;
	 private double sacks;
	 
	public DefensivePlayer(String aname, int anumber) {
		super(aname, anumber);
		
	}
	
	public void setTackles(int tackles1){
		tackles1 = tackles;
	}
	
	public int getTackles(){
		return tackles;
	}
	
	public void setInterceptions(int interceptions1){
		interceptions1 = interceptions;
	}
	
	public int getInterceptions(){
		return interceptions;
	}
	
	public void setfumbleRecover(int fumbleRecover1){
		fumbleRecover1 = fumbleRecover;
	}
	
	public int getfumbleRecover(){
		return fumbleRecover;
	}
	
	public void setSacks(double sacks1){
		sacks1 = sacks;
	}
	
	public double getSacks(){
		return sacks;
	}
	
	@Override
	public String toString() {
		return "DefensivePlayer [getTackles()=" + getTackles() + ", getInterceptions()=" + getInterceptions()
				+ ", getfumbleRecover()=" + getfumbleRecover() + ", getSacks()=" + getSacks() + ", "
				+ (getHeight() != null ? "getHeight()=" + getHeight() + ", " : "") + "getWeight()=" + getWeight() + ", "
				+ (getPosition() != null ? "getPosition()=" + getPosition() + ", " : "") + "getYards()=" + getYards()
				+ ", getTouchdowns()=" + getTouchdowns() + ", "
				+ (getCollege() != null ? "getCollege()=" + getCollege() + ", " : "") + "getFortyYardTime()="
				+ getFortyYardTime() + ", getVerticalJump()=" + getVerticalJump() + ", "
				+ (super.toString() != null ? "toString()=" + super.toString() + ", " : "") + "getVerticaljump()="
				+ getVerticaljump() + ", " + (getClass() != null ? "getClass()=" + getClass() + ", " : "")
				+ "hashCode()=" + hashCode() + "]";
	}

	@Override
	public void celebrate() {
		
		
	}

	@Override
	public void dance() {
	
	}

	@Override
	public void wave() {
		
	}

	@Override
	public void backflip() {
		
	}

	@Override
	public void smiles() {
		
	}
	
 } 

