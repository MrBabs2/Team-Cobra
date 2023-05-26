package com.google.ads.mediation;

import com.google.android.gms.internal.ads.zzbad;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class MediationServerParameters {

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: com.google.ads.mediation.MediationServerParameters$a */
    public @interface C4739a {
        String name();

        boolean required() default true;
    }

    public static final class MappingException extends Exception {
        public MappingException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public void mo23786a(Map<String, String> map) throws MappingException {
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            C4739a aVar = (C4739a) field.getAnnotation(C4739a.class);
            if (aVar != null) {
                hashMap.put(aVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            zzbad.m20523d("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry next : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(next.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, next.getValue());
                } catch (IllegalAccessException unused) {
                    String str = (String) next.getKey();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 49);
                    sb.append("Server option \"");
                    sb.append(str);
                    sb.append("\" could not be set: Illegal Access");
                    zzbad.m20523d(sb.toString());
                } catch (IllegalArgumentException unused2) {
                    String str2 = (String) next.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 43);
                    sb2.append("Server option \"");
                    sb2.append(str2);
                    sb2.append("\" could not be set: Bad Type");
                    zzbad.m20523d(sb2.toString());
                }
            } else {
                String str3 = (String) next.getKey();
                String str4 = (String) next.getValue();
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 31 + String.valueOf(str4).length());
                sb3.append("Unexpected server option: ");
                sb3.append(str3);
                sb3.append(" = \"");
                sb3.append(str4);
                sb3.append("\"");
                zzbad.m20516a(sb3.toString());
            }
        }
        StringBuilder sb4 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((C4739a) field3.getAnnotation(C4739a.class)).required()) {
                String valueOf = String.valueOf(((C4739a) field3.getAnnotation(C4739a.class)).name());
                zzbad.m20523d(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb4.length() > 0) {
                    sb4.append(", ");
                }
                sb4.append(((C4739a) field3.getAnnotation(C4739a.class)).name());
            }
        }
        if (sb4.length() > 0) {
            String valueOf2 = String.valueOf(sb4.toString());
            throw new MappingException(valueOf2.length() != 0 ? "Required server option(s) missing: ".concat(valueOf2) : new String("Required server option(s) missing: "));
        }
    }
}
