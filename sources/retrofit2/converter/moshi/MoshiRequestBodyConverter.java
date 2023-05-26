package retrofit2.converter.moshi;

import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8939o;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p413s.C12905f;
import p413s.C12909g;
import retrofit2.Converter;

final class MoshiRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.get("application/json; charset=UTF-8");
    private final C8924f<T> adapter;

    MoshiRequestBodyConverter(C8924f<T> fVar) {
        this.adapter = fVar;
    }

    public RequestBody convert(T t) throws IOException {
        C12905f fVar = new C12905f();
        this.adapter.toJson(C8939o.m29444a((C12909g) fVar), t);
        return RequestBody.create(MEDIA_TYPE, fVar.mo41179k());
    }
}
