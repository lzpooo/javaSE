package ch13;



public enum Rbg {
	RED("red"),BLUE("blue"),GREEN("green");
	private String colorName;
	private Rbg(String colorName){
		this.colorName=colorName;
		
	}
//	public void setColorName(String colorName) {
//		this.colorName = colorName;
//	}
//	public String getColorName() {
//		return colorName;
//	}
	public String getName(){
		return colorName;
	}
	
	public static void main(String[] args) {
		System.out.println(Rbg.RED.getName());
		System.out.println(Rbg.BLUE.getName());
		System.out.println(Rbg.GREEN.getName());
	}
}
