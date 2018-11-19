package com.company;
//resoursce
public class Cake {
    private String name;
    private Integer gramms;
    private Integer expires;
    private Float price;


    public Cake(){

    }

    public Cake(String name, Integer gramms, Integer expires, Float price) {

        setName(name);
        setGramms(gramms);
        setExpires(expires);
        setPrice(price);

    }

    public String getName() {
        return name;
    }

    public Integer getGramms() {
        return gramms;
    }

    public Integer getExpires() {
        return expires;
    }

    public Float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGramms(Integer gramms) {
        this.gramms = gramms;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "name='" + name + '\'' +
                ", gramms=" + gramms +
                ", expires=" + expires +
                ", price=" + price +
                '}';
    }

}

