package Complex_Calculator;
import javax.swing.*;
import java.awt.*;

public class UIComplejos extends JFrame {

    private JPanel panel;



    public UIComplejos(){
      setSize(800,500);
      setTitle("Complejos");
      initComponents();
      setLocationRelativeTo(null);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setVisible(true);
    }

    public void initComponents(){
        initPanels();
        initLabels();
    }

    public void initPanels(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void initLabels() {
        JLabel etiqueta1 = new JLabel("Complejo 1");
        etiqueta1.setBounds(140,35,200,30);
        etiqueta1.setFont(new Font("Arial Rounded MT Bold",0,18));
        panel.add(etiqueta1);
        JLabel etiqueta2 = new JLabel("Complejo 2");
        etiqueta2.setBounds(470,35,200,30);
        etiqueta2.setFont(new Font("Arial Rounded MT Bold",0,18));
        panel.add(etiqueta2);

        JLabel etiqueta4 = new JLabel("real: ");
        etiqueta4.setBounds(55,90,200,30);
        etiqueta4.setFont(new Font("consolas",0,18));
        panel.add(etiqueta4);

        JLabel etiqueta3 = new JLabel("real: ");
        etiqueta3.setBounds(400,90,200,30);
        etiqueta3.setFont(new Font("consolas", 0,18));
        panel.add(etiqueta3);

        JLabel etiqueta5 = new JLabel("imaginario: ");
        etiqueta5.setBounds(180,90,200,30);
        etiqueta5.setFont(new Font("consolas",0,18));
        panel.add(etiqueta5);

        JLabel etiqueta6 = new JLabel("imaginario: ");
        etiqueta6.setBounds(510,90,200,30);
        etiqueta6.setFont(new Font("consolas", 0,18));
        panel.add(etiqueta6);

    }

    public void initJTextField(){

    }
}
