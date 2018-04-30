package text_edit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text_edit {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("edit.txt");
		BufferedReader br = new BufferedReader(fr);
			
		String line = null;
		while((line = br.readLine()) != null){

			Pattern pt = Pattern.compile("[,\\s\t]+");
			Matcher match = pt.matcher(line);
			String result = match.replaceAll(",");

			String [] text_hairetu = result.split(",",0);
			
			for(int i = 0; i < text_hairetu.length; i++){
				System.out.println("text_hairetuは"+text_hairetu[i]);			
			}
		
		}
		br.close();	
	}

}
