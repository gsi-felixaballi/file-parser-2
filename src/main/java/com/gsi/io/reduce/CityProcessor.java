package com.gsi.io.reduce;

import com.gsi.io.decoder.Decoder;
import com.gsi.model.Expression;
import com.gsi.util.DataFormat;

import java.util.List;

public class CityProcessor implements FileProcessor {

    private final String file;
    private final String personId;

    public CityProcessor(String file, String personId) {
        this.file = file;
        this.personId = personId;
    }

    public String getFile() {
        return file;
    }

    public String getPersonId() {
        return personId;
    }

    @Override
    public List process(Expression expression, Decoder decoder, DataFormat[] formats) {
        return decoder.decode(expression, formats);
    }
}
