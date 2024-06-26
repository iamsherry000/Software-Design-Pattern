import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
    private String name;
    private List<Channel> subscribedChannels;

    public Subscriber(String name) {
        this.name = name;
        this.subscribedChannels = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void subscribeChannel(Channel channel) {
        subscribedChannels.add(channel);
        channel.subscribe(this);
        System.out.println(name + " subscribe " + channel.getName());
    }

    public void unsubscribeChannel(Channel channel) {
        subscribedChannels.remove(channel);
        channel.unsubscribe(this);
        System.out.println(name + " unsubscribe " + channel.getName());
    }

    @Override
    public void update(Video video) {
        if (video.getLength() >= 180) {
            System.out.println(name + " liked the video: " + video.getTitle());
        }
    }
}
