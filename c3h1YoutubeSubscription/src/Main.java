public class Main {
    public static void main(String[] args) throws Exception {
        Channel channel1 = new Channel("Waterball Academy");
        Channel channel2 = new Channel("PewDiePie");

        Subscriber waterball = new Subscriber("Waterball");
        Subscriber1 fireball = new Subscriber1("Fireball");

        waterball.subscribeChannel(channel1);
        waterball.subscribeChannel(channel2);
        fireball.subscribeChannel(channel1);
        fireball.subscribeChannel(channel2);

        channel1.uploadVideo(new Video("C1M1S2","This world is all about Object Oriented",240));
        channel2.uploadVideo(new Video("Hello guys", "Clickbait", 30));
    }
}
