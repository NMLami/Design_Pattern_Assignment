package ageOFvillagers;

import java.util.ArrayList;
import java.util.List;

public class shape{
    private String name;
    private String color;
    private String dimention;
    private List<shape> contains;

    public shape(String name,String color, String dimention){
        this.name = name;
        this.color = color;
        this.dimention=dimention;
        contains = new ArrayList<shape>();
    }

    public void add(shape s){
        contains.add(s);
    }

    public void remove(shape s){
        contains.remove(s);
    }

    public List<shape> getContains(){
        return contains;
    }

    public String toString(){
        return (" Name: "+name+", color: "+color+", property:"+dimention+"");
    }

    public void print(){
        System.out.println(name+" Consists of:");
        for(shape s:contains){
            System.out.println(s);
        }
    }
}