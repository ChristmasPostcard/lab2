package partTwo.files;

import partTwo.helpers.Image;

public class ImageFile extends File {
    private Image resolution;

    public ImageFile(String name, long size, String format, Image resolution) {
        super(name, size, format);
        setResolution(resolution);
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
        return String.format("%s, %s", getFormat(), resolution.toString());
    }
}
