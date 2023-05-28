package com.fasterxml.jackson.core;

public interface SerializableString {
    int appendQuoted(char[] cArr, int i);

    int appendQuotedUTF8(byte[] bArr, int i);

    int appendUnquoted(char[] cArr, int i);

    int appendUnquotedUTF8(byte[] bArr, int i);

    char[] asQuotedChars();

    byte[] asQuotedUTF8();

    byte[] asUnquotedUTF8();

    String getValue();
}
