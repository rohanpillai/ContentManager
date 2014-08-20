package com.cms.reader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileBrowser {
    
    private final File folder;
    
    public FileBrowser(final File folder) {
        this.folder = folder;
    }

    public List<File> listFiles() {
        List<File> files = new ArrayList<File>();
        if (folder.isDirectory()) {
            for ( File file : folder.listFiles()) {
                if (file.isFile()) {
                    files.add(file);
                }
            }
        }
        return files;
    }
}
