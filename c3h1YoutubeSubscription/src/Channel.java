import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Observer> Subscribers;

    public Channel(String name)  {
        this.name = name;
        this.Subscribers = new ArrayList<>();
    }

    

}
