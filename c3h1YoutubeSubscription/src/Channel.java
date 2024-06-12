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

    public void attach(Observer observer) {
        subscribers.add(observer);
    }

    public void detach(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObservers(Video video) {
        for (Observer subscriber : subscribers) {
            subscriber.update(video);
        }
    }

    public void uploadVideo(String title, String description, int length) {
        Video video = new Video(name, length);
        System.out.println(name + " upload a new video " + video.getName());
        notifyObservers(video);
    }

}
