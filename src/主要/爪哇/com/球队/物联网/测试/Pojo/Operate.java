package com.team.iot.test.pojo;

import java.util.Date;

public class Operate {
    private int id;
    private String customer;
    private String reservation_time;
    private String run_time;
    private String road;
    private String driver;
    private String team;
    private String reality_plate;
    private String applition_plate;
    private String models;
    private String appition_earn;
    private String tax;
    private String appition_pay;
    private String times;
    private String yuetongbao;
    private String road_cost;
    private String oil_cost;
    private String play_cost;
    private String niaosu_cost;
    private String other_cost;
    private String serial_number;
    private String note;
    private String state;
    private Date systime;

    @Override
    public String toString() {
        return "Operate{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", reservation_time='" + reservation_time + '\'' +
                ", run_time='" + run_time + '\'' +
                ", road='" + road + '\'' +
                ", driver='" + driver + '\'' +
                ", team='" + team + '\'' +
                ", reality_plate='" + reality_plate + '\'' +
                ", applition_plate='" + applition_plate + '\'' +
                ", models='" + models + '\'' +
                ", appition_earn='" + appition_earn + '\'' +
                ", tax='" + tax + '\'' +
                ", appition_pay='" + appition_pay + '\'' +
                ", times='" + times + '\'' +
                ", yuetongbao='" + yuetongbao + '\'' +
                ", road_cost='" + road_cost + '\'' +
                ", oil_cost='" + oil_cost + '\'' +
                ", play_cost='" + play_cost + '\'' +
                ", niaosu_cost='" + niaosu_cost + '\'' +
                ", other_cost='" + other_cost + '\'' +
                ", serial_number='" + serial_number + '\'' +
                ", note='" + note + '\'' +
                ", state='" + state + '\'' +
                ", systime=" + systime +
                '}';
    }

    public Operate(int id, String customer, String reservation_time, String run_time, String road, String driver, String team, String reality_plate, String applition_plate, String models, String appition_earn, String tax, String appition_pay, String times, String yuetongbao, String road_cost, String oil_cost, String play_cost, String niaosu_cost, String other_cost, String serial_number, String note,String state, Date systime) {
        this.id = id;
        this.customer = customer;
        this.reservation_time = reservation_time;
        this.run_time = run_time;
        this.road = road;
        this.driver = driver;
        this.team = team;
        this.reality_plate = reality_plate;
        this.applition_plate = applition_plate;
        this.models = models;
        this.appition_earn = appition_earn;
        this.tax = tax;
        this.appition_pay = appition_pay;
        this.times = times;
        this.yuetongbao = yuetongbao;
        this.road_cost = road_cost;
        this.oil_cost = oil_cost;
        this.play_cost = play_cost;
        this.niaosu_cost = niaosu_cost;
        this.other_cost = other_cost;
        this.serial_number = serial_number;
        this.note = note;
        this.state = state;
        this.systime = systime;
    }

    public Operate() {
    }

    public int getId() {

        return id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getReservation_time() {
        return reservation_time;
    }

    public void setReservation_time(String reservation_time) {
        this.reservation_time = reservation_time;
    }

    public String getRun_time() {
        return run_time;
    }

    public void setRun_time(String run_time) {
        this.run_time = run_time;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getReality_plate() {
        return reality_plate;
    }

    public void setReality_plate(String reality_plate) {
        this.reality_plate = reality_plate;
    }

    public String getApplition_plate() {
        return applition_plate;
    }

    public void setApplition_plate(String applition_plate) {
        this.applition_plate = applition_plate;
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models;
    }

    public String getAppition_earn() {
        return appition_earn;
    }

    public void setAppition_earn(String appition_earn) {
        this.appition_earn = appition_earn;
    }

    public String getTax() {
        return tax;
    }

    public void setTax(String tax) {
        this.tax = tax;
    }

    public String getAppition_pay() {
        return appition_pay;
    }

    public void setAppition_pay(String appition_pay) {
        this.appition_pay = appition_pay;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getYuetongbao() {
        return yuetongbao;
    }

    public void setYuetongbao(String yuetongbao) {
        this.yuetongbao = yuetongbao;
    }

    public String getRoad_cost() {
        return road_cost;
    }

    public void setRoad_cost(String road_cost) {
        this.road_cost = road_cost;
    }

    public String getOil_cost() {
        return oil_cost;
    }

    public void setOil_cost(String oil_cost) {
        this.oil_cost = oil_cost;
    }

    public String getPlay_cost() {
        return play_cost;
    }

    public void setPlay_cost(String play_cost) {
        this.play_cost = play_cost;
    }

    public String getNiaosu_cost() {
        return niaosu_cost;
    }

    public void setNiaosu_cost(String niaosu_cost) {
        this.niaosu_cost = niaosu_cost;
    }

    public String getOther_cost() {
        return other_cost;
    }

    public void setOther_cost(String other_cost) {
        this.other_cost = other_cost;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getSystime() {
        return systime;
    }

    public void setSystime(Date systime) {
        this.systime = systime;
    }
}
