

package day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ReadFilesWithScanner {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(Path.of("src/day10_string/Test.txt"));

        /*
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());

         */


        System.out.println(scan.next()); // bu kod text te yazilan kodu tek tek kelime yaziyor.
        System.out.println(scan.next());
        System.out.println(scan.next());

        System.out.println( scan.hasNext());

        scan.close();


    }
}
