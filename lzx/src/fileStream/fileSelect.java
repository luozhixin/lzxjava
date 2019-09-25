package fileStream;

import java.io.File;
import java.net.URISyntaxException;


public class fileSelect {

	public static void main(String[] args) throws URISyntaxException {
		System.out.println("--------------------------------------------");
		listFile("C:/", "cmd.exe");	
	}
	//在路径path下面搜索文件名叫做name的文件，并打印全路径
	public static void listFile(String path,String name){
		File f = new File(path);
		if(f.isDirectory()){
			String[] ss = f.list();
			if(ss != null){
				for (String str : ss) {
					String path1 = f.getAbsolutePath()+File.separator+str;
					listFile(path1, name);
				}
			}
		}else{
			if(f.getName().equalsIgnoreCase(name)){
				System.out.println(f.getAbsolutePath());
			}
		}
	}
}
