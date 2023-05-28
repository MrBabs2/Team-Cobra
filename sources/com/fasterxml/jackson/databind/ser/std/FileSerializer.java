package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.File;
import java.io.IOException;

public class FileSerializer extends StdScalarSerializer<File> {
    public FileSerializer() {
        super(File.class);
    }

    public void serialize(File file, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(file.getAbsolutePath());
    }
}
