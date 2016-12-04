package mdconverter;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import Node.Node;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Iterator;

/*
 �갡 ��¥ ���� generator �Դϴ�.
 visitor pattern���� node�� token���� �� �湮�ؼ�
 String return �ϴ� ���α׷��̰�, �� html ���� ���� ���°ɷ� �۾��߽��ϴ�.
 */
public class generator implements MDElementVisitor{

//String filename = new option_input.filename();
	//��� ���߿� CLI���� input file üũ�ؼ� method�� return �ϴ� �� �޾Ƽ� �޾� ������ ��������ϴ�.

	public void visit(Document doc){
		String a;
		System.out.println("In VIsitor"+doc.generate());
		a=doc.generate().substring(1,doc.generate().length()-1);
		try{
		FileWriter w_file = new FileWriter("Practice.html",true);
		w_file.write(a);
		w_file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
//		System.out.println(doc.convert());
	//	LinkedList<Node> test = new LinkedList<Node>();
	//	test = doc.getNodes();
	//	System.out.println(doc.generate());
		//System.out.println(test.get(0));
		}
	public void visit(Mconvert con){
//		System.out.println("In Mconvert: "+con.generate());
	}

	/*
	public void visit(Node node){
		
		node.generate();
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write("<h1>"+node.generate()+"</h1>"+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(node.generate());
		
		}
	public void visit(Token token){
		token.generate();
		try{
			FileWriter m_writer = new FileWriter("test.html",true);
			m_writer.write("<marquee>" + "<p>" + "<font color = 'cyun'>" 
							+token.generate()+"</font></p>"+"</marquee>"+"\n");
			m_writer.close();
		}catch(IOException e){
				e.printStackTrace();
			}
		System.out.println(token.generate());
		}*/
	
	/*
	-------------Node Case-------------
	public void visit(Inline_Img image){
		image.generate();

		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(image.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(image.generate());
		
	}
	
	public void visit(Ref_Img Ref){
		Ref.generate();
	
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(Ref.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(Ref.generate());
		
	}
	
	public void visit(Link_Addr Link){
		Link.generate();
	
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(Link.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(Link.generate());
		
	}
	
	public void visit(Hr hr){
		hr.generate();
	
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(hr.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(hr.generate());
		
	}
	
	public void visit(Header header){
		header.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(header.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(header.generate());
	
	}
	
	public void visit(HTML_Block block){
		block.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(block.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(block.generate());
	
	}
	
	public void visit(Paragraph paragraph){
		paragraph.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(paragraph.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(paragraph.generate());
	
	}
	
	public void visit(Quoted_Block qb){
		qb.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(qb.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(qb.generate());
	
	}
	
	public void visit(Unord_List UL){
		UL.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(UL.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(UL.generate());
	
	}
	
	public void visit(Ord_List OL){
		OL.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(OL.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(OL.generate());
	
	}
	*/

	/*
	----------Token Case-------------
	public void visit(PlainText PT){
		PT.generate();
	
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(PT.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(PT.generate());
	
	}
	
	public void visit(Escape escape){
		escape.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(escape.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(escape.generate());
	
	}
	
	public void visit(SpecialChar SC){
		SC.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(SC.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(SC.generate());
	
	}
	
	public void visit(Emp emp){
		emp.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(emp.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(emp.generate());
	
	}
	
	public void visit(HtmlCode HC){
		HC.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(HC.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(HC.generate());
	
	}
	
	public void visit(Code cd){
		cd.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(cd.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(cd.generate());
	
	}
	
	public void visit(Auto at){
		at.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(at.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(at.generate());
	
	}
	
	public void visit(Inline il){
		il.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(il.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(il.generate());
	
	}
	
	public void visit(Ref rf){
		rf.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(rf.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(rf.generate());
	
	}
	
	public void visit(Implicit it){
		it.generate();
		
		try{
		FileWriter m_writer = new FileWriter("test.html",true);
		m_writer.write(it.generate()+"<hr/>"+"\n");
		m_writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		System.out.println(it.generate());
	
	}
	*/

	
	public void visit(MDConstruct md){
		
	}
	@Override

	public void visit(Node_practice node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Token_practice token) {
		// TODO Auto-generated method stub
		
	}
}