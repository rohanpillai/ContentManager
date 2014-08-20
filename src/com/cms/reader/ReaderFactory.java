package com.cms.reader;

import java.io.File;

import org.apache.commons.io.FilenameUtils;
import com.cbs.interfaces.IReader;

public class ReaderFactory {
    
    public IReader createReader(File file) {
        String extension = FilenameUtils.getExtension(file.getName());
        IReader reader = null;
        if (extension.equals("txt") || extension.equals("")) {
            reader = new TextReader(file);
        }
        
        return reader;
    }
}
