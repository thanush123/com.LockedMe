import java.io.IOException;

public interface Locked {
    void filesInAscendingOrder(String path);
    void addFile(String filename,String path) throws IOException;
    void deleteFile(String filename,String path);
    void searchFile(String filename,String path);
}
