package com.example.mysekolah;

public class Dependency {

    private String ParentIc;
    private String ChildIC;
    private  String ChildName;

    public Dependency(String parentIc, String childIC, String childName) {
        ParentIc = parentIc;
        ChildIC = childIC;
        ChildName = childName;
    }

    public String getParentIc() {
        return ParentIc;
    }

    public void setParentIc(String parentIc) {
        ParentIc = parentIc;
    }

    public String getChildIC() {
        return ChildIC;
    }

    public void setChildIC(String childIC) {
        ChildIC = childIC;
    }

    public String getChildName() {
        return ChildName;
    }

    public void setChildName(String childName) {
        ChildName = childName;
    }
}
