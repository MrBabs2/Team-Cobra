package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.C6022f;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {

    /* renamed from: k */
    private static final StackTraceElement[] f10785k = new StackTraceElement[0];

    /* renamed from: f */
    private final List<Throwable> f10786f;

    /* renamed from: g */
    private C6022f f10787g;

    /* renamed from: h */
    private C5901a f10788h;

    /* renamed from: i */
    private Class<?> f10789i;

    /* renamed from: j */
    private String f10790j;

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20070a(C6022f fVar, C5901a aVar) {
        mo20071a(fVar, aVar, (Class<?>) null);
    }

    /* renamed from: a */
    public void mo20072a(Exception exc) {
    }

    /* renamed from: b */
    public List<Throwable> mo20074b() {
        ArrayList arrayList = new ArrayList();
        m11678a((Throwable) this, (List<Throwable>) arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f10790j);
        String str3 = "";
        if (this.f10789i != null) {
            str = ", " + this.f10789i;
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.f10788h != null) {
            str2 = ", " + this.f10788h;
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.f10787g != null) {
            str3 = ", " + this.f10787g;
        }
        sb.append(str3);
        List<Throwable> b = mo20074b();
        if (b.isEmpty()) {
            return sb.toString();
        }
        if (b.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(b.size());
            sb.append(" causes:");
        }
        for (Throwable next : b) {
            sb.append(10);
            sb.append(next.getClass().getName());
            sb.append('(');
            sb.append(next.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo20071a(C6022f fVar, C5901a aVar, Class<?> cls) {
        this.f10787g = fVar;
        this.f10788h = aVar;
        this.f10789i = cls;
    }

    public void printStackTrace(PrintStream printStream) {
        m11676a((Appendable) printStream);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f10790j = str;
        setStackTrace(f10785k);
        this.f10786f = list;
    }

    /* renamed from: b */
    private static void m11680b(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m11676a(appendable);
            } else {
                m11677a(th, appendable);
            }
            i = i2;
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        m11676a((Appendable) printWriter);
    }

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C5906a implements Appendable {

        /* renamed from: f */
        private final Appendable f10791f;

        /* renamed from: g */
        private boolean f10792g = true;

        C5906a(Appendable appendable) {
            this.f10791f = appendable;
        }

        /* renamed from: a */
        private CharSequence m11687a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.f10792g) {
                this.f10792g = false;
                this.f10791f.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.f10792g = z;
            this.f10791f.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a = m11687a(charSequence);
            append(a, 0, a.length());
            return this;
        }

        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a = m11687a(charSequence);
            boolean z = false;
            if (this.f10792g) {
                this.f10792g = false;
                this.f10791f.append("  ");
            }
            if (a.length() > 0 && a.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.f10792g = z;
            this.f10791f.append(a, i, i2);
            return this;
        }
    }

    /* renamed from: a */
    public List<Throwable> mo20069a() {
        return this.f10786f;
    }

    /* renamed from: a */
    public void mo20073a(String str) {
        List<Throwable> b = mo20074b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), b.get(i));
            i = i2;
        }
    }

    /* renamed from: a */
    private void m11678a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).mo20069a()) {
                m11678a(a, list);
            }
            return;
        }
        list.add(th);
    }

    /* renamed from: a */
    private void m11676a(Appendable appendable) {
        m11677a((Throwable) this, appendable);
        m11679a(mo20069a(), (Appendable) new C5906a(appendable));
    }

    /* renamed from: a */
    private static void m11677a(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    private static void m11679a(List<Throwable> list, Appendable appendable) {
        try {
            m11680b(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
