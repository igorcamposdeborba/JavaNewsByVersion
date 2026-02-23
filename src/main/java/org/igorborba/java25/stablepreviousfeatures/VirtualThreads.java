package org.igorborba.java25.stablepreviousfeatures;

public class VirtualThreads {
    public static void main(String[] args){
        /* todo: Thread virtual - managed by JVM. It itsn't block i/o, suspend thread
            Virtual Thread (Java)
                ↓ M:N
            Platform Threads (JVM)
                ↓ 1:1
            OS Threads (Windows)
        */
        Thread.startVirtualThread(() -> {
            System.out.println("Running virtual thread");
        });
    }
}
