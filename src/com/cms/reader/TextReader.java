package com.cms.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.cbs.interfaces.IReader;

public class TextReader implements IReader {
    
    private final BufferedReader bufferedReader;
    
    public TextReader(final File file) {
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found", e);
        }
    }
    @Override
    public String readline() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException("IO error while reading file", e);
        }
    }
}
