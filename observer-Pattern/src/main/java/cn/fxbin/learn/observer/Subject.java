package cn.fxbin.learn.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject
 *
 * <p>
 *     消息发布者
 * </p>
 *
 * @author fxbin
 * @version v1.0
 * @since 2021/2/20 14:50
 */
public class Subject {

    private final List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }


    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    public void notifyAllObserver() {
        this.observerList.forEach(Observer::update);
    }

}
