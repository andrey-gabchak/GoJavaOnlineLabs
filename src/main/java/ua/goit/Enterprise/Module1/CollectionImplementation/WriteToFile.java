package ua.goit.Enterprise.Module1.CollectionImplementation;

import ua.goit.Enterprise.Module1.Wagu.Block;
import ua.goit.Enterprise.Module1.Wagu.Board;
import ua.goit.Enterprise.Module1.Wagu.Table;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by coura on 30.05.2016.
 */

public class WriteToFile {

    public void writeTable(){
        TimeOfOperations timeOfOperations = new TimeOfOperations();

        //tables filling
        List<String> headersList = Arrays.asList("", "add", "get", "remove", "contains", "populate",
                 "iterator.add", "iterator.remove");
        List<List<String>> resultFor10K = timeOfOperations.getResultFor10K();
        List<List<String>> resultFor100K = timeOfOperations.getResultFor100K();
        List<List<String>> resultFor1000K = timeOfOperations.getResultFor1000K();


        //Create of tables
        int weightOfRow = 120;
        Board boardFor10K = new Board(weightOfRow);
        Table table = new Table(boardFor10K, weightOfRow, headersList, resultFor10K);
        Block tableBlock = table.tableToBlocks();
        boardFor10K.setInitialBlock(tableBlock);
        boardFor10K.build();
        String tableToString10K = boardFor10K.getPreview();

        Board boardFor100K = new Board(weightOfRow);
        String tableToString100K = boardFor100K.setInitialBlock(new Table(boardFor100K, weightOfRow,
                headersList, resultFor100K).tableToBlocks()).build().getPreview();

        Board boardFor1000K = new Board(weightOfRow);
        String tableToString1000K = boardFor1000K.setInitialBlock(new Table(boardFor1000K, weightOfRow,
                headersList, resultFor1000K).tableToBlocks()).build().getPreview();

        String filePath = "src\\main\\java\\ua\\goit" +
                "\\Enterprise\\Module1\\CollectionImplementation\\results.txt";
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                file.createNewFile();
            }

            PrintWriter writer = new PrintWriter(filePath);
            writer.println("Results for 10K");
            writer.println(tableToString10K);
            writer.println("Results for 100K");
            writer.println(tableToString100K);
            writer.println("Results for 1000K");
            writer.println(tableToString1000K);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
