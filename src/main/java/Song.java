import java.util.Date;

public abstract class Song {
    String title;
    String identifier;
    Date date;
    double duration;
    String gender;
    byte[] cover = null;
    String description;

    public String getTitle() {
        return title;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Date getDate() {
        return date;
    }

    public double getDuration() {
        return duration;
    }

    public String getGender() {
        return gender;
    }

    public byte[] getCover() {
        return cover;
    }

    public String getDescription() {
        return description;
    }
}

