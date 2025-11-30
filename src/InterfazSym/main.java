/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InterfazSym;
import javax.swing.UIManager;
import com.formdev.flatlaf.intellijthemes.FlatGradiantoDeepOceanIJTheme;
import java.awt.Font;

public class main {

    public static void main(String[] args) {
       
        try {
            // Activar el tema FlatLaf Dark
            UIManager.setLookAndFeel(new FlatGradiantoDeepOceanIJTheme());
            UIManager.put("defaultFont", new Font("Bahnschrift", Font.PLAIN, 14));
            
            //Obtener Ids actualizados
            Datos.cargarIds();
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new InicioPrinci().setVisible(true);
        });
    };
    
    
}
