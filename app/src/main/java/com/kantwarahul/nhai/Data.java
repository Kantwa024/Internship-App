package com.kantwarahul.nhai;

public class Data {
    private int drawableid;
    private String Type, About;

    public Data(int drawableid, String type, String about) {
        this.drawableid = drawableid;
        Type = type;
        About = about;
    }

    public int getDrawableid() {
        return drawableid;
    }

    public void setDrawableid(int drawableid) {
        this.drawableid = drawableid;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String about) {
        About = about;
    }
}
