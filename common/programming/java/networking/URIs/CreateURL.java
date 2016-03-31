// -----------------------------------------------------------------------------
// CreateURL.java
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
 
import java.net.*;

/**
 * -----------------------------------------------------------------------------
 * This class provides several examples of creating a URL object.
 * 
 * @version 1.0
 * @author  Jeffrey M. Hunter  (jhunter@idevelopment.info)
 * @author  http://www.idevelopment.info
 * -----------------------------------------------------------------------------
 */

public class CreateURL {


    public static void main(String[] args) {

        URL url = null;
        
        try {

            // Create a URL object with separate components
            url = new URL("http", "www.idevelopment.info", 80, "index.shtml");
            System.out.println("Component Example   : " + url);

            // Create a URL object with a single string
            url = new URL("http://www.idevelopment.info:80/index.shtml");
            System.out.println("Full String Example : " + url);
            
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }

}
