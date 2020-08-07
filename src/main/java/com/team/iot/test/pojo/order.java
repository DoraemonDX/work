package com.team.iot.test.pojo;

public class order {
    int id;
    String name;
    String code;
    String id_card;
    String sent;
    String state;

    public order(int id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", id_card='" + id_card + '\'' +
                ", sent='" + sent + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSent() {
        return sent;
    }

    public void setSent(String sent) {
        this.sent = sent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public order(int id, String name, String code, String id_card, String sent, String state) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.id_card = id_card;
        this.sent = sent;
        this.state = state;
    }

    public order() {
    }
}
