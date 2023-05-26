package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.b */
/* compiled from: AbstractParser */
public abstract class C10413b<MessageType extends C10449o> implements C10452q<MessageType> {
    static {
        C10422f.m35296a();
    }

    /* renamed from: c */
    public MessageType mo35669c(InputStream inputStream, C10422f fVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return mo35670d(new C10410a.C10411a.C10412a(inputStream, C10420e.m35250a(read, inputStream)), fVar);
        } catch (IOException e) {
            throw new InvalidProtocolBufferException(e.getMessage());
        }
    }

    /* renamed from: d */
    public MessageType mo35670d(InputStream inputStream, C10422f fVar) throws InvalidProtocolBufferException {
        C10420e a = C10420e.m35252a(inputStream);
        MessageType messagetype = (C10449o) mo34369a(a, fVar);
        try {
            a.mo35703a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.mo35656a(messagetype);
            throw e;
        }
    }

    /* renamed from: b */
    private UninitializedMessageException m35211b(MessageType messagetype) {
        if (messagetype instanceof C10410a) {
            return ((C10410a) messagetype).mo35660d();
        }
        return new UninitializedMessageException(messagetype);
    }

    /* renamed from: a */
    private MessageType m35210a(MessageType messagetype) throws InvalidProtocolBufferException {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        InvalidProtocolBufferException a = m35211b(messagetype).mo35658a();
        a.mo35656a(messagetype);
        throw a;
    }

    /* renamed from: a */
    public MessageType m35215a(C10417d dVar, C10422f fVar) throws InvalidProtocolBufferException {
        MessageType b = mo35668b(dVar, fVar);
        m35210a(b);
        return b;
    }

    /* renamed from: b */
    public MessageType mo35668b(C10417d dVar, C10422f fVar) throws InvalidProtocolBufferException {
        MessageType messagetype;
        try {
            C10420e d = dVar.mo35690d();
            messagetype = (C10449o) mo34369a(d, fVar);
            d.mo35703a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e) {
            e.mo35656a(messagetype);
            throw e;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public MessageType m35214a(InputStream inputStream, C10422f fVar) throws InvalidProtocolBufferException {
        MessageType d = mo35670d(inputStream, fVar);
        m35210a(d);
        return d;
    }

    /* renamed from: b */
    public MessageType m35217b(InputStream inputStream, C10422f fVar) throws InvalidProtocolBufferException {
        MessageType c = mo35669c(inputStream, fVar);
        m35210a(c);
        return c;
    }
}
