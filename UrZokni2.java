package com.oop_felmero;

class UrZokni {
    private String azonosito; //2.
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        this.azonosito = azonosito;  //1.minden objektum saját azonosítóját tárolja
        this.tisztasagPont = tisztasagPont;
    }
    public void mosas(int pluszPont) {
        tisztasagPont += pluszPont;
    }
    //2.
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



