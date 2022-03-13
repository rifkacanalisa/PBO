import javax.swing.*;
import java.awt.*;

public class InterfaceTiga extends JFrame {
    JLabel lText = new JLabel("Makanan yang disukai:", SwingConstants.CENTER);
    JLabel lResult =  new JLabel("");

    JCheckBox cbNasgor = new JCheckBox("Nasi Goreng");
    JCheckBox cbIndomie = new JCheckBox("Indomie Goreng");
    JCheckBox cbAyam = new JCheckBox("Ayam Goreng");

    public InterfaceTiga(){
        setTitle("Event ItemStateChange");
        setLayout(new GridLayout(5,1));

        cbNasgor.setHorizontalAlignment(SwingConstants.CENTER);
        cbIndomie.setHorizontalAlignment(SwingConstants.CENTER);
        cbAyam.setHorizontalAlignment(SwingConstants.CENTER);
        lResult.setHorizontalAlignment(SwingConstants.CENTER);

        add(lText);
        add(cbNasgor);
        add(cbIndomie);
        add(cbAyam);
        add(lResult);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
