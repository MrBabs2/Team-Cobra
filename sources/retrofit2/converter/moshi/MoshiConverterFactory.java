package retrofit2.converter.moshi;

import com.squareup.moshi.C4748h;
import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8952r;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;

public final class MoshiConverterFactory extends Converter.Factory {
    private final boolean failOnUnknown;
    private final boolean lenient;
    private final C8952r moshi;
    private final boolean serializeNulls;

    private MoshiConverterFactory(C8952r rVar, boolean z, boolean z2, boolean z3) {
        this.moshi = rVar;
        this.lenient = z;
        this.failOnUnknown = z2;
        this.serializeNulls = z3;
    }

    public static MoshiConverterFactory create() {
        return create(new C8952r.C8953a().mo32973a());
    }

    private static Set<? extends Annotation> jsonAnnotations(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(C4748h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : Collections.emptySet();
    }

    public MoshiConverterFactory asLenient() {
        return new MoshiConverterFactory(this.moshi, true, this.failOnUnknown, this.serializeNulls);
    }

    public MoshiConverterFactory failOnUnknown() {
        return new MoshiConverterFactory(this.moshi, this.lenient, true, this.serializeNulls);
    }

    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, Retrofit retrofit) {
        C8924f<T> a = this.moshi.mo32970a(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            a = a.lenient();
        }
        if (this.failOnUnknown) {
            a = a.failOnUnknown();
        }
        if (this.serializeNulls) {
            a = a.serializeNulls();
        }
        return new MoshiRequestBodyConverter(a);
    }

    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        C8924f<T> a = this.moshi.mo32970a(type, jsonAnnotations(annotationArr));
        if (this.lenient) {
            a = a.lenient();
        }
        if (this.failOnUnknown) {
            a = a.failOnUnknown();
        }
        if (this.serializeNulls) {
            a = a.serializeNulls();
        }
        return new MoshiResponseBodyConverter(a);
    }

    public MoshiConverterFactory withNullSerialization() {
        return new MoshiConverterFactory(this.moshi, this.lenient, this.failOnUnknown, true);
    }

    public static MoshiConverterFactory create(C8952r rVar) {
        if (rVar != null) {
            return new MoshiConverterFactory(rVar, false, false, false);
        }
        throw new NullPointerException("moshi == null");
    }
}
