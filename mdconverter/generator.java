package mdconverter;

import java.io.FileWriter;
import java.io.IOException;

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
		
		a=doc.generate();
		
		try{
			FileWriter w_file = new FileWriter("Practice.html",true);
			w_file.write(a);
			w_file.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void visit(MDConstruct md){
		
	}

	@Override
	public void visit(Mconvert con) {
		
	}
}