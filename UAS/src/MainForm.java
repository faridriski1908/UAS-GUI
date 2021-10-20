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
    private JTextField txtTotalHarga3;
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
        double hargabarang1 = 25000;
        double hargabarang2 = 50000;
        double hargabarang3 = 75000;
        double inputbarang1 = 0;
        double inputbarang2 = 0;
        double inputbarang3 = 0;

        buttonTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double diskon = 0.01, hargadiskon, hargatotal;
                double input1, input2, input3;
                input1 = Double.parseDouble(txtInput1.getText());
                input2 = Double.parseDouble(txtInput2.getText());
                input3 = Double.parseDouble(txtInput3.getText());

                if (input1 >=50){
                    hargatotal = hargabarang1 * input1 - diskon;
                    hargadiskon = hargabarang1 * diskon;

                    txtHargaBarangDiskon1.setText(String.valueOf(hargadiskon));
                    txtTotalHarga1.setText(String.valueOf(hargatotal));
                } else {
                    hargatotal = hargabarang1 * input1;
                    txtTotalHarga1.setText(String.valueOf(hargatotal));
                }

                if (input2 >=50){
                    hargatotal = hargabarang2 * input2 - diskon;
                    hargadiskon = hargabarang2 * diskon;

                    txtHargaBarangDiskon2.setText(String.valueOf(hargadiskon));
                    txtTotalHarga2.setText(String.valueOf(hargatotal));
                } else {
                    hargatotal = hargabarang2 * input2;
                    txtTotalHarga2.setText(String.valueOf(hargatotal));
                }

                if (input3 >=50){
                    hargatotal = hargabarang3 * input3 - diskon;
                    hargadiskon = hargabarang3 * diskon;

                    txtHargaBarangDiskon3.setText(String.valueOf(hargadiskon));
                    txtTotalHarga3.setText(String.valueOf(hargatotal));
                } else {
                    hargatotal = hargabarang3 * inputbarang3;
                    txtTotalHarga3.setText(String.valueOf(hargatotal));
                }
            }
        });

        if (barang1RadioButton.isSelected()){
            txtBarang1.setText("25000");
        } else {
            txtBarang1.setText("0");
            txtInput1.setText(String.valueOf(inputbarang1));
        }


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

        buttonKeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        barang1RadioButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (barang1RadioButton.isSelected()){
                    txtBarang1.setText("25000");
                } else {
                    txtBarang1.setText("0");
                    txtInput1.setText(String.valueOf(inputbarang1));
                }
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
