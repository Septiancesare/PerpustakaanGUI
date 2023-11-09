/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

/**
 *
 * @author acer
 */
public class peminjaman {
    framePeminjaman pinjam;
    
    public peminjaman() {
        pinjam = new framePeminjaman();
    }
    
    public void initialize()    {
        pinjam.setSize(1920, 1080);
        pinjam.setVisible(true);
    }
}
