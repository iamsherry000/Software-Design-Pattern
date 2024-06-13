import java.util.ArrayList;
import java.util.List;

public class Subscriber1 implements Observer{
    private String name;
    private List<Channel> subscribedChannels;

    public Subscriber1(String name) {
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
        if (video.getLength() <= 60) {
            //unsubscribeChannel(video.getChannel());
        }
    }
}
