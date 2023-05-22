package com.example.demo;

import com.example.demo.service.LongestSubString;
import com.example.demo.service.Telo;
import com.example.demo.service.TwoSum;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class HelloController {
    private final LongestSubString longestSubString;
    private  final  TwoSum twoSum;
    @RequestMapping(value = "/indeks",method = RequestMethod.GET)
    public  ArrayList<Integer> vratiIndekse(@RequestBody Telo telo){
        return twoSum.Suma(telo);
    }

    @RequestMapping(value = "/duzina",method = RequestMethod.GET)
    public  int VratiDuzinu(@RequestBody String s) {
        return longestSubString.Duzina(s);
    }
}
