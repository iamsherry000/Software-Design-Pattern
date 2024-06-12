public class Subscriber implements Observer {
    private String name;

    public Subscriber (String name) {
        this.name = name;
    }

    public void subscribeChannel() {
        
    }

    @Override
    public void update() {
        System.out.println(name + " received a new video. ");
    }
}
