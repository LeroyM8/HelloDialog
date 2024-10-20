/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellonamedialog;

/**
 *
 * @author leroy
 */
import javax.swing.JOptionPane;

public class HelloNameDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String name, address, suburb, city;

        name = JOptionPane.showInputDialog(null, "Enter your name: ");
        address = JOptionPane.showInputDialog(null, "Enter your address: ");
        suburb = JOptionPane.showInputDialog(null, "what is your suburb: ");
        city = JOptionPane.showInputDialog(null, "what is your city: ");

        JOptionPane.showMessageDialog(null, "Hello " + name  + " from " + address + suburb + " " + city );
    } 

}
