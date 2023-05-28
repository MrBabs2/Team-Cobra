package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.xz */
class C8157xz {

    /* renamed from: A */
    public static final int f17214A = zzkq.m24691b("frma");

    /* renamed from: B */
    public static final int f17215B = zzkq.m24691b("pasp");

    /* renamed from: C */
    public static final int f17216C = zzkq.m24691b("TTML");

    /* renamed from: D */
    public static final int f17217D = zzkq.m24691b("vmhd");

    /* renamed from: E */
    public static final int f17218E = zzkq.m24691b("smhd");

    /* renamed from: F */
    public static final int f17219F = zzkq.m24691b("mp4v");

    /* renamed from: G */
    public static final int f17220G = zzkq.m24691b("stts");

    /* renamed from: H */
    public static final int f17221H = zzkq.m24691b("stss");

    /* renamed from: I */
    public static final int f17222I = zzkq.m24691b("ctts");

    /* renamed from: J */
    public static final int f17223J = zzkq.m24691b("stsc");

    /* renamed from: K */
    public static final int f17224K = zzkq.m24691b("stsz");

    /* renamed from: L */
    public static final int f17225L = zzkq.m24691b("stco");

    /* renamed from: M */
    public static final int f17226M = zzkq.m24691b("co64");

    /* renamed from: b */
    public static final int f17227b = zzkq.m24691b("avc1");

    /* renamed from: c */
    public static final int f17228c = zzkq.m24691b("avc3");

    /* renamed from: d */
    public static final int f17229d = zzkq.m24691b("esds");

    /* renamed from: e */
    public static final int f17230e = zzkq.m24691b("mp4a");

    /* renamed from: f */
    public static final int f17231f = zzkq.m24691b("ac-3");

    /* renamed from: g */
    public static final int f17232g = zzkq.m24691b("dac3");

    /* renamed from: h */
    public static final int f17233h = zzkq.m24691b("ec-3");

    /* renamed from: i */
    public static final int f17234i = zzkq.m24691b("dec3");

    /* renamed from: j */
    public static final int f17235j = zzkq.m24691b("moov");

    /* renamed from: k */
    public static final int f17236k = zzkq.m24691b("mvhd");

    /* renamed from: l */
    public static final int f17237l = zzkq.m24691b("trak");

    /* renamed from: m */
    public static final int f17238m = zzkq.m24691b("mdia");

    /* renamed from: n */
    public static final int f17239n = zzkq.m24691b("minf");

    /* renamed from: o */
    public static final int f17240o = zzkq.m24691b("stbl");

    /* renamed from: p */
    public static final int f17241p = zzkq.m24691b("avcC");

    /* renamed from: q */
    public static final int f17242q = zzkq.m24691b("tkhd");

    /* renamed from: r */
    public static final int f17243r = zzkq.m24691b("mdhd");

    /* renamed from: s */
    public static final int f17244s = zzkq.m24691b("hdlr");

    /* renamed from: t */
    public static final int f17245t = zzkq.m24691b("stsd");

    /* renamed from: u */
    public static final int f17246u = zzkq.m24691b("sinf");

    /* renamed from: v */
    public static final int f17247v = zzkq.m24691b("schm");

    /* renamed from: w */
    public static final int f17248w = zzkq.m24691b("schi");

    /* renamed from: x */
    public static final int f17249x = zzkq.m24691b("tenc");

    /* renamed from: y */
    public static final int f17250y = zzkq.m24691b("encv");

    /* renamed from: z */
    public static final int f17251z = zzkq.m24691b("enca");

    /* renamed from: a */
    public final int f17252a;

    static {
        zzkq.m24691b("ftyp");
        zzkq.m24691b("mdat");
        zzkq.m24691b("tfdt");
        zzkq.m24691b("tfhd");
        zzkq.m24691b("trex");
        zzkq.m24691b("trun");
        zzkq.m24691b("sidx");
        zzkq.m24691b("moof");
        zzkq.m24691b("traf");
        zzkq.m24691b("mvex");
        zzkq.m24691b("pssh");
        zzkq.m24691b("saiz");
        zzkq.m24691b("uuid");
        zzkq.m24691b("senc");
    }

    C8157xz(int i) {
        this.f17252a = i;
    }

    /* renamed from: a */
    public static int m18480a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m18481b(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i >> 24));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m18481b(this.f17252a);
    }
}
