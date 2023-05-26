package com.google.gson.p191t.p192l;

import com.google.gson.C8668e;
import com.google.gson.C8688q;
import com.google.gson.C8690r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p194u.C8805a;
import com.google.gson.stream.C8691a;
import com.google.gson.stream.C8693b;
import com.google.gson.stream.C8694c;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.t.l.k */
/* compiled from: TimeTypeAdapter */
public final class C8759k extends C8688q<Time> {

    /* renamed from: b */
    public static final C8690r f24900b = new C8760a();

    /* renamed from: a */
    private final DateFormat f24901a = new SimpleDateFormat("hh:mm:ss a");

    /* renamed from: com.google.gson.t.l.k$a */
    /* compiled from: TimeTypeAdapter */
    static class C8760a implements C8690r {
        C8760a() {
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            if (aVar.getRawType() == Time.class) {
                return new C8759k();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Time m28592a(C8691a aVar) throws IOException {
        if (aVar.peek() == C8693b.NULL) {
            aVar.mo32377x();
            return null;
        }
        try {
            return new Time(this.f24901a.parse(aVar.mo32378y()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo32316a(C8694c cVar, Time time) throws IOException {
        cVar.mo32394e(time == null ? null : this.f24901a.format(time));
    }
}
