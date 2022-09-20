public interface Locked {
    void filesInAscendingOrder(String path);
    void addFile(String filename,String path);
    void deleteFile();
    void searchFile();
}
