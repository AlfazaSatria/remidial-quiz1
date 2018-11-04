/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class Nomor {
    private String Nomor;
    private String Operator;
    
    public Nomor(){
        
    }

    public Nomor(String Nomor, String Operator) {
        this.Nomor = Nomor;
        this.Operator = Operator;
    }

    public String getNomor() {
        return Nomor;
    }

    public void setNomor(String Nomor) {
        this.Nomor = Nomor;
    }

    public String getOperator() {
        return Operator;
    }

    public void setOperator(String Operator) {
        this.Operator = Operator;
    }
    
    public String Info(){
        String info = "";
        System.out.println("Nomor   :"+this.Nomor+"\n");
        System.out.println("Nomor   :"+this.Operator+"\n");
        return info;
    }
}
