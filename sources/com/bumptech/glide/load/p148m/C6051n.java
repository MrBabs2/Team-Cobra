package com.bumptech.glide.load.p148m;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.m.n */
/* compiled from: StreamLocalUriFetcher */
public class C6051n extends C6049l<InputStream> {

    /* renamed from: i */
    private static final UriMatcher f11131i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f11131i = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f11131i.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f11131i.addURI("com.android.contacts", "contacts/#/photo", 2);
        f11131i.addURI("com.android.contacts", "contacts/#", 3);
        f11131i.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        f11131i.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C6051n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: b */
    private InputStream m12143b(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f11131i.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m12142a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m12142a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m12146a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream b = m12143b(uri, contentResolver);
        if (b != null) {
            return b;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    /* renamed from: a */
    private InputStream m12142a(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20325a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* renamed from: a */
    public Class<InputStream> mo20323a() {
        return InputStream.class;
    }
}
