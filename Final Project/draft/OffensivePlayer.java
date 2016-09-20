package draft;

 class OffensivePlayer extends NFLPlayer implements Celebrator {

	protected int receptions;
	protected double rushingyds;
	protected double YAC;
	
	public OffensivePlayer(String aname, int anumber) {
		super(aname, anumber);
		
	}
	
	public void setReceptions(int receptions1){
		receptions1 = receptions;
	}
	
	int getReceptions(){
		return receptions;
	}
	
	public void setRushingyds(double rushingyds1){
		rushingyds1 = rushingyds;
	}

	double getRushingyds(){
		return rushingyds;
	}
	
	@Override
	public String toString(){
		return "Offensive Player";
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backflip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smiles() {
		// TODO Auto-generated method stub
		
	}
	
}
 class DefensivePlayer extends NFLPlayer {

	 protected int tackles;
	 protected int interceptions;
	 protected int fumbleRecover;
	 protected double sacks;
	 
	public DefensivePlayer(String aname, int anumber) {
		super(aname, anumber);
		
	}
	
	public void setTackles(int tackles1){
		tackles1 = tackles;
	}
	
	int getTackles(){
		return tackles;
	}
	
	public void setInterceptions(int interceptions1){
		interceptions1 = interceptions;
	}
	
	int getInterceptions(){
		return interceptions;
	}
	
	public void setfumbleRecover(int fumbleRecover1){
		fumbleRecover1 = fumbleRecover;
	}
	
	int getfumbleRecover(){
		return fumbleRecover;
	}
	
	public void setSacks(double sacks1){
		sacks1 = sacks;
	}
	
	double getSacks(){
		return sacks;
	}
	
	@Override
	public String toString(){
		return "Defensive Player";
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void backflip() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void smiles() {
		// TODO Auto-generated method stub
		
	}
	
 } 

