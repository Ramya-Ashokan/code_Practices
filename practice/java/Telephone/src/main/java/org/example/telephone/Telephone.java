package org.example.telephone;

public class Telephone {
    String name;
    String phoneno;

    public Telephone(String name, String phoneno) {
        this.name = name;
        this.phoneno = phoneno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String toString()
    {
        return "Name:"+name+"Phone number"+phoneno;
    }
}
