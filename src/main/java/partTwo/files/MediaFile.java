package partTwo.files;

import partTwo.helpers.Duration;
import partTwo.helpers.Image;

public class MediaFile extends File {
    private String description;
    private Duration duration;
    private Image resolution;

    public MediaFile(String name, long size, String format, String description, Duration duration, Image resolution) {
        super(name, size, format);
        if ("video".equalsIgnoreCase(format)) {
            setResolution(resolution);
        } else {
            throw new IllegalArgumentException("Размер изображение указывается для видео файлов");
        }
        setDescription(description);
        setDuration(duration);
    }

    public MediaFile(String name, long size, String format, String description, Duration duration) {
        super(name, size, format);
        setDescription(description);
        setDuration(duration);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Описание контента не может быть пустым");
        }
        this.description = description;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if (duration == null) {
            throw new IllegalArgumentException("Длительность мультимедиа файла не может быть null");
        }
        this.duration = duration;
    }

    public Image getResolution() {
        return resolution;
    }

    public void setResolution(Image resolution) {
        if (resolution == null) {
            throw new IllegalArgumentException("Размер изображения не может быть null");
        }
        this.resolution = resolution;
    }

    @Override
    protected String getDetails() {
        if ("video".equalsIgnoreCase(getFormat())) {
            return String.format("%s, %s, %s, %s", getFormat(), description, duration.toString(), resolution.toString());
        }
        return String.format("%s, %s, %s", getFormat(), description, duration.toString());
    }
}
