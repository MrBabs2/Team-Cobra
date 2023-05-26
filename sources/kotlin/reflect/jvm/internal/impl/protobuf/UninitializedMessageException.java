package kotlin.reflect.jvm.internal.impl.protobuf;

public class UninitializedMessageException extends RuntimeException {
    public UninitializedMessageException(C10449o oVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public InvalidProtocolBufferException mo35658a() {
        return new InvalidProtocolBufferException(getMessage());
    }
}
