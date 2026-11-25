package partTwo.files;

public abstract class File {
    private String name;
    private long size;
    private String format;

    public File(String name, long size, String format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }

    public String getName() {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Имя файла не может быть пустым");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {

        return size;
    }

    public void setSize(long size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Размер файла должен быть больше 0");
        }
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("Формат файла не может быть пустым");
        }
        this.format = format;
    }

    protected abstract String getDetails();

    public static void printAll(File[] files) {
        String border = "%83s".formatted("-").replace(" ", "-");
        String divider = "%21s+%12s+%50s".formatted("-", "-", "-").replace(" ", "-");
        String tableName = "%20s | %10s | %-50s".formatted("File Name", "Size", "Details");
        System.out.println(border);
        System.out.println(tableName);
        System.out.println(divider);
        for (File file : files) {
            if (file != null) {
                printFileInfo(file);
            }
        }
        System.out.println(border);
    }

    private static void printFileInfo(File file) {
        System.out.printf("%-20s | %10d | %-50s\n", file.getName(), file.getSize(), file.getDetails());
    }
}
