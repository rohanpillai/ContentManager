package com.cms.reader;

import java.io.File;

import com.cbs.interfaces.IReader;

public class FileProcessor {
    private final ReaderFactory readerFactory;
    
    public FileProcessor(final ReaderFactory readerFactory) {
        this.readerFactory = readerFactory;
    }
    
    public void process(final File file) {
        
        IReader reader = readerFactory.createReader(file);
        
        
    }
    

}
