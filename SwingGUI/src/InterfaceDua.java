import javax.swing.*;
import java.awt.*;

public class InterfaceDua extends JFrame {

    JButton btnSatu = new JButton("Button Satu");
    JButton btnDua = new JButton("Button Dua");
    JButton btnTiga = new JButton("Button Tiga");
    JButton btnEmpat = new JButton("Button Empat");
    JLabel lJudul = new JLabel("Hasilnya:", SwingConstants.CENTER);
    JLabel lHasil = new JLabel("", SwingConstants.CENTER);

    public InterfaceDua(){
        setTitle("Event Handling");
        setLayout(new GridLayout(2,3));

        add(btnSatu);
        add(lJudul);
        add(btnTiga);

        add(btnDua);
        add(lHasil);
        add(btnEmpat);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
