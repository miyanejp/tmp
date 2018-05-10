package text_edit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CsvExe {

	public static void main(String[] args) {
		//ファイルの取込み
		File file = new File("/Users/takeshi/Documents/workspace/text_edit/csv/");
		File[] files = file.listFiles();

		//ファイル数ループ
		for(int i = 0; i<files.length;i++){
			//ファイル名称とファイルデータをキー、バリューで設定する。
			HashMap<String,List<String>> map = new HashMap<String,List<String>>();	
			System.out.println("ファイル名は"+files[i]);
			System.out.println("ファイル名は"+files[i].getAbsolutePath().substring((files[i].getAbsolutePath().length()-9)));
			FileReader filereader;
			try {
				filereader = new FileReader(files[i].getAbsolutePath());
				BufferedReader br = new BufferedReader(filereader);
				//バリューとなる値
				List<String> list = new ArrayList<String>();
				try {
				String line;
				while((line = br.readLine())!=null){
					String[] data = line.split(",", 0);
					for(String element:data){
						System.out.println("elementは"+element);
						list.add(element);
					}

					map.put(files[i].getAbsolutePath().substring((files[i].getAbsolutePath().length()-9)), list);
				}
				br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}

	}

}
