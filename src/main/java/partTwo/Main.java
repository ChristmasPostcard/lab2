package partTwo;

import partTwo.files.DocFile;
import partTwo.files.File;
import partTwo.files.ImageFile;
import partTwo.files.MediaFile;
import partTwo.helpers.Duration;
import partTwo.helpers.Image;

public class Main {
    public static void main(String[] args) {
        File[] allFiles = getAllFiles();
        File.printAll(allFiles);
        DocFile[] documents = {
                new DocFile("report_2026.pdf", 540120, "pdf", 15),
                new DocFile("notes.txt", 4096, "txt", 1)
        };
        System.out.println("Только документы:");
        /*
         Работает благодаря динамическому полиморфизму:
         класс DocFile наследуется от File,
         массив DocFile[] автоматически является подтипом File[],
         поэтому метод printAll(StorageFile[] files) без проблем принимает DocFile[].
         Для каждого элемента массива DocFile[]
         вызывается переопределенный метод getDetails() именно класса DocFile.
         */
        File.printAll(documents);
    }

    private static File[] getAllFiles() {
        return new File[]{
                new DocFile("j110-lab2-hiers.docx", 23212, "docx", 2),
                new ImageFile("spb-map.png", 1703527, "image", new Image(1024, 3072)),
                new MediaFile("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", new Duration(0, 5, 28)),
                new MediaFile("BackToTheFuture1.avi", 1470984192L, "video", "Back to the future I, 1985", new Duration(1, 48, 8), new Image(640, 352))
        };
    }

}
