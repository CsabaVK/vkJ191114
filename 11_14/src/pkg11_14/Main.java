/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_14;
import java.util.*;
import java.io.*;


/**
 *
 * @author garaguly.csaba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> magyar = new ArrayList<>();
        ArrayList<String> angol = new ArrayList<>();
        
        ArrayList<String> valasz = new ArrayList<>();
        
        try 
        {
            FileReader file = new FileReader("szotar.txt");
            BufferedReader br = new BufferedReader(file);
        
            String sor = null;
            while ((sor = br.readLine()) != null)
            {
                angol.add(sor);
                sor = br.readLine();
                magyar.add(sor);
            }
        } 
        catch (Exception e) 
        {
            System.out.println("hiba " + e);
        }
        
        Scanner be = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println(angol.get(i) + ":");
            valasz.add(be.next());
        }
        
        
        
        
        
        
    }
    
}
