public class Main {
    public static void main(String[] args) {
        String PATH="/Users/thanushkumarreddykondreddy/Desktop/work python";
        Lockedimpl lm=new Lockedimpl();
        lm.filesInAscendingOrder(PATH);
        lm.addFile("hello.txt",PATH);
    }
}