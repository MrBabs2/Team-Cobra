package retrofit2;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

abstract class ParameterHandler<T> {

    static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final Method method;

        /* renamed from: p */
        private final int f32197p;

        Body(Method method2, int i, Converter<T, RequestBody> converter2) {
            this.method = method2;
            this.f32197p = i;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.setBody(this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.f32197p;
                    throw Utils.parameterError(method2, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw Utils.parameterError(this.method, this.f32197p, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Field(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) C4758i.m7802a(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addFormField(this.name, convert, this.encoded);
            }
        }
    }

    static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p */
        private final int f32198p;
        private final Converter<T, String> valueConverter;

        FieldMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f32198p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addFormField(str, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.f32198p;
                                throw Utils.parameterError(method2, i, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.f32198p;
                            throw Utils.parameterError(method3, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f32198p, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f32198p, "Field map was null.", new Object[0]);
        }
    }

    static final class Header<T> extends ParameterHandler<T> {
        private final String name;
        private final Converter<T, String> valueConverter;

        Header(String str, Converter<T, String> converter) {
            this.name = (String) C4758i.m7802a(str, "name == null");
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addHeader(this.name, convert);
            }
        }
    }

    static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p */
        private final int f32199p;
        private final Converter<T, String> valueConverter;

        HeaderMap(Method method2, int i, Converter<T, String> converter) {
            this.method = method2;
            this.f32199p = i;
            this.valueConverter = converter;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            requestBuilder.addHeader(str, this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.f32199p;
                            throw Utils.parameterError(method2, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f32199p, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f32199p, "Header map was null.", new Object[0]);
        }
    }

    static final class Headers extends ParameterHandler<okhttp3.Headers> {
        private final Method method;

        /* renamed from: p */
        private final int f32200p;

        Headers(Method method2, int i) {
            this.method = method2;
            this.f32200p = i;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, okhttp3.Headers headers) {
            if (headers != null) {
                requestBuilder.addHeaders(headers);
                return;
            }
            throw Utils.parameterError(this.method, this.f32200p, "Headers parameter must not be null.", new Object[0]);
        }
    }

    static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, RequestBody> converter;
        private final okhttp3.Headers headers;
        private final Method method;

        /* renamed from: p */
        private final int f32201p;

        Part(Method method2, int i, okhttp3.Headers headers2, Converter<T, RequestBody> converter2) {
            this.method = method2;
            this.f32201p = i;
            this.headers = headers2;
            this.converter = converter2;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) {
            if (t != null) {
                try {
                    requestBuilder.addPart(this.headers, this.converter.convert(t));
                } catch (IOException e) {
                    Method method2 = this.method;
                    int i = this.f32201p;
                    throw Utils.parameterError(method2, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p */
        private final int f32202p;
        private final String transferEncoding;
        private final Converter<T, RequestBody> valueConverter;

        PartMap(Method method2, int i, Converter<T, RequestBody> converter, String str) {
            this.method = method2;
            this.f32202p = i;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            requestBuilder.addPart(okhttp3.Headers.m40708of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
                        } else {
                            Method method2 = this.method;
                            int i = this.f32202p;
                            throw Utils.parameterError(method2, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f32202p, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f32202p, "Part map was null.", new Object[0]);
        }
    }

    static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p */
        private final int f32203p;
        private final Converter<T, String> valueConverter;

        Path(Method method2, int i, String str, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f32203p = i;
            this.name = (String) C4758i.m7802a(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addPathParam(this.name, this.valueConverter.convert(t), this.encoded);
                return;
            }
            Method method2 = this.method;
            int i = this.f32203p;
            throw Utils.parameterError(method2, i, "Path parameter \"" + this.name + "\" value must not be null.", new Object[0]);
        }
    }

    static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        Query(String str, Converter<T, String> converter, boolean z) {
            this.name = (String) C4758i.m7802a(str, "name == null");
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) throws IOException {
            String convert;
            if (t != null && (convert = this.valueConverter.convert(t)) != null) {
                requestBuilder.addQueryParam(this.name, convert, this.encoded);
            }
        }
    }

    static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p */
        private final int f32204p;
        private final Converter<T, String> valueConverter;

        QueryMap(Method method2, int i, Converter<T, String> converter, boolean z) {
            this.method = method2;
            this.f32204p = i;
            this.valueConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String convert = this.valueConverter.convert(value);
                            if (convert != null) {
                                requestBuilder.addQueryParam(str, convert, this.encoded);
                            } else {
                                Method method2 = this.method;
                                int i = this.f32204p;
                                throw Utils.parameterError(method2, i, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method3 = this.method;
                            int i2 = this.f32204p;
                            throw Utils.parameterError(method3, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw Utils.parameterError(this.method, this.f32204p, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw Utils.parameterError(this.method, this.f32204p, "Query map was null", new Object[0]);
        }
    }

    static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        QueryName(Converter<T, String> converter, boolean z) {
            this.nameConverter = converter;
            this.encoded = z;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) throws IOException {
            if (t != null) {
                requestBuilder.addQueryParam(this.nameConverter.convert(t), (String) null, this.encoded);
            }
        }
    }

    static final class RawPart extends ParameterHandler<MultipartBody.Part> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, MultipartBody.Part part) {
            if (part != null) {
                requestBuilder.addPart(part);
            }
        }
    }

    static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p */
        private final int f32205p;

        RelativeUrl(Method method2, int i) {
            this.method = method2;
            this.f32205p = i;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj != null) {
                requestBuilder.setRelativeUrl(obj);
                return;
            }
            throw Utils.parameterError(this.method, this.f32205p, "@Url parameter is null.", new Object[0]);
        }
    }

    static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        Tag(Class<T> cls2) {
            this.cls = cls2;
        }

        /* access modifiers changed from: package-private */
        public void apply(RequestBuilder requestBuilder, T t) {
            requestBuilder.addTag(this.cls, t);
        }
    }

    ParameterHandler() {
    }

    /* access modifiers changed from: package-private */
    public abstract void apply(RequestBuilder requestBuilder, T t) throws IOException;

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() {
            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        ParameterHandler.this.apply(requestBuilder, Array.get(obj, i));
                    }
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() {
            /* access modifiers changed from: package-private */
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T apply : iterable) {
                        ParameterHandler.this.apply(requestBuilder, apply);
                    }
                }
            }
        };
    }
}
