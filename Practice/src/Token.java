public class Token implements MDElement{

	public String getString(){

	String token1 = "Token Practice";
	
	return token1;
	}

	public void accept(MDElementVisitor mdelementVisitor){
		mdelementVisitor.visit(this);
		}

}