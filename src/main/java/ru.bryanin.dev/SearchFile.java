package ru.bryanin.dev;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SearchFile {
    private String searchPhrase;
    private List<File> fileList;
    private final Logger logger = LoggerFactory.getLogger(SearchFile.class);

    public SearchFile(String searchPhrase) {
        this.searchPhrase = searchPhrase;
        this.fileList = new ArrayList<>();
    }

    public List<File> search(File rootFile) {
        if(rootFile.isDirectory()) {
            File[] directoryFiles = rootFile.listFiles();
            if(directoryFiles != null) {
                for (File file : directoryFiles) {
                    if(file.isDirectory()) {
                        search(file);
                    } else {
                        if(file.getName().toLowerCase().replaceAll("\\s*", "").contains(searchPhrase.toLowerCase().replaceAll("\\s*", ""))) {
                            fileList.add(file);
                        }
                    }
                }
            }
        }
        return fileList;
    }
}
