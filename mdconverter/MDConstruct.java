package mdconverter;

import java.util.LinkedList;

import Node.Node;
/*
  ��� MDConstruct.
 Visit ��� �δ� Construct �Դϴ�.
 */

public class MDConstruct implements MDElement, Cloneable{
	int i=0;
	MDElement[] parts;
	LinkedList<Node> test = new LinkedList<Node>();
	
	public MDConstruct(){
		
	}
	public MDConstruct(Document document) {	
		// TODO Auto-generated constructor stub/
		parts = new MDElement[] {document};
	}
		
	public void accept(MDElementVisitor md){
		for(i=0;i<parts.length;i++){
			parts[i].accept(md);
		}
	}
	
}