package cn.edu.nju.sa2017.pipefilter;

import org.springframework.batch.item.ItemWriter;
import java.io.*;
import java.io.FileWriter;
import java.util.List;

public class MyWriter implements ItemWriter<Report> {
    @Override
    public void write(List<? extends Report> list) {
        File file = new File("xml/outputs/report.txt");
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter(file);
            for(int i = 0; i < list.size(); i++){
                fileWriter.write(list.get(i).toString());
                fileWriter.write("\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
