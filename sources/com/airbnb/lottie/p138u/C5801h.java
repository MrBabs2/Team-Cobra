package com.airbnb.lottie.p138u;

import android.util.JsonReader;
import com.airbnb.lottie.p133s.C5723b;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.u.h */
/* compiled from: DocumentDataParser */
public class C5801h implements C5806j0<C5723b> {

    /* renamed from: a */
    public static final C5801h f10472a = new C5801h();

    private C5801h() {
    }

    /* renamed from: a */
    public C5723b m11288a(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            char c = 65535;
            int hashCode = nextName.hashCode();
            if (hashCode != 102) {
                if (hashCode != 106) {
                    if (hashCode != 3261) {
                        if (hashCode != 3452) {
                            if (hashCode != 3463) {
                                if (hashCode != 3543) {
                                    if (hashCode != 3664) {
                                        if (hashCode != 3684) {
                                            if (hashCode != 3710) {
                                                if (hashCode != 115) {
                                                    if (hashCode == 116 && nextName.equals("t")) {
                                                        c = 0;
                                                    }
                                                } else if (nextName.equals("s")) {
                                                    c = 2;
                                                }
                                            } else if (nextName.equals("tr")) {
                                                c = 4;
                                            }
                                        } else if (nextName.equals("sw")) {
                                            c = 9;
                                        }
                                    } else if (nextName.equals("sc")) {
                                        c = 8;
                                    }
                                } else if (nextName.equals("of")) {
                                    c = 10;
                                }
                            } else if (nextName.equals("ls")) {
                                c = 6;
                            }
                        } else if (nextName.equals("lh")) {
                            c = 5;
                        }
                    } else if (nextName.equals("fc")) {
                        c = 7;
                    }
                } else if (nextName.equals("j")) {
                    c = 3;
                }
            } else if (nextName.equals("f")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    d = jsonReader.nextDouble();
                    break;
                case 3:
                    i = jsonReader.nextInt();
                    break;
                case 4:
                    i2 = jsonReader.nextInt();
                    break;
                case 5:
                    d2 = jsonReader.nextDouble();
                    break;
                case 6:
                    d3 = jsonReader.nextDouble();
                    break;
                case 7:
                    i3 = C5812p.m11304a(jsonReader);
                    break;
                case 8:
                    i4 = C5812p.m11304a(jsonReader);
                    break;
                case 9:
                    d4 = jsonReader.nextDouble();
                    break;
                case 10:
                    z = jsonReader.nextBoolean();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C5723b(str, str2, d, i, i2, d2, d3, i3, i4, d4, z);
    }
}
