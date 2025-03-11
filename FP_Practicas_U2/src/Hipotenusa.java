/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
public class Hipotenusa {
    public static void main (String args[]){
        short cat1= 0 ; 
        short cat2= 0 ;
        cat1=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del primer cateto"));
        cat2=Short.parseShort(JOptionPane.showInputDialog("Ingrese el valor del segundo cateto"));
        double hip;
        hip=Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2,2));
        JOptionPane.showMessageDialog(null, hip+" Es la medida de la hipotenusa");
        
        
    }
    
            
}
