package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.zzpo;

final class l20 {

    /* renamed from: A */
    private static final int f16048A = zzsy.m25292b("sosn");

    /* renamed from: B */
    private static final int f16049B = zzsy.m25292b("tvsh");

    /* renamed from: C */
    private static final int f16050C = zzsy.m25292b("----");

    /* renamed from: D */
    private static final String[] f16051D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f16052a = zzsy.m25292b("nam");

    /* renamed from: b */
    private static final int f16053b = zzsy.m25292b("trk");

    /* renamed from: c */
    private static final int f16054c = zzsy.m25292b("cmt");

    /* renamed from: d */
    private static final int f16055d = zzsy.m25292b("day");

    /* renamed from: e */
    private static final int f16056e = zzsy.m25292b("ART");

    /* renamed from: f */
    private static final int f16057f = zzsy.m25292b("too");

    /* renamed from: g */
    private static final int f16058g = zzsy.m25292b("alb");

    /* renamed from: h */
    private static final int f16059h = zzsy.m25292b("com");

    /* renamed from: i */
    private static final int f16060i = zzsy.m25292b("wrt");

    /* renamed from: j */
    private static final int f16061j = zzsy.m25292b("lyr");

    /* renamed from: k */
    private static final int f16062k = zzsy.m25292b("gen");

    /* renamed from: l */
    private static final int f16063l = zzsy.m25292b("covr");

    /* renamed from: m */
    private static final int f16064m = zzsy.m25292b("gnre");

    /* renamed from: n */
    private static final int f16065n = zzsy.m25292b("grp");

    /* renamed from: o */
    private static final int f16066o = zzsy.m25292b("disk");

    /* renamed from: p */
    private static final int f16067p = zzsy.m25292b("trkn");

    /* renamed from: q */
    private static final int f16068q = zzsy.m25292b("tmpo");

    /* renamed from: r */
    private static final int f16069r = zzsy.m25292b("cpil");

    /* renamed from: s */
    private static final int f16070s = zzsy.m25292b("aART");

    /* renamed from: t */
    private static final int f16071t = zzsy.m25292b("sonm");

    /* renamed from: u */
    private static final int f16072u = zzsy.m25292b("soal");

    /* renamed from: v */
    private static final int f16073v = zzsy.m25292b("soar");

    /* renamed from: w */
    private static final int f16074w = zzsy.m25292b("soaa");

    /* renamed from: x */
    private static final int f16075x = zzsy.m25292b("soco");

    /* renamed from: y */
    private static final int f16076y = zzsy.m25292b("rtng");

    /* renamed from: z */
    private static final int f16077z = zzsy.m25292b("pgap");

    /* renamed from: a */
    public static zzpo.zza m17472a(zzst zzst) {
        int b = zzst.mo29726b() + zzst.mo29730d();
        int d = zzst.mo29730d();
        int i = d >>> 24;
        zzpo.zza zza = null;
        if (i == 169 || i == 65533) {
            int i2 = 16777215 & d;
            if (i2 == f16054c) {
                int d2 = zzst.mo29730d();
                if (zzst.mo29730d() == a20.f14378q0) {
                    zzst.mo29729c(8);
                    String e = zzst.mo29733e(d2 - 16);
                    zza = new zzps("und", e, e);
                } else {
                    String valueOf = String.valueOf(a20.m16462c(d));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                zzst.mo29727b(b);
                return zza;
            }
            if (i2 != f16052a) {
                if (i2 != f16053b) {
                    if (i2 != f16059h) {
                        if (i2 != f16060i) {
                            if (i2 == f16055d) {
                                zzpw a = m17474a(d, "TDRC", zzst);
                                zzst.mo29727b(b);
                                return a;
                            } else if (i2 == f16056e) {
                                zzpw a2 = m17474a(d, "TPE1", zzst);
                                zzst.mo29727b(b);
                                return a2;
                            } else if (i2 == f16057f) {
                                zzpw a3 = m17474a(d, "TSSE", zzst);
                                zzst.mo29727b(b);
                                return a3;
                            } else if (i2 == f16058g) {
                                zzpw a4 = m17474a(d, "TALB", zzst);
                                zzst.mo29727b(b);
                                return a4;
                            } else if (i2 == f16061j) {
                                zzpw a5 = m17474a(d, "USLT", zzst);
                                zzst.mo29727b(b);
                                return a5;
                            } else if (i2 == f16062k) {
                                zzpw a6 = m17474a(d, "TCON", zzst);
                                zzst.mo29727b(b);
                                return a6;
                            } else if (i2 == f16065n) {
                                zzpw a7 = m17474a(d, "TIT1", zzst);
                                zzst.mo29727b(b);
                                return a7;
                            }
                        }
                    }
                    zzpw a8 = m17474a(d, "TCOM", zzst);
                    zzst.mo29727b(b);
                    return a8;
                }
            }
            zzpw a9 = m17474a(d, "TIT2", zzst);
            zzst.mo29727b(b);
            return a9;
        }
        try {
            if (d == f16064m) {
                int b2 = m17475b(zzst);
                String str = (b2 <= 0 || b2 > f16051D.length) ? null : f16051D[b2 - 1];
                if (str != null) {
                    zza = new zzpw("TCON", (String) null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return zza;
            } else if (d == f16066o) {
                zzpw b3 = m17476b(d, "TPOS", zzst);
                zzst.mo29727b(b);
                return b3;
            } else if (d == f16067p) {
                zzpw b4 = m17476b(d, "TRCK", zzst);
                zzst.mo29727b(b);
                return b4;
            } else if (d == f16068q) {
                zzpv a10 = m17473a(d, "TBPM", zzst, true, false);
                zzst.mo29727b(b);
                return a10;
            } else if (d == f16069r) {
                zzpv a11 = m17473a(d, "TCMP", zzst, true, true);
                zzst.mo29727b(b);
                return a11;
            } else if (d == f16063l) {
                int d3 = zzst.mo29730d();
                if (zzst.mo29730d() == a20.f14378q0) {
                    int a12 = a20.m16460a(zzst.mo29730d());
                    String str2 = a12 == 13 ? "image/jpeg" : a12 == 14 ? "image/png" : null;
                    if (str2 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(a12);
                        Log.w("MetadataUtil", sb.toString());
                    } else {
                        zzst.mo29729c(4);
                        int i3 = d3 - 16;
                        byte[] bArr = new byte[i3];
                        zzst.mo29725a(bArr, 0, i3);
                        zza = new zzpq(str2, (String) null, 3, bArr);
                    }
                } else {
                    Log.w("MetadataUtil", "Failed to parse cover art attribute");
                }
                zzst.mo29727b(b);
                return zza;
            } else if (d == f16070s) {
                zzpw a13 = m17474a(d, "TPE2", zzst);
                zzst.mo29727b(b);
                return a13;
            } else if (d == f16071t) {
                zzpw a14 = m17474a(d, "TSOT", zzst);
                zzst.mo29727b(b);
                return a14;
            } else if (d == f16072u) {
                zzpw a15 = m17474a(d, "TSO2", zzst);
                zzst.mo29727b(b);
                return a15;
            } else if (d == f16073v) {
                zzpw a16 = m17474a(d, "TSOA", zzst);
                zzst.mo29727b(b);
                return a16;
            } else if (d == f16074w) {
                zzpw a17 = m17474a(d, "TSOP", zzst);
                zzst.mo29727b(b);
                return a17;
            } else if (d == f16075x) {
                zzpw a18 = m17474a(d, "TSOC", zzst);
                zzst.mo29727b(b);
                return a18;
            } else if (d == f16076y) {
                zzpv a19 = m17473a(d, "ITUNESADVISORY", zzst, false, false);
                zzst.mo29727b(b);
                return a19;
            } else if (d == f16077z) {
                zzpv a20 = m17473a(d, "ITUNESGAPLESS", zzst, false, true);
                zzst.mo29727b(b);
                return a20;
            } else if (d == f16048A) {
                zzpw a21 = m17474a(d, "TVSHOWSORT", zzst);
                zzst.mo29727b(b);
                return a21;
            } else if (d == f16049B) {
                zzpw a22 = m17474a(d, "TVSHOW", zzst);
                zzst.mo29727b(b);
                return a22;
            } else if (d == f16050C) {
                String str3 = null;
                String str4 = null;
                int i4 = -1;
                int i5 = -1;
                while (zzst.mo29726b() < b) {
                    int b5 = zzst.mo29726b();
                    int d4 = zzst.mo29730d();
                    int d5 = zzst.mo29730d();
                    zzst.mo29729c(4);
                    if (d5 == a20.f14374o0) {
                        str3 = zzst.mo29733e(d4 - 12);
                    } else if (d5 == a20.f14376p0) {
                        str4 = zzst.mo29733e(d4 - 12);
                    } else {
                        if (d5 == a20.f14378q0) {
                            i4 = b5;
                            i5 = d4;
                        }
                        zzst.mo29729c(d4 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str3) && "iTunSMPB".equals(str4)) {
                    if (i4 != -1) {
                        zzst.mo29727b(i4);
                        zzst.mo29729c(16);
                        zza = new zzps("und", str4, zzst.mo29733e(i5 - 16));
                    }
                }
                zzst.mo29727b(b);
                return zza;
            }
        } finally {
            zzst.mo29727b(b);
        }
        String valueOf2 = String.valueOf(a20.m16462c(d));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        zzst.mo29727b(b);
        return null;
    }

    /* renamed from: b */
    private static zzpw m17476b(int i, String str, zzst zzst) {
        int d = zzst.mo29730d();
        if (zzst.mo29730d() == a20.f14378q0 && d >= 22) {
            zzst.mo29729c(10);
            int h = zzst.mo29736h();
            if (h > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(h);
                String sb2 = sb.toString();
                int h2 = zzst.mo29736h();
                if (h2 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(h2);
                    sb2 = sb3.toString();
                }
                return new zzpw(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(a20.m16462c(i));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    /* renamed from: b */
    private static int m17475b(zzst zzst) {
        zzst.mo29729c(4);
        if (zzst.mo29730d() == a20.f14378q0) {
            zzst.mo29729c(8);
            return zzst.mo29735g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: a */
    private static zzpw m17474a(int i, String str, zzst zzst) {
        int d = zzst.mo29730d();
        if (zzst.mo29730d() == a20.f14378q0) {
            zzst.mo29729c(8);
            return new zzpw(str, (String) null, zzst.mo29733e(d - 16));
        }
        String valueOf = String.valueOf(a20.m16462c(i));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    /* renamed from: a */
    private static zzpv m17473a(int i, String str, zzst zzst, boolean z, boolean z2) {
        int b = m17475b(zzst);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            String valueOf = String.valueOf(a20.m16462c(i));
            Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
            return null;
        } else if (z) {
            return new zzpw(str, (String) null, Integer.toString(b));
        } else {
            return new zzps("und", str, Integer.toString(b));
        }
    }
}
