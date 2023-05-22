package com.example.demo.service;

import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AllArgsConstructor;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TwoSum {
    public ArrayList<Integer> Suma(Telo t){
        int target = t.getTarget();
        List<Integer> niz = t.getLista() ;
        ArrayList<Integer> kombinacije= new ArrayList<>();
        for (int i=0;i<niz.size()-1;i++){
            for (int j=i+1;j<niz.size();j++){
                if(niz.get(i)+niz.get(j)==target){
                    kombinacije.add(i);
                    kombinacije.add(j);
                    return kombinacije;
                }
            }
        }
        return kombinacije;
    }
}
