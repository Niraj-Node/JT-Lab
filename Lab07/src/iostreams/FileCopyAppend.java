package iostreams;
import java.io.*;

public class FileCopyAppend {

	public static void main(String[] args) throws IOException 
	{
		String opr = args[0];
		String source = "./resources/" + args[1];
		String destination = "./resources/" + args[2];
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try 
		{
			in = new FileInputStream(source);
			switch(opr)
			{
				case "copy" :
					out = new FileOutputStream(destination);
				case "append" :
					out = new FileOutputStream(destination, true);
				default :
					out = new FileOutputStream(destination, true);
			}
			
			int c;
			while( (c=in.read()) != -1 )
			{
				out.write(c);
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally 
		{
			if(in != null) 
			{
				in.close();
			}
			if(out != null) 
			{
				out.close();
			}
		}
	}
}
