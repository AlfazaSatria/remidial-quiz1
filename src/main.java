/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class main {
    public static void main(String[] args) {
      Nomor kartu = new Nomor("081336811073","Telkomsel");
      HP hp = new HP ("iPhone 6s",kartu);
      Konter kntr = new Konter("650000",hp);
      
      System.out.println(kntr.info());
  }
    
}
