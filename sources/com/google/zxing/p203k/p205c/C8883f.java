package com.google.zxing.p203k.p205c;

import com.google.zxing.p203k.p204b.C8872a;
import com.google.zxing.p203k.p204b.C8873b;
import com.google.zxing.p203k.p204b.C8874c;

/* renamed from: com.google.zxing.k.c.f */
/* compiled from: QRCode */
public final class C8883f {

    /* renamed from: a */
    private C8873b f25214a;

    /* renamed from: b */
    private C8872a f25215b;

    /* renamed from: c */
    private C8874c f25216c;

    /* renamed from: d */
    private int f25217d = -1;

    /* renamed from: e */
    private C8878b f25218e;

    /* renamed from: b */
    public static boolean m29059b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C8878b mo32686a() {
        return this.f25218e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f25214a);
        sb.append("\n ecLevel: ");
        sb.append(this.f25215b);
        sb.append("\n version: ");
        sb.append(this.f25216c);
        sb.append("\n maskPattern: ");
        sb.append(this.f25217d);
        if (this.f25218e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f25218e);
        }
        sb.append(">>\n");
        return sb.toString();
    }

    /* renamed from: a */
    public void mo32689a(C8873b bVar) {
        this.f25214a = bVar;
    }

    /* renamed from: a */
    public void mo32688a(C8872a aVar) {
        this.f25215b = aVar;
    }

    /* renamed from: a */
    public void mo32690a(C8874c cVar) {
        this.f25216c = cVar;
    }

    /* renamed from: a */
    public void mo32687a(int i) {
        this.f25217d = i;
    }

    /* renamed from: a */
    public void mo32691a(C8878b bVar) {
        this.f25218e = bVar;
    }
}
