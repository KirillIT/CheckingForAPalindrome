package com.company;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class FromFile {

    public Stack FromFile(String Path) {

        File file = new File(Path);

        Scanner scanner = null;

        Stack stack = new Stack();

        try {

            scanner = new Scanner(file);

        }

        catch (FileNotFoundException ex) {

            System.out.println("Error: 0");

            System.exit(0);

        }

        String[] s;

        String line;

        line = scanner.nextLine();

        s = line.split(" ");

        for (String number : s) {

            stack.push(number.toCharArray()[0]);

        }

        return stack;

    }
}
