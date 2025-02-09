package File_20241024;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FILE_READ_PRINT_DATA_USING_WHILE {
	public static void main(String args[]) throws IOException
	{
		String filepath="C:\\Users\\PAYAL JAIN\\eclipse-workspace\\File\\FILE_READ_PRINT_DATA_USING_WHILE_FILE";
	    File file=new File(filepath);
	    FileReader filereader=new FileReader(file); 
	    BufferedReader br=new BufferedReader(filereader);
	    String s;
	    while((s=br.readLine()) != null)
	    {
	    	System.out.println(s);
	    }
	}
}
