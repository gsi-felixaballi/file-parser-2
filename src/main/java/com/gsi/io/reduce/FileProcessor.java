package com.gsi.io.reduce;

import com.gsi.io.decoder.Decoder;
import com.gsi.model.Expression;
import com.gsi.util.DataFormat;

import java.util.List;

public interface FileProcessor {

    List process(Expression expression, Decoder decoder, DataFormat[] formats);
}
