package com.jax.delete;

import org.apache.log4j.Logger;

import java.io.File;

public class DeleteUrl {
    private static final Logger logger = Logger.getLogger(DeleteUrl.class);

    public void deleteUrl() {
        String url = "/home/jaxtony/code/test/demo.txt";
        try {
            File file = new File(url);
            if (file.createNewFile()){
                logger.warn("File is not exist !");
                return;
            }
            file.delete();
            logger.info("Delete file : " + file.getAbsolutePath());
        } catch (Exception e) {
            logger.error(e);
        }
    }
}
