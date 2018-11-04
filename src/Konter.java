/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Konter extends HP {
    private String Harga;
    

    public Konter(String Harga, String TipeHp, Nomor kartu) {
        super(TipeHp, kartu);
        this.Harga = Harga;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
    
    
    
}
