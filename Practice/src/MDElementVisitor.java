//Visitor for Node & Token
public interface MDElementVisitor{

	public void visit(Node node);
	public void visit(Token token);
	public void visit(MDConstruct mdConstruct);

}
