public class Node implements MDElement{

	public String getString(){

		return "Node Practice";

		}


	public void accept(MDElementVisitor mdelementVisitor){
		mdelementVisitor.visit(this);
		}



}