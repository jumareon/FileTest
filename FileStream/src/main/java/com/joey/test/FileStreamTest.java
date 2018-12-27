package com.joey.test;

import java.io.File;
import java.io.FileDescriptor;

public class FileStreamTest {

    private static final String SAMPLE_PATH = System.getProperty("user.dir") + File.separator + "root-resources";
    private static final String SAMPLE_FILE = "aws-ec2-us-east-1-pricing.json";

    public static void main(String[] args) {
        System.out.println("resources path : " + SAMPLE_PATH);
        System.out.println("resources file : " + SAMPLE_FILE);

        File file = new File(SAMPLE_PATH);
        System.out.println(file);

        
    }

}
