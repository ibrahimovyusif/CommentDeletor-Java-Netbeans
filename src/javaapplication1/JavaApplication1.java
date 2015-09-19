package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
public class JavaApplication1 {
      
  public static void main(String[] args) {
  // TODO Auto-generated method stub
  BufferedReader br = null;
  Writer writer = null;
  String[] file = null;
  String inputPath, outputPath;
 
  inputPath = args[0]; 
  outputPath = args[1];
  
  try 
  {
    String sCurrentLine;
    String REGEX = "\\/\\*.*\\*\\/";
    
    File inputFile = new File(inputPath);
    br = new BufferedReader(new FileReader(inputFile));
    
    File outputFile = new File(outputPath);
    outputFile.createNewFile(); 
			 
    writer = new BufferedWriter(new OutputStreamWriter(
      new FileOutputStream(outputFile), "utf-8"));

    while ((sCurrentLine = br.readLine()) != null) 
    {
<<<<<<< HEAD
      String REPLACE = "momo";
=======
      String REPLACE = "koko";
>>>>>>> fe4d6c0c10a68f6a96a99984f8f69855a9d90451

      Pattern p = Pattern.compile(REGEX);
      // get a matcher object
      Matcher m = p.matcher(sCurrentLine); 
      sCurrentLine = m.replaceAll(REPLACE);
      //System.out.println(sCurrentLine);
      
    
      writer.write(sCurrentLine + "\n");
    } 

  } catch (IOException e) 
    {
      e.printStackTrace();
    } 
    finally 
    {
     
    try 
    {
      writer.close();
      if (br != null)br.close();
    } catch (IOException ex) 
      {
	ex.printStackTrace();
      }
    }
  }	
}
