package p413s;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: s.h */
/* compiled from: BufferedSource.kt */
public interface C12910h extends C12892a0, ReadableByteChannel {
    /* renamed from: a */
    int mo41132a(C12920q qVar) throws IOException;

    /* renamed from: a */
    long mo41136a(C12911i iVar) throws IOException;

    /* renamed from: a */
    long mo41138a(C12932y yVar) throws IOException;

    /* renamed from: a */
    String mo41140a(Charset charset) throws IOException;

    /* renamed from: a */
    C12911i mo41148a(long j) throws IOException;

    /* renamed from: a */
    void mo41149a(C12905f fVar, long j) throws IOException;

    /* renamed from: a */
    boolean mo41150a(long j, C12911i iVar) throws IOException;

    /* renamed from: b */
    long mo41152b(C12911i iVar) throws IOException;

    /* renamed from: b */
    String mo41154b(long j) throws IOException;

    /* renamed from: c */
    C12905f mo41158c();

    /* renamed from: e */
    byte[] mo41165e(long j) throws IOException;

    /* renamed from: f */
    byte[] mo41167f() throws IOException;

    /* renamed from: g */
    boolean mo41169g() throws IOException;

    C12905f getBuffer();

    /* renamed from: h */
    void mo41172h(long j) throws IOException;

    /* renamed from: j */
    long mo41177j() throws IOException;

    /* renamed from: k */
    C12911i mo41179k() throws IOException;

    /* renamed from: n */
    String mo41184n() throws IOException;

    C12910h peek();

    /* renamed from: r */
    long mo41187r() throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j) throws IOException;

    /* renamed from: s */
    InputStream mo41196s();

    void skip(long j) throws IOException;
}
