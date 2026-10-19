package com.oop_felmero;

class UrZokni {
    private String azonosito; //2.
    private int tisztasagPont;
    
    public UrZokni(String azonosito, int tisztasagPont) {
        //3.A konstruktor ne engedjen negatív tisztasagPont értéket.
        if(tisztasagPont<0 || tisztasagPont==null){
            throw IllegalArgumentException("tisztasagPont nem lehet negatív");
        }
        this.azonosito = azonosito;  //1.minden objektum saját azonosítóját tárolja
        this.tisztasagPont = tisztasagPont;
    }
    public void mosas(int pluszPont) {
        //3. A mosas(int pluszPont) metódus ne fogadjon negatív paramétert.
        if(pluszPont<0 || tisztasagPont==null){
            throw IllegalArgumentException("pluszPont nem lehet negatív");
        }
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



