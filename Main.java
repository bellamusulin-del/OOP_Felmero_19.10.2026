package com.oop_felmero;


public class Main {
    public static void main(String[] args) {
        //4.A main-ben készíts egy alap- és egy leszármazott objektumot, tárold őket UrZokni típusú
//referenciákban és hívd meg mindkettőn a cimke() metódust.
        UrZokni egy_zokni=new Urzokni("Zoknika",7,"MilkyWay");
        
        Urzokni meg_egy_zokni=new TeleportalosUrZokni("Zoknya",10,"Centaurus A");
        
        UrZokni z = new TeleportalosUrZokni(
            "ZOKNI-42", 4, "Andromeda");
        z.mosas(6);
        System.out.println(z.cimke());
        //4.hívd meg mindkettőn a cimke() metódust
         public String cimke(egy_zokni);
        
         public String cimke(meg-egy_zokni);
    }
}