/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Konter  {
    private String Harga;
    private HP hp;

    public Konter(String Harga, HP hp) {
        this.Harga = Harga;
        this.hp = hp;
    }

    public String getHarga() {
        return Harga;
    }

    public void setHarga(String Harga) {
        this.Harga = Harga;
    }
    
    public String info(){
        String info = "";
        System.out.println("Harga  :"+this.Harga+ "\n");
        hp.info();
        return info;
    }
    
    
}
