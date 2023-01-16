/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package work.startup;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;

/**
 *
 * @author DJR
 */
public class WorkStartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, URISyntaxException {
        // TODO code application logic here
        String line, pidInfo = "";
        //System Process, using TaskManager
        Process p =Runtime.getRuntime().exec(System.getenv("windir") +"\\system32\\"+"tasklist.exe");
        //Reading the processes of the system
        BufferedReader input =  new BufferedReader(new InputStreamReader(p.getInputStream()));
        //reading info line by painfull line
        while ((line = input.readLine()) != null) {
            pidInfo+=line; 
        }
        //Start Up JOptionPane incase I clicked the wrong one
        if (JOptionPane.showConfirmDialog(null, "Start Up DoingThisForReasons?", "WARNING",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            // yes option 
            //Chrome - DTFR
            Desktop.getDesktop().open(new File("C:\\Users\\User Name\\location of Shortcut\\Name of chrome link.lnk"));
            //My two links that I open up using this on chrome
            java.awt.Desktop.getDesktop().browse(new java.net.URI("https://studio.youtube.com/channel/UCFnmuJ7D9BkwmG1ntigKKAw/videos/upload?filter=%5B%5D&sort=%7B%22columnType%22%3A%22date%22%2C%22sortOrder%22%3A%22DESCENDING%22%7D"));
            java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.tiktok.com/@doingthisforreasons"));
            //java.awt.Desktop.getDesktop().browse(new java.net.URI(""));
            //OBS
            //check if program is running
            if(!pidInfo.contains("obs64.exe"))
            {
                //using desktop to start up a program
                //new file to turn location string into file
                Desktop.getDesktop().open(new File("C:\\Users\\UserNmae\\location of OBS shortcut\\OBS Studio.lnk"));
            }
            //Netbeans
            if(!pidInfo.contains("netbeans.exe"))
            {
                Desktop.getDesktop().open(new File("C:\\Program Files\\NetBeans-13\\netbeans\\bin\\netbeans.exe"));
            }
            //Taskmanger
            if(!pidInfo.contains("Taskmgr.exe"))
            {
                Desktop.getDesktop().open(new File("C:\\Windows\\System32\\Taskmgr.exe"));
            }
            //FIles, videos, recordings
            //opening file location in file explorer
            Desktop.getDesktop().open(new File("C:\\Users\\file explora location"));
        } 
        else {
//             no option
        }
       
    }
    
}
