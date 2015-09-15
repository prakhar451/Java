import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo {
	
    public static void main(String []args) {
		
	  int length= Integer.parseInt(args[0]);
	   if(args.length!=length+1)
	   {   
		  System.out.println("error  !!!");
	   }
	   else
	   {
		    Writer writer = null;
			try {
            File file = new File("write.txt");
            writer = new BufferedWriter(new FileWriter(file));
			for(int i=1;i<=length;i++)
			{ 
				writer.write(args[i]);
				writer.write(" ");
			}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
	   }
    }
} 