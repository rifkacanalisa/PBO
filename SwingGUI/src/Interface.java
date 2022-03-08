import javax.swing.*;

public class Interface extends JFrame {

    JLabel lJudul = new JLabel("Pendataan Mahasiswa");
    JLabel lNama = new JLabel("Nama:");
    JLabel lNIM = new JLabel("NIM:");
    JLabel lJekel = new JLabel("Jenis Kelamin:");
    JLabel lAgama = new JLabel("Agama:");
    JLabel lHobi = new JLabel("Hobi:");

    JTextField tfNama = new JTextField();
    JTextField tfNIM = new JTextField();

    JRadioButton rbMan = new JRadioButton("Laki-laki");
    JRadioButton rbWoman = new JRadioButton("Perempuan");

    String[] daftarAgama = {"Islam", "Kristen", "Katholik", "Hindu", "Budha", "Konghucu"};
    JComboBox cmAgama = new JComboBox(daftarAgama);

    JCheckBox cbBasket = new JCheckBox("Basket");
    JCheckBox cbGame = new JCheckBox("Gaming");
    JCheckBox cbMusic =  new JCheckBox("Music");

    JButton btnSave = new JButton("Simpan");

    public Interface(){
        setTitle("Biodata Mahasiswa");
        setSize(400, 280);
        setLayout(null);

        add(lJudul);
        add(lNama);
        add(lNIM);
        add(lJekel);
        add(lAgama);
        add(lHobi);

        add(tfNama);
        add(tfNIM);
        add(rbMan);
        add(rbWoman);
        add(cmAgama);
        add(cbBasket);
        add(cbGame);
        add(cbMusic);
        add(btnSave);

        lJudul.setBounds(125,10,200,20);

        lNama.setBounds(20, 40, 100, 20);
        tfNama.setBounds(130, 40, 100, 20);

        lNIM.setBounds(20,70,100,20);
        tfNIM.setBounds(130,70,100,20);

        lJekel.setBounds(20,100,100,20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMan);
        bg.add(rbWoman);
        rbMan.setBounds(130,100,100,20);
        rbWoman.setBounds(240,100,100,20);

        lAgama.setBounds(20,130,100,20);
        cmAgama.setBounds(130,130,100,20);

        lHobi.setBounds(20,160,100,20);
        cbBasket.setBounds(130,160,70,20);
        cbGame.setBounds(210,160,70,20);
        cbMusic.setBounds(290,160,70,20);

        btnSave.setBounds(125,200,125,20);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
