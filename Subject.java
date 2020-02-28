/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18b.midterm;

/**
 *
 * @author Drew
 */
public interface Subject {
    public void notifyObserver();
    public void addObserver(Game g);
    public void removeObserver(Game g);
}
