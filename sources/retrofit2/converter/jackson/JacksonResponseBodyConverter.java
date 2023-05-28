package retrofit2.converter.jackson;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Converter;

final class JacksonResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private final ObjectReader adapter;

    JacksonResponseBodyConverter(ObjectReader objectReader) {
        this.adapter = objectReader;
    }

    public T convert(ResponseBody responseBody) throws IOException {
        try {
            return this.adapter.readValue(responseBody.charStream());
        } finally {
            responseBody.close();
        }
    }
}
