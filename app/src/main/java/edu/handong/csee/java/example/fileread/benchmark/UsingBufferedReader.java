package edu.handong.csee.java.example.fileread.benchmark;

import java.io.*;

public class UsingBufferedReader {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Please provide a valid argument: 1MB, 10MB, 100MB, 1000MB");
            return;
        }

        String inputFilePath = "";
        long fileSize = 0;

        // Set file path and size based on user-provided argument
        if (args[0].equalsIgnoreCase("input1MB")) {
            inputFilePath = DumpDataWriter.input1MB;
            fileSize = DumpDataWriter.size1MB;
        } else if (args[0].equalsIgnoreCase("input10MB")) {
            inputFilePath = DumpDataWriter.input10MB;
            fileSize = DumpDataWriter.size10MB;
        } else if (args[0].equalsIgnoreCase("input100MB")) {
            inputFilePath = DumpDataWriter.input100MB;
            fileSize = DumpDataWriter.size100MB;
        } else if (args[0].equalsIgnoreCase("input1000MB")) {
            inputFilePath = DumpDataWriter.input1000MB;
            fileSize = DumpDataWriter.size1000MB;
        } else {
            System.out.println("Invalid argument. Please use 1MB, 10MB, 100MB, or 1000MB.");
            return;
        }

        // Start measuring time
        StopWatch.start();

        // Reading the file using BufferedReader
        BufferedReader inputStream = new BufferedReader(new FileReader(inputFilePath));
        while (inputStream.read() != -1) {
            // Reading the file until the end
        }

        // Stop measuring time and print the result
        long duration = StopWatch.stop();
        System.out.println(duration + " milsec");

        // Close BufferedReader
        inputStream.close();
    }
}
