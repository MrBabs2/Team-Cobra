package retrofit2.converter.moshi;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.JsonDataException;
import java.io.IOException;
import okhttp3.ResponseBody;
import p413s.C12910h;
import p413s.C12911i;
import retrofit2.Converter;

final class MoshiResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    private static final C12911i UTF8_BOM = C12911i.m41632c("EFBBBF");
    private final C8924f<T> adapter;

    MoshiResponseBodyConverter(C8924f<T> fVar) {
        this.adapter = fVar;
    }

    public T convert(ResponseBody responseBody) throws IOException {
        C12910h source = responseBody.source();
        try {
            if (source.mo41150a(0, UTF8_BOM)) {
                source.skip((long) UTF8_BOM.mo41239s());
            }
            C8930i a = C8930i.m29333a(source);
            T fromJson = this.adapter.fromJson(a);
            if (a.peek() == C8930i.C8932b.END_DOCUMENT) {
                return fromJson;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}
