package com.example;

public class Utvonal {
    Integer id;
    Double length;
    Integer difficulty;
    String start;
    String destination;

        public Utvonal() {}

        public Utvonal(Double length, Integer difficulty, String start, String destination) {
        this.length = length;
        this.difficulty = difficulty;
        this.start = start;
        this.destination = destination;
        }

        public int getId() {
        return id;
        }

        public void setId(int id) {
        this.id = id;
        }

        public Double getLength() {
        return length;
        }

        public void setLength(Double length) {
        this.length = length;
        }

        public Integer getDifficulty() {
        return difficulty;
        }

        public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
        }

        public String getStart() {
        return start;
        }

        public void setStart(String start) {
        this.start = start;
        }

        public String getDestination() {
        return destination;
        }

        public void setDestination(String destination) {        
        this.destination = destination;
        }
    

}
   
