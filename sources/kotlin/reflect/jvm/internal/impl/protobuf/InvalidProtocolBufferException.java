package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {

    /* renamed from: f */
    private C10449o f28208f = null;

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: b */
    static InvalidProtocolBufferException m35193b() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: c */
    static InvalidProtocolBufferException m35194c() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static InvalidProtocolBufferException m35195d() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: e */
    static InvalidProtocolBufferException m35196e() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: f */
    static InvalidProtocolBufferException m35197f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: g */
    static InvalidProtocolBufferException m35198g() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: h */
    static InvalidProtocolBufferException m35199h() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: i */
    static InvalidProtocolBufferException m35200i() {
        return new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* renamed from: j */
    static InvalidProtocolBufferException m35201j() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: a */
    public InvalidProtocolBufferException mo35656a(C10449o oVar) {
        this.f28208f = oVar;
        return this;
    }

    /* renamed from: a */
    public C10449o mo35657a() {
        return this.f28208f;
    }
}
