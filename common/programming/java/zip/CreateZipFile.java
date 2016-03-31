// -----------------------------------------------------------------------------
// CreateZipFile.java
// -----------------------------------------------------------------------------

/*
 * =============================================================================
 * Copyright (c) 1998-2011 Jeffrey M. Hunter. All rights reserved.
 * 
 * All source code and material located at the Internet address of
 * http://www.idevelopment.info is the copyright of Jeffrey M. Hunter and
 * is protected under copyright laws of the United States. This source code may
 * not be hosted on any other site without my express, prior, written
 * permission. Application to host any of the material elsewhere can be made by
 * contacting me at jhunter@idevelopment.info.
 *
 * I have made every effort and taken great care in making sure that the source
 * code and other content included on my web site is technically accurate, but I
 * disclaim any and all responsibility for any loss, damage or destruction of
 * data or any other property which may arise from relying on it. I will in no
 * case be liable for any monetary damages arising from such loss, damage or
 * destruction.
 * 
 * As with any code, ensure to test this code in a development environment 
 * before attempting to run it in production.
 * =============================================================================
 */
 
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * -----------------------------------------------------------------------------
 * Used to provide an example of creating a zip file.
 * 
 * @version 1.0
 * @author  Jeffrey M. Hunter  (jhunter@idevelopment.info)
 * @author  http://www.idevelopment.info
 * -----------------------------------------------------------------------------
 */

public class CreateZipFile {

    private static void doCreateZipFile(String[] files) {

        String zipFileName = files[0];
        byte[] buf = new byte[1024];

        try {

            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));

            System.out.println("Archive:  " + zipFileName);

            // Compress the files
            for (int i=1; i<files.length; i++) {

                FileInputStream in = new FileInputStream(files[i]);
                System.out.println("  adding: " + files[i]);

                out.putNextEntry(new ZipEntry(files[i]));

                // Transfer bytes from the file to the ZIP file
                int len;
                while((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }

                // Complete the entry
                out.closeEntry();
                in.close();
            }

            // Complete the ZIP file
            out.close();


        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }


    /**
     * Sole entry point to the class and application.
     * @param args Array of String arguments.
     */
    public static void main(String[] args) {

        if (args.length < 2) {
            System.err.println("Usage: java CreateZipFile outputzipfilename filename1, filename2, ...");
        } else {
            doCreateZipFile(args);
        }

    }

}

