import javax.swing.*;
import java.awt.event.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

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

//    public int barang1(int harga1){
//        int harga1 = 25.000;
//    }

    public MainForm() {
        int harga1 = 25000;
        int harga2 = 50000;
        int harga3 = 75000;

        buttonHapusSemua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInput1.setText("");
                txtInput2.setText("");
                txtInput3.setText("");
                txtBayar.setText("");
            }
        });
        barang1RadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtBarang1.setText(Integer.toString(harga1));
            }
        });
        barang2RadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtBarang2.setText(Integer.toString(harga2));
            }
        });
        barang3RadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtBarang3.setText(Integer.toString(harga3));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().rootPanel);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
