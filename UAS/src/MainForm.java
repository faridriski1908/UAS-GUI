import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public MainForm() {

        buttonTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtInput1.getText().isEmpty() || txtInput2.getText().isEmpty() || txtInput3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Masukkan jumlah barang tidak boleh kosong", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        buttonHapusSemua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtInput1.setText("");
                txtInput2.setText("");
                txtInput3.setText("");
                txtBayar.setText("");
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
