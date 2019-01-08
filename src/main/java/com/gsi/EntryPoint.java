package com.gsi;

import com.gsi.exception.ExceptionTypes;
import com.gsi.io.factory.ProcessorFactory;

import java.io.IOException;
import java.util.List;

public class EntryPoint {
    private final static int ARGS_LEN = 3;

    public static void main(String[] args) throws IOException {

        while (args.length < ARGS_LEN) {
            System.out.println(ExceptionTypes.MISSING_CONFIGURATION);
            return;
        }

        List output = ProcessorFactory.from(args).create();
        System.out.println(output);
    }
}
