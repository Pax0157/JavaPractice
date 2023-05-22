package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LongestSubString {

    public int Duzina(String s){
        Character c;
        String sub="";
        int result=0;
        for (int i=0;i<s.length();i++){
            c=s.charAt(i);
            if(sub.contains(c+"")){
                sub=sub.substring(sub.indexOf(c)+1)+c;
            }
            else {
                sub+=c;
            }
            if(result<sub.length()){
                result=sub.length();
            }
        }
        return result;
    }
}
