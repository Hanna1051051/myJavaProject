package school.lesson7;

import java.io.*;

public class WriteAndRead {

    public static void main(String[] args) {
        AppData header = new AppData(new String[]{"Value1","Value2","Value3"});
        AppData data = new AppData(new int[][]{{100,200,123}, {300,400,500}, {600,700,800}});
        BufferedReader br = null;
        try {
            File file = new File("Task7.csv");
            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println(header.writeHeader());
            pw.println(data.writeData());
            pw.close();

            br = new BufferedReader(new FileReader("Task7.csv"));
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Error: " + e);
        } finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println("Error: " + e);
            }
        }
    }
}




