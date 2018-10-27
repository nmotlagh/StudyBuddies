package com.studybuddies.studybuddies;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataAccesser {
    private final String USER_PASS = "user-pass.txt";
    private PrintWriter output;
    public DataWriter(){
        try {
            this.output = new PrintWriter(new BufferedWriter(new FileWriter(USER_PASS)));
        }catch(IOException e){
            sys.err.print("Could not open file\n");

        }

    }

    public void addPass(String username, String password){
        this.output.print(username+"\t"+password);
    }


}
