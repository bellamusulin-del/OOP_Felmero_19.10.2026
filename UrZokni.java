package com.oop_felmero;

class UrZokni {
    public String azonosito; 
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        this.azonosito = azonosito;  //1.minden objektum saját azonosítóját tárolja
        this.tisztasagPont = tisztasagPont;
    }
    public void mosas(int pluszPont) {
        tisztasagPont += pluszPont;
    }
    }
    public int getTisztasagPont() {
        return tisztasagPont;
    }
    public String cimke() {
        return azonosito + ": " + tisztasagPont;
    }
}



