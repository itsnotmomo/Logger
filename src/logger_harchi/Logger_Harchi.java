/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logger_harchi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author harch
 */
public class Logger_Harchi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Write your name and your age please!: ");
        Scanner ca = new Scanner(System.in);
        String name = ca.next();
        int age = ca.nextInt();
        System.out.print("Do you want to add anything else?  ");
        Scanner no = new Scanner(System.in);
        String nota = no.nextLine();
        try {
            FileWriter xu = new FileWriter("data/log.txt");
            xu.write("Your name is : " + name);
            xu.write("\n");
            xu.write("You are : " + age);
            xu.write("\n");
            xu.write("Here's what you have to say :" + nota);
            xu.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(Logger.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
