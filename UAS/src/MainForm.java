import javax.swing.*;

public class MainForm {
    private JPanel rootPanel;
    private JRadioButton barang1RadioButton;
    private JRadioButton barang2RadioButton;
    private JRadioButton barang3RadioButton;
    private JTextField txtBarang2;
    private JTextField txtBarang1;
    private JTextField txtBarang3;
    private JTextField txtInput1;
    private JTextField txtInput2;
    private JTextField txtInput3;
    private JTextField txtHargaBarangDiskon1;
    private JTextField txtHargaBarangDiskon2;
    private JTextField txtHargaBarangDiskon3;
    private JTextField txtTotalHarga1;
    private JTextField txtTotalHarga2;
    private JTextField txtTotalHarga;
    private JTextField txtTotalPembayaran;
    private JTextField txtBayarSetelahDiskon;
    private JTextField txtHasilDiskon;
    private JButton buttonTotal;
    private JTextField txtBayar;
    private JTextField txtUangAkhir;
    private JButton buttonUangAkhir;
    private JButton buttonHapusSemua;
    private JButton buttonKeluar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
