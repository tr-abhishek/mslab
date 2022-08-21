package com.example.Service1;
public class Service1 {
   // private final int id;
    
    private int hid;
    private String hname;
    private int date;
    private int rno;
    // private String ele5;
    // private String ele6;

    public Service1(final int hid,  final String hname,final int date,final int rno) {
        this.hid = hid;
        this.hname = hname;
        this.date= date;
        this.rno= rno;
        // this.ele5 = ele5;
        // this.ele6 = ele6;
    }

 

    public int gethid() {
        return hid;
    }
    public String gethname() {
        return hname;
    }
    public int getdate() {
        return date;
    }
    public int getrno() {
        return rno;
    }
    // public String getele5() {
    //     return ele5;
    // }
    // public String getele6() {
    //     return ele6;
    // }
}