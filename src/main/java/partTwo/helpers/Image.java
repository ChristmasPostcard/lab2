package partTwo.helpers;

public class Image {
    private int heigh;
    private int width;

    public Image(int heigh, int width) {
        this.heigh = heigh;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public String toString() {
        return heigh + "x" + width;
    }
}
