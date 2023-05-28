package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzdok extends IOException {
    public zzdok(String str) {
        super(str);
    }

    /* renamed from: a */
    static zzdok m24047a() {
        return new zzdok("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static zzdok m24048b() {
        return new zzdok("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static zzdok m24049c() {
        return new zzdok("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: d */
    static zzdok m24050d() {
        return new zzdok("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: e */
    static zzdok m24051e() {
        return new zzdok("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: f */
    static zzdol m24052f() {
        return new zzdol("Protocol message tag had invalid wire type.");
    }

    /* renamed from: g */
    static zzdok m24053g() {
        return new zzdok("Failed to parse the message.");
    }

    /* renamed from: h */
    static zzdok m24054h() {
        return new zzdok("Protocol message had invalid UTF-8.");
    }

    /* renamed from: a */
    public final zzdok mo29144a(zzdpk zzdpk) {
        return this;
    }
}
