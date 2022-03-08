import javax.swing.*;
import java.awt.*;

public class flowLayout extends JFrame {
    JButton btnSatu = new JButton("Button Satu");
    JButton btnDua = new JButton("Button Dua");
    JButton btnTiga = new JButton("Button Tiga");
    JButton btnEmpat = new JButton("Button Empat");
    JLabel lGambar = new JLabel(new ImageIcon(getClass().getResource(("icon/gambar1.jpg"))));

    public flowLayout(){
        setTitle("Flow Layout");
        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(btnSatu);
        add(btnDua);
        add(btnTiga);
        add(btnEmpat);
        add(lGambar);

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
