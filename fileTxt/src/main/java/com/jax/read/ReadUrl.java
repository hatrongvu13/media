package com.jax.read;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadUrl implements ReadFile {
    private static Logger logger = Logger.getLogger(ReadUrl.class);

    @Override
    public void printlnFile() {
        try {
            String url = "/home/jaxtony/code/test/demo.txt";
            File file = new File(url);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            logger.error("{}", e);
        }
    }

    @Override
    public void printlnFile(String url) {
        try {
            File file = new File(url);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            logger.error("{}", e);
        }
    }

    @Override
    public void printFile() {
        try {
            String url = "/home/jaxtony/code/test/demo.txt";
            File file = new File(url);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.print(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            logger.error("{}", e);
        }
    }

    @Override
    public void printFile(String url) {
        try {
            File file = new File(url);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.print(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            logger.error("{}", e);
        }
    }

    @Override
    public long countLine() {
        long lines = 0;
        String url = "/home/jaxtony/code/test/demo.txt";
        try {
            File file = new File(url);
            Path path = Paths.get(file.getPath());
            lines = Files.lines(path).count();
        } catch (Exception e) {
            logger.error(e);
        }
        return lines;
    }

    @Override
    public long countLine(String url) {
        long lines = 0;
        try {
            File file = new File(url);
            Path path = Paths.get(file.getPath());
            lines = Files.lines(path).count();
        } catch (Exception e) {
            logger.error(e);
        }
        return lines;
    }

}
