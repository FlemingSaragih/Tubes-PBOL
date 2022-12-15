/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Origami;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author User
 */
public class gami3 implements gami {
     @Override
    public void insert(gami1 Origami) {
        gami2.listorigami.add(Origami);
        JOptionPane.showMessageDialog(null, "Data Pengguna Baru tersimpan!");
    }
    @Override
    public void update(int index, gami1 Origami) {
        gami2.listorigami.set(index, Origami);
        JOptionPane.showMessageDialog(null, "Data Pengguna Berahasil diubah1");
    }
    @Override
    public void delete(int index) {
        gami2.listorigami.remove(index);
        JOptionPane.showMessageDialog(null, "Data Pengguna Berhasil dihapus!");
    }
    @Override
    public DefaultTableModel view() {
        String[] kolom = { "Nama", "No HP", "Dosen", "Jenis Kelamin", "Status", "Kelas", "Tatap Muka 1 Kali", "Pilihan Tatap Muka", "Instruktur", "Hari", "Waktu", "Total" };
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (gami1 a : gami2.listorigami) {
            Object[] o = new Object[12];
            double total = 0, tp, jumlah;
            o[0] = a.getnama();
            o[1] = a.gethp();
            o[2] = a.getdosen();
            o[3] = a.getjk();
            o[4] = a.getstatus();
            o[5] = a.getkelas();
            o[6] = a.gettp();
            tp = a.gettp();
            o[7] = a.getjumlah();
            jumlah = a.getjumlah();
            total = tp*jumlah;
            o[8] = a.getinstruktur();
            o[9] = a.gethari();
            o[10] = a.getwaktu();
            o[11] = total;
            dtm.addRow(o);
        }
        return dtm;
    }
}
