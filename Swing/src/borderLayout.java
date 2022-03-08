import javax.swing.*;
import java.awt.*;

public class borderLayout extends JFrame {
    JButton btnSatu = new JButton("Button Satu");
    JButton btnDua = new JButton("Button Dua");
    JButton btnTiga = new JButton("Button Tiga");
    JButton btnEmpat = new JButton("Button Empat");
    JLabel lGambar = new JLabel(new ImageIcon(getClass().getResource(("icon/gambar1.jpg"))));

    public borderLayout(){
        setTitle("Border Layout");
        setLayout(new BorderLayout());

        add(btnSatu, "North");
        add(btnDua, "East");
        add(btnTiga, "South");
        add(btnEmpat, "West");
        add(lGambar, "Center");

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
