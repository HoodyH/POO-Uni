package desingPatterns.Observer;

import java.util.ArrayList;
import java.util.List;


public class NewsAgency implements Osservable{

    private String news;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer obs) {
        this.observers.add(obs);
    }

    public void setNews (String news){
        this.news = news;
        updateObserver();
    }

    public void updateObserver(){
        for (Observer obs : this.observers){
            obs.update(this.news);
        }
    }
}
