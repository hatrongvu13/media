package com.jax.write;

import org.apache.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class WriteUrl {
    private final static Logger logger = Logger.getLogger(WriteUrl.class);

    public void writeData(String data) {
        String url = "/home/jaxtony/code/test/demo.txt";
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            logger.error(e);
        }
    }

    public void writeData(String data, String url) {
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.write(data);
            fileWriter.close();
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }

    public void appendData(String data) {
        String url = "/home/jaxtony/code/test/demo.txt";
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }

    public void appendData(String data, String url) {
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.append(data);
            fileWriter.close();
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }

    public void flushData(){
        String url = "/home/jaxtony/code/test/demo.txt";
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }

    public void flushData(String url) {
        try {
            FileWriter fileWriter = new FileWriter(url);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }
}
