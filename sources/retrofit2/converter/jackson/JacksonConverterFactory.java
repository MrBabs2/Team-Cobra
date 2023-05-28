package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public final class JacksonConverterFactory extends Converter.Factory {
    private final ObjectMapper mapper;

    private JacksonConverterFactory(ObjectMapper objectMapper) {
        this.mapper = objectMapper;
    }

    public static JacksonConverterFactory create() {
        return create(new ObjectMapper());
    }

    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        return new JacksonRequestBodyConverter(this.mapper.writerFor(this.mapper.getTypeFactory().constructType(type)));
    }

    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        return new JacksonResponseBodyConverter(this.mapper.readerFor(this.mapper.getTypeFactory().constructType(type)));
    }

    public static JacksonConverterFactory create(ObjectMapper objectMapper) {
        if (objectMapper != null) {
            return new JacksonConverterFactory(objectMapper);
        }
        throw new NullPointerException("mapper == null");
    }
}
