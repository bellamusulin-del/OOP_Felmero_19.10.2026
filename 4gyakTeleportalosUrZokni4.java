package com.oop_felmero;

class TeleportalosUrZokni extends UrZokni {
    private String galaxis;
    public TeleportalosUrZokni(String azonosito,
                               int tisztasagPont,
                               String galaxis) {
        super(azonosito, tisztasagPont);
        this.galaxis = galaxis;
    }
     @Override
    public String cimke() {
        //4.returns galaxy parameter also 
        return "Teleport zokni:" + azonosito + "tisztasagPont:" + tisztasagPont+ "Galaxis:" + galaxis;
    }
}
