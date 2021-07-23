package com.jax.create;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class CreateUrl {
    public static final Logger logger = Logger.getLogger(CreateUrl.class);

    public void createUrl() {
        String url = "/home/jaxtony/code/test/demo.txt";
        try {
            File file = new File(url);
            if (file.createNewFile()) {
                logger.info("File created : " + file.getName() + " and path : " + file.getPath());
            } else {
                logger.warn("File already exits ! Path file : " + file.getPath());
            }
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }

    public void createUrl(String url){
        try {
            File file = new File(url);
            if (file.createNewFile()) {
                logger.info("File created : " + file.getName() + " and path : " + file.getPath());
            } else {
                logger.warn("File already exits ! Path file : " + file.getPath());
            }
        } catch (IOException e) {
            logger.error("{}", e);
        }
    }
}
