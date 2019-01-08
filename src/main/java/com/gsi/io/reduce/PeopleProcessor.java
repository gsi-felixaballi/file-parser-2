package com.gsi.io.reduce;

import com.gsi.io.decoder.Decoder;
import com.gsi.model.Expression;
import com.gsi.util.DataFormat;

import java.util.List;

public class PeopleProcessor implements FileProcessor {

    private final String file;
    private final String city;

    public PeopleProcessor(String file, String city) {
        this.file = file;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public List process(Expression expression, Decoder decoder, DataFormat[] formats) {
        return decoder.decode(expression, formats);
    }
}
