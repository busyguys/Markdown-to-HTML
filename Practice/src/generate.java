import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

/*
 Call Generate 하는 클래스입니다.
 나중에 콘솔이랑 합칠 때,
 파서 사이에 꽂아서 돌리면 될 것 같아요!!
 파서: Document -> Node (generate)-> Token (generate)
 이렇게 돌리면 될 것 같습니다.
 */

public class generate{

	public static void main(String[] args){
	
	System.out.println("Call Generator\n");
	try{
		FileWriter w_file = new FileWriter("test.html");
		w_file.write("<html>\n");
		w_file.write("<body>\n");
		w_file.close();
		
		MDElement c = new MDConstruct();
		c.accept(new generator());
		
		FileWriter w_file2 = new FileWriter("test.html",true);
		w_file2.write("</body>\n");
		w_file2.write("</html>\n");
		w_file2.close();
		
		w_file.close();
	}catch(IOException e){
		e.printStackTrace();
	}
		
	}

}
