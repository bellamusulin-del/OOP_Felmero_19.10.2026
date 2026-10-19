package com.oop_felmero;

class UrZokni {
    private String azonosito; //2.We changed azonosito from public to private String 
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        //3.the constructor cannot accept a negative number 
        if(tisztasagPont<0 || tisztasagPont==null){
            throw IllegalArgumentException("tisztasagPont nem lehet negatív");
        }
        this.azonosito = azonosito;  //1.Every object has its own azonosito
        this.tisztasagPont = tisztasagPont;
    }
    public void mosas(int pluszPont) {
        //3. The mosas(int pluszPont) method can't accept a negative number 
        if(pluszPont<0 || tisztasagPont==null){
            throw IllegalArgumentException("pluszPont nem lehet negatív");
        }
        tisztasagPont += pluszPont;
    }
    //2.We are getting the Azonosito through a getter
    public String getAzonosito{
    
    return azonosito;
    
    }
    public int getTisztasagPont() {
        return tisztasagPont;
    }
    public String cimke() {
        return azonosito + ": " + tisztasagPont;
    }
}



