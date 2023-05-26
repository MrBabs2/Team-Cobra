package p413s;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: s.g */
/* compiled from: BufferedSink.kt */
public interface C12909g extends C12932y, WritableByteChannel {
    /* renamed from: a */
    long mo41135a(C12892a0 a0Var) throws IOException;

    /* renamed from: a */
    C12909g mo41142a(String str, int i, int i2) throws IOException;

    /* renamed from: b */
    C12909g mo41155b(String str) throws IOException;

    /* renamed from: c */
    C12909g mo41160c(long j) throws IOException;

    /* renamed from: c */
    C12909g mo41161c(C12911i iVar) throws IOException;

    /* renamed from: e */
    C12909g mo41164e() throws IOException;

    void flush() throws IOException;

    C12905f getBuffer();

    /* renamed from: h */
    C12909g mo41171h() throws IOException;

    /* renamed from: i */
    C12909g mo41175i(long j) throws IOException;

    C12909g write(byte[] bArr) throws IOException;

    C12909g write(byte[] bArr, int i, int i2) throws IOException;

    C12909g writeByte(int i) throws IOException;

    C12909g writeInt(int i) throws IOException;

    C12909g writeShort(int i) throws IOException;
}
