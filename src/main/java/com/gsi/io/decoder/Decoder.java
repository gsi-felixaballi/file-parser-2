package com.gsi.io.decoder;

import com.gsi.model.Expression;
import com.gsi.util.DataFormat;

import java.util.List;

public interface Decoder<T> {
    List<T> decode(Expression expression, DataFormat[] format);
}
