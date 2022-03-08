import javax.swing.*;
import java.awt.*;

public class gridLayout extends JFrame {
    JButton btnSatu = new JButton("Button Satu");
    JButton btnDua = new JButton("Button Dua");
    JButton btnTiga = new JButton("Button Tiga");
    JButton btnEmpat = new JButton("Button Empat");
    JLabel lGambar = new JLabel(new ImageIcon(getClass().getResource(("icon/gambar1.jpg"))));

    public gridLayout(){
        setTitle("Grid Layout");

        setLayout(new GridLayout(4,1));

        add(btnSatu);
        add(btnDua);
        add(btnTiga);
        add(btnEmpat);
//        add(lGambar);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
