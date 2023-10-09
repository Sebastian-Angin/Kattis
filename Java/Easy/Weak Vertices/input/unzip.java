package input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * input
 */
public class unzip
{
    String zipFileName = "input/weakvertices.zip";
    String currentDir = "input/";
    String fileExtension = ".in";

    public void test ()
    {
        Unzip();
    }

    private void Unzip()
    {
        File destDir = new File(currentDir);
        Boolean containsExtension = false;
        
        System.out.println("Starting Unziping");

        try
        {
            
            File[] checkFiles = destDir.listFiles();
            System.out.println("Checking if already unziped");
            if (checkFiles != null)
            {
                for (File file : checkFiles)
                {
                    if (file.isFile() && file.getName().endsWith(fileExtension))
                    {
                        containsExtension = true;
                        break;
                    }
                }
            }

            if (!containsExtension)
            {
                System.out.println("Creating streams");
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFileName));
                ZipEntry entry;
                System.out.println("Entering while loop");
                while ((entry = zipInputStream.getNextEntry()) != null)
                {
                    System.out.println("Starting Unziping");
                    String entryFileName = entry.getName();
                    File outputFile = new File(destDir, entryFileName);
                    System.out.println("Unzipping to "+outputFile.getAbsolutePath());

                    new File(outputFile.getParent()).mkdir();

                    FileOutputStream outputStream = new FileOutputStream(outputFile);
                    byte[] buffer = new byte[1024];
                    int bytesRead;

                    while ((bytesRead = zipInputStream.read(buffer)) != -1)
                    {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                    outputStream.close();

                }
                zipInputStream.close();
            }
            else 
            {
                System.out.println("Zip file has already been unziped");
            }
           
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
