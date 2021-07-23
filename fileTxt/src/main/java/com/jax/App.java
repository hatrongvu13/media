package com.jax;

import com.jax.create.CreateUrl;
import com.jax.delete.DeleteUrl;
import com.jax.read.ReadFile;
import com.jax.read.ReadUrl;
import com.jax.write.WriteUrl;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {
    private static Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        ReadFile read = new ReadUrl();
        WriteUrl write = new WriteUrl();
        CreateUrl create = new CreateUrl();
        DeleteUrl delete = new DeleteUrl();
        delete.deleteUrl();
        create.createUrl();
        read.printlnFile();
        write.writeData("jaxtony \njaxtony");
        read.printlnFile();
        System.out.println(read.countLine());
    }
}
