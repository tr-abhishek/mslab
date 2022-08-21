package com.example.Service2;
public class Service2 {
   // private final int id;
    
    private int cid;
    private String cname;
    private String gender;
    private int age;
    private int rno;
    // private String ele6;

    public Service2(final int cid, final String cname,final String gender,final int age,final int rno) {
        this.cid = cid;
        this.cname = cname;
        this.gender= gender;
        this.age= age;
        this.rno = rno;
        // this.ele6 = ele6;
    }

 

    public int getcid() {
        return cid;
    }
    public String getcname() {
        return cname;
    }
    public String getgender() {
        return gender;
    }
    public int getage() {
        return age;
    }
    public int getrno() {
        return rno;
    }
    // public String getele6() {
    //     return ele6;
    // }
}