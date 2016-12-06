package mdconverter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.w3c.tidy.Tidy;

/*
 �갡 ��¥ ���� generator �Դϴ�.
 visitor pattern���� node�� token���� �� �湮�ؼ�
 String return �ϴ� ���α׷��̰�, �� html ���� ���� ���°ɷ� �۾��߽��ϴ�.
 */
public class generator implements MDElementVisitor{

//String filename = new option_input.filename();
	//��� ���߿� CLI���� input file üũ�ؼ� method�� return �ϴ� �� �޾Ƽ� �޾� ������ ��������ϴ�.
	private String b;
	
	public void visit(Document doc){
		String a;

		a = "<!DOCTYPE html PUBLIC \"-//IETF//DTD HTML 2.0//EN\">";
		a += "<head><title> MDConverter </title></head>";
		a += "<html>\n"+"<body>\n"+doc.generate()+"</body>\n"+"</html>";//Generator
		b= doc.getOutputFile();//Output file's name

		
		if(validateHTML(a))
			try{
				FileWriter w_file = new FileWriter(b);
				
				System.out.println("\n" + a);
				w_file.write(a);		
				w_file.close();
		
			}catch(IOException e){
				e.printStackTrace();
			}
		else 
			System.err.println("Not a valid HTML");
	}	
	
	public void visit(MDConstruct md){
		
	}

	private boolean validateHTML(String s){
		InputStream in = new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
		
		Tidy tidy = new Tidy();
		tidy.setForceOutput(true);
		
		//ignore output
		tidy.parse(in, new ByteArrayOutputStream());
		tidy.setQuiet(true);
		
		System.out.println("\nerrors "+tidy.getParseErrors());
	    System.out.println("warnings "+tidy.getParseWarnings());
	   
	    return (tidy.getParseErrors() == 0 && tidy.getParseWarnings()-2 == 0);
	}
}