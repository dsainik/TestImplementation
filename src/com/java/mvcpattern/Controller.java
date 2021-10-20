package com.java.mvcpattern;

public class Controller {
    
    Person p;
    PersonView view;    
    
    public Controller(Person p, PersonView view) {        
        this.p = p;
        this.view = view;
    }
    public Person getP() {
        return p;
    }
    public void setP(Person p) {
        this.p = p;
    }
    public PersonView getView() {
        return view;
    }
    public void setView(PersonView view) {
        this.view = view;
    }
    
    public void updateView(){
        view.getName(p.getName(), p.getName());
    }
    
}
