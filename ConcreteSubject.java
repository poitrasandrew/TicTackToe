/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18b.midterm;
import java.util.*;
/**
 *
 * @author Drew
 */
public class ConcreteSubject implements Subject {
    private int num;
    private ArrayList observers;
    
    public ConcreteSubject(){
        observers = new ArrayList();
    }
    
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++){
            Game game = (Game)observers.get(i);
            game.updateGame(num);
        }
    }
    
    public void addObserver(Game g) {
        observers.add(g);
    }
    
    public void removeObserver(Game g) {
        int i = observers.indexOf(g);
        if (i >= 0){
            observers.remove(i);
        }
    }
    
    public void numChanged() {
        notifyObserver();
    }
    
    public void setNum(int num) {
        this.num = num;
        numChanged();
    }
}