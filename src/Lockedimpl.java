import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
    public void addFile(String filename1,String path) throws IOException {
           File f=new File(path+"/"+filename1);
           if(f.exists()){
               System.out.println("File already exist");
           }
           else {
               if(f.createNewFile())
                   System.out.println(filename1+" file created");
           }
    }
    @Override
    public void deleteFile(String filename,String path) {
        File f=new File(path+"/"+filename);
        if(f.exists()){
            if(f.delete())
                System.out.println(filename+" file is deleted");
        }
        else
            System.out.println("File not Found");
    }


    @Override
    public void searchFile(String filename,String path) {
        File f=new File(path+"/"+filename);
        if(f.exists()){
            System.out.println(filename+" file found");
        }
        else
            System.out.println("File not found");
    }
}
