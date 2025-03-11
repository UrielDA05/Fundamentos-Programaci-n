
import javax.swing.JOptionPane;
public class ValoresABC {
    public static void main (String args[]){
        short A;
        short B;
        short C;
        A=Short.parseShort(JOptionPane.showInputDialog(" Ingresa el primer valor"));
        B=Short.parseShort(JOptionPane.showInputDialog(" Ingresa el segundo valor"));
        C=Short.parseShort(JOptionPane.showInputDialog(" Ingresa el tercer valor"));
        if (A==B || B==C || C==A) {
            JOptionPane.showMessageDialog(null,"Algunos valores son iguales");
        } else {
            if (A>B & A>C){
                JOptionPane.showMessageDialog(null, A+" Es el mayor");
            }else if (B>A & B>C){
                JOptionPane.showMessageDialog(null, B+" Es el mayor");
                }else{
                    JOptionPane.showMessageDialog(null, C+" Es el mayor");
        }
                
        if (A<B & A<C){
            JOptionPane.showMessageDialog(null, A+" Es el menor");
        }else if (B<A & B<C){
                JOptionPane.showMessageDialog(null, B+" Es el menor");
            }else{
                JOptionPane.showMessageDialog(null, C+" Es el menor");     
                
        }
        }
    }
}


        
          
    
    

        