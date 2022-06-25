package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @Autowired
    private Carlist listaAut;
    @Value("${konfiguracja.nazwa}")
    public String nazwa;
    @Value("${konfiguracja.czas}")
    public int czas;
    @Value("${konfiguracja.miejsce}")
    public String miejsce;
    public String nazwa;
    public int czas;
    public String miejsce;
    @RequestMapping(
            value="konfiguracja",
            method = RequestMethod.GET
    )
    public String konfiguracja(){
        return "Nazwa Serwera to:"+nazwa+"\nczas serwera:"+czas+"\nMiejsce to:"+miejsce+tablica;
    }
    @RequestMapping("/hello")
    public String helloworld(){
        return "Hello World!";
    }
@RequestMapping("/ile")
    public int ileMamyAut(){
        return listaAut.iloscAut();
    }

    @RequestMapping(
            value="/dodajAuto",
            method= RequestMethod.GET)
    public boolean dodajAuto(@RequestParam("n") String nazwa,@RequestParam("p") int predkosc){
        try{
            listaAut.dodawanieAuta(new Car(nazwa, predkosc));
            return true;
        }catch (Exception e){
            return false;
        }
    }

}
