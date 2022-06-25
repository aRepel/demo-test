package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Carlist {
    private List<Car> listaAut;
    public Carlist(){
        this.listaAut= new ArrayList<>();
    }
    public void dodawanieAuta(Car a){
        listaAut.add(a);

    }

    public int iloscAut(){
        return listaAut.size();
    }


}
