import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lockedimpl implements Locked{
    @Override
    public void filesInAscendingOrder(String path) {
        File folder=new File(path);
        File []files=folder.listFiles();
        List<String> lfiles=new ArrayList<>();
        for(File filename: files){
            if(filename.isFile()){
                lfiles.add(filename.getName());
            }
        }
        Collections.sort(lfiles);
        for(String filen:lfiles){
            System.out.println(filen);
        }
    }
    @Override
    public void addFile(String filename,String path) {
       try {
           File f=new File(path+"/"+filename);
           System.out.println(f.createNewFile());
       }
       catch(Exception e) {
           e.getStackTrace();
        }
    }

    @Override
    public void deleteFile() {

    }

    @Override
    public void searchFile() {

    }
}
