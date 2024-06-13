import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Observer> subscribers;

    public Channel(String name)  {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObservers(Video video) {
        for (Observer subscriber : subscribers) {
            subscriber.update(video);
        }
    }

    public void uploadVideo(Video video) {
        notifyObservers(video);
    }

}
