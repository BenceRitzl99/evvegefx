package com.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public void writeToFile(String length, String difficulty, String start, String destination) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("turak.txt", true))) {
            writer.write("Length: " + length);
            writer.newLine();
            writer.write("Difficulty: " + difficulty);
            writer.newLine();
            writer.write("Start: " + start);
            writer.newLine();
            writer.write("Destination: " + destination);
            writer.newLine();
            writer.write("\n");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}