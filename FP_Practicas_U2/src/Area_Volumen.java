/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author uriel
 */
public class Area_Volumen {
    public static void main (String args[]){
        short h = 0;
        short r = 0;
        h=Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor de la altura"));
        r=Short.parseShort(JOptionPane.showInputDialog("Ingresa el valor del radio de la base"));
        double a;
        double v;
        v =Math.PI*(r*r)*(h);
        a =Math.PI*2*(r)*(h)+Math.PI*2*(r*r);  
        JOptionPane.showMessageDialog(null, " El volumen del cilindro es: " +v +"cm3");
        JOptionPane.showMessageDialog(null, " El area del cilindro es: " +a +"cm2");
    }
    
    
            
    
}
