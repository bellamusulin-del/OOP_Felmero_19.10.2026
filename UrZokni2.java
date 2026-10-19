package com.oop_felmero;

class UrZokni {
    private String azonosito; //2.We changed azonosito from public to private String 
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        this.azonosito = azonosito;  //1.Every object has its own azonosito
        this.tisztasagPont = tisztasagPont;
    }
    public void mosas(int pluszPont) {
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



