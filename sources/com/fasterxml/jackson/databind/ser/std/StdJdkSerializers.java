package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

public class StdJdkSerializers {

    public static class AtomicBooleanSerializer extends StdScalarSerializer<AtomicBoolean> {
        public AtomicBooleanSerializer() {
            super(AtomicBoolean.class, false);
        }

        public void serialize(AtomicBoolean atomicBoolean, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
            jsonGenerator.writeBoolean(atomicBoolean.get());
        }
    }

    public static class AtomicIntegerSerializer extends StdScalarSerializer<AtomicInteger> {
        public AtomicIntegerSerializer() {
            super(AtomicInteger.class, false);
        }

        public void serialize(AtomicInteger atomicInteger, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
            jsonGenerator.writeNumber(atomicInteger.get());
        }
    }

    public static class AtomicLongSerializer extends StdScalarSerializer<AtomicLong> {
        public AtomicLongSerializer() {
            super(AtomicLong.class, false);
        }

        public void serialize(AtomicLong atomicLong, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
            jsonGenerator.writeNumber(atomicLong.get());
        }
    }

    public static Collection<Map.Entry<Class<?>, Object>> all() {
        HashMap hashMap = new HashMap();
        hashMap.put(URL.class, new ToStringSerializer(URL.class));
        hashMap.put(URI.class, new ToStringSerializer(URI.class));
        hashMap.put(Currency.class, new ToStringSerializer(Currency.class));
        hashMap.put(UUID.class, new UUIDSerializer());
        hashMap.put(Pattern.class, new ToStringSerializer(Pattern.class));
        hashMap.put(Locale.class, new ToStringSerializer(Locale.class));
        hashMap.put(AtomicBoolean.class, AtomicBooleanSerializer.class);
        hashMap.put(AtomicInteger.class, AtomicIntegerSerializer.class);
        hashMap.put(AtomicLong.class, AtomicLongSerializer.class);
        hashMap.put(File.class, FileSerializer.class);
        hashMap.put(Class.class, ClassSerializer.class);
        hashMap.put(Void.class, NullSerializer.instance);
        hashMap.put(Void.TYPE, NullSerializer.instance);
        try {
            hashMap.put(Timestamp.class, DateSerializer.instance);
            hashMap.put(Date.class, SqlDateSerializer.class);
            hashMap.put(Time.class, SqlTimeSerializer.class);
        } catch (NoClassDefFoundError unused) {
        }
        return hashMap.entrySet();
    }
}
