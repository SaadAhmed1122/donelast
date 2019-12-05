package com.example.semisterproject;

public class Products {
    private String pro_name;
    private String pro_desc;
    private String pro_p_price;
    private String pro_s_price;
    private String ava_sto;
    private String pro_cat;

    public Products() {

    }
    public Products(String pro_name, String pro_desc, String pro_p_price, String pro_s_price, String ava_sto, String pro_cat) {
        this.pro_name = pro_name;
        this.pro_desc = pro_desc;
        this.pro_p_price = pro_p_price;
        this.pro_s_price = pro_s_price;
        this.ava_sto = ava_sto;
        this.pro_cat = pro_cat;
    }

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_desc() {
        return pro_desc;
    }

    public void setPro_desc(String pro_desc) {
        this.pro_desc = pro_desc;
    }

    public String getPro_p_price() {
        return pro_p_price;
    }

    public void setPro_p_price(String pro_p_price) {
        this.pro_p_price = pro_p_price;
    }

    public String getPro_s_price() {
        return pro_s_price;
    }

    public void setPro_s_price(String pro_s_price) {
        this.pro_s_price = pro_s_price;
    }

    public String getAva_sto() {
        return ava_sto;
    }

    public void setAva_sto(String ava_sto) {
        this.ava_sto = ava_sto;
    }

    public String getPro_cat() {
        return pro_cat;
    }

    public void setPro_cat(String pro_cat) {
        this.pro_cat = pro_cat;
    }


}
