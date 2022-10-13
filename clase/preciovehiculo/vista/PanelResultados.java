package vista;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel
{

    private static JTextArea taResultado;
    private JScrollPane spResultado;

    public PanelResultados()
    {
        setLayout(null);
        setBackground(Color.WHITE);
        
        taResultado = new JTextArea();
        spResultado = new JScrollPane(taResultado);
        spResultado.setBounds(10,20, 360, 210);
        add(spResultado);
       
        TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    public void borrar()
    {
        taResultado.setText("");
    }
    
    public static void mostrarResultado(String salario)
    {
        
        taResultado.append(salario);

        
    }
}
