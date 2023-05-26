package com.liulishuo.filedownloader.message;

import junit.framework.Assert;
import p112n.p312h.p313a.p318f0.C10771f;

public interface BlockCompleteMessage {

    public static class BlockCompleteMessageImpl extends MessageSnapshot implements BlockCompleteMessage {

        /* renamed from: h */
        private final MessageSnapshot f25220h;

        public BlockCompleteMessageImpl(MessageSnapshot messageSnapshot) {
            super(messageSnapshot.mo32709e());
            Assert.assertTrue(C10771f.m36504a("can't create the block complete message for id[%d], status[%d]", Integer.valueOf(messageSnapshot.mo32709e()), Byte.valueOf(messageSnapshot.mo32695n())), messageSnapshot.mo32695n() == -3);
            this.f25220h = messageSnapshot;
        }

        /* renamed from: b */
        public MessageSnapshot mo32694b() {
            return this.f25220h;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 4;
        }
    }

    /* renamed from: b */
    MessageSnapshot mo32694b();
}
