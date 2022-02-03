package state;

public enum MotorState {
	
	IDLE("idle"), UP("up"), DOWN("down");
	
	private String state;

	MotorState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return this.state;
	}
	
}