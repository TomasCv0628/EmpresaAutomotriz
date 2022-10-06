package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //------------------------
    //Atributos
    //------------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbNombre;
    private JLabel lbAnnoI;
    private JLabel lbAnnoN;
    private JLabel lbValor;
    private JLabel lbHoras;
    private JTextField tfNombre;
    private JTextField tfAnnoI;
    private JTextField tfAnnoN;
    private JTextField tfValor;
    private JTextField tfHoras;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/empleado.png"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,10,150,150);
        add(lbImagen);
        
        //Creación y adición de etiquetas Color, PosX y PosY
        lbNombre = new JLabel("Nombre = ");
        lbNombre.setBounds(170,10,100,20);
        add(lbNombre);
        
        lbAnnoI = new JLabel("Año de Ingreso = ");
        lbAnnoI.setBounds(170,40,130,20);
        add(lbAnnoI);
        
        lbAnnoN = new JLabel("Edad ");
        lbAnnoN.setBounds(170,70,130,20);
        add(lbAnnoN);
        
        lbValor = new JLabel("Valor por hora");
        lbValor.setBounds(170,100,130,20);
        add(lbValor);

        lbHoras = new JLabel("Horas de trabajo = ");
        lbHoras.setBounds(170,130,130,20);
        add(lbHoras);
        
        //Creación y adición de campos de texto
        tfNombre = new JTextField();
        tfNombre.setBounds(300, 10, 60, 20);
        this.add(tfNombre);
        
        tfAnnoI = new JTextField();
        tfAnnoI.setBounds(300, 40, 60, 20);
        this.add(tfAnnoI);
        
        tfAnnoN = new JTextField();
        tfAnnoN.setBounds(300, 70, 60, 20);
        this.add(tfAnnoN);
        
        tfValor = new JTextField();
        tfValor.setBounds(300, 100, 60, 20);
        this.add(tfValor);

        tfHoras = new JTextField();
        tfHoras.setBounds(300, 130, 60, 20);
        this.add(tfHoras);
        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNombre()
    {
        return tfNombre.getText();
    }
    
    public String getAnnoI()
    {
        return tfAnnoI.getText();
    }
    
    public String getAnnoN()
    {
        return tfAnnoN.getText();
    }
    public String getValor()
    {
        return tfValor.getText();
    }
    public String getHoras()
    {
        return tfHoras.getText();
    }
    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNombre.setText("");
        tfAnnoI.setText("");
        tfAnnoN.setText("");
        tfHoras.setText("");
        tfValor.setText("");
    }
}