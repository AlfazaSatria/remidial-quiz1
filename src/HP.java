/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class HP extends Nomor{
    private String TipeHp;
    private Nomor kartu;

    public HP(String TipeHp, Nomor kartu) {
        this.TipeHp = TipeHp;
        this.kartu = kartu;
    }

    public String getTipeHp() {
        return TipeHp;
    }

    public void setTipeHp(String TipeHp) {
        this.TipeHp = TipeHp;
    }
    
    
    
}
