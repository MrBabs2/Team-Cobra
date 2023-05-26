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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: com.google.gson.t.l.j */
/* compiled from: SqlDateTypeAdapter */
public final class C8757j extends C8688q<Date> {

    /* renamed from: b */
    public static final C8690r f24898b = new C8758a();

    /* renamed from: a */
    private final DateFormat f24899a = new SimpleDateFormat("MMM d, yyyy");

    /* renamed from: com.google.gson.t.l.j$a */
    /* compiled from: SqlDateTypeAdapter */
    static class C8758a implements C8690r {
        C8758a() {
        }

        /* renamed from: a */
        public <T> C8688q<T> mo32358a(C8668e eVar, C8805a<T> aVar) {
            if (aVar.getRawType() == Date.class) {
                return new C8757j();
            }
            return null;
        }
    }

    /* renamed from: a */
    public synchronized Date m28587a(C8691a aVar) throws IOException {
        if (aVar.peek() == C8693b.NULL) {
            aVar.mo32377x();
            return null;
        }
        try {
            return new Date(this.f24899a.parse(aVar.mo32378y()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* renamed from: a */
    public synchronized void mo32316a(C8694c cVar, Date date) throws IOException {
        cVar.mo32394e(date == null ? null : this.f24899a.format(date));
    }
}
