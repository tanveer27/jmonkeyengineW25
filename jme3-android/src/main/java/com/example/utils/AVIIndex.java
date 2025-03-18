package com.example.utils;

public class AVIIndex {
    public byte[] fcc = new byte[]{'0', '0', 'd', 'b'};
    public int dwFlags = 16;
    public int dwOffset;
    public int dwSize;

    public AVIIndex(int dwOffset, int dwSize) {
        this.dwOffset = dwOffset;
        this.dwSize = dwSize;
    }
}
