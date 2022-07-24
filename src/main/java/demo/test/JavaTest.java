package demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JavaTest {
    public static void main(String[] args) {
/*        String docsPath = "src/main/resources/doc/0.txt";
        final Path docDir = Paths.get(docsPath);
        try {
            System.out.println(docDir.toAbsolutePath());
            List<String> strings = Files.readAllLines(docDir);
            System.out.println(strings);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        System.out.println(System.getProperty("user.dir"));
    }
}
