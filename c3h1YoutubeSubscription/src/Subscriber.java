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
        channel.attach(this);
        System.out.println(name + " subscribe " + channel.getName());
    }

    public void unsubscribeChannel(Channel channel) {
        subscribedChannels.remove(channel);
        channel.detach(this);
        System.out.println(name + " unsubscribe " + channel.getName());
    }

    @Override
    public void update(Video video) {
        // System.out.println(name + " has been notified about new video: " + video.getName());
    }
}
