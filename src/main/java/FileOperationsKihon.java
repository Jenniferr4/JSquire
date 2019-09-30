import framework.FileOperationsKihonBase;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperationsKihon extends FileOperationsKihonBase {
    @Override
    public String getContentsOfThisFile(Path pathOfFile) throws IOException {
        return Files.readString(pathOfFile);
    }

    @Override
    public void writeContentsToThisFile(Path pathOfFile, String contents) throws IOException {
        try(FileWriter writer = new FileWriter((String.valueOf(pathOfFile)))) {
            writer.append(contents);
        }
    }
}
