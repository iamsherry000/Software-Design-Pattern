public class Video {
    private String name;
    private String description;
    private int length;

    public Video(String name, int length) {
        this.name = name;
        this.description = description;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getLength() {
        return length;
    }
}
