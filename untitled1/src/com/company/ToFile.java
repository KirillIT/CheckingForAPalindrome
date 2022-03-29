package com.company;

import java.io.File;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

public class ToFile {

    public void ToFile(Stack stack, String path) {

        File file = new File(path);

        PrintWriter pw = null;

        try {

            pw = new PrintWriter(file);

        }

        catch (FileNotFoundException ex) {

            ex.printStackTrace();

        }

        int size = stack.size();

        for (int i = 0; i < size; i++) {

            assert pw != null;

            pw.print(stack.get() + " ");

            stack.pop();

        }

        assert pw != null;

        pw.close();

    }
}
