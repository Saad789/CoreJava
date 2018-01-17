import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
	 String PathName = "Resources";
	 File f = new File(PathName);
	 
	 boolean b = f.mkdir();
	 if(b){
		   System.out.println("directory has been created");
	       String path = f.getAbsolutePath();
		   path = path + "/" + "file1.text";
		   System.out.println(path);
		   File newFile = new File(path);
		   if(newFile.createNewFile()){
			   System.out.println("File is created please check it");
		       }
		   else{
			   System.out.println("File already exists");
			   }
	         } 
	       else{
				System.out.println("Directory already exists");
			   }
	   }
	}


