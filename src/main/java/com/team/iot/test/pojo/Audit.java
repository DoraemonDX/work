package com.team.iot.test.pojo;

import java.util.Arrays;

public class Audit {

    String name;
    String code;
    String id_card;
    byte[] id_card_img1;
    byte[] id_card_img2;
    byte[] qualification_card_img;


    public byte[] getQualification_card_img() {
        return qualification_card_img;
    }

    public void setQualification_card_img(byte[] qualification_card_img) {
        this.qualification_card_img = qualification_card_img;
    }
    public Audit(String name, String code) {
        this.name = name;
        this.code = code;
    }





    public Audit() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public byte[] getId_card_img1() {
        return id_card_img1;
    }

    public void setId_card_img1(byte[] id_card_img1) {
        this.id_card_img1 = id_card_img1;
    }

    public byte[] getId_card_img2() {
        return id_card_img2;
    }

    public void setId_card_img2(byte[] id_card_img2) {
        this.id_card_img2 = id_card_img2;
    }

    @Override
    public String toString() {
        return "audit{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", id_card='" + id_card + '\'' +
                ", id_card_img1=" + Arrays.toString(id_card_img1) +
                ", id_card_img2=" + Arrays.toString(id_card_img2) +
                ", qualification_card_img=" + Arrays.toString(qualification_card_img) +
                '}';
    }

    public Audit(String name, String code, String id_card, byte[] id_card_img1, byte[] id_card_img2, byte[] qualification_card_img) {
        this.name = name;
        this.code = code;
        this.id_card = id_card;
        this.id_card_img1 = id_card_img1;
        this.id_card_img2 = id_card_img2;
        this.qualification_card_img = qualification_card_img;
    }
}
