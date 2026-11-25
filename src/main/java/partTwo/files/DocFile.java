package partTwo.files;

public class DocFile extends File {
    private int pageCount;

    public DocFile(String name, long size, String format, int pageCount) {
        super(name, size, format);
        setPageCount(pageCount);
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount <= 0) {
            throw new IllegalArgumentException("Количество страниц должно быть больше 0");
        }
        this.pageCount = pageCount;
    }

    @Override
    protected String getDetails() {
        return String.format("%s, %d pages", getFormat(), pageCount);
    }
}
