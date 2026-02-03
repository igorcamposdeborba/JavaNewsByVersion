package org.igorborba.java19;

public class VirtualThreadExample {
    public static void main(String[] args){

        /* todo: Thread virtual - managed by JVM. It itsn't block i/o, suspend thread
            Virtual Thread (Java)
                ↓ M:N
            Platform Threads (JVM)
                ↓ 1:1
            OS Threads (Windows)
        */
        try {
            Thread t1 = Thread.ofVirtual().start(() -> System.out.println("Virtual Thread")); // todo: Thread virtual - managed by JVM
            t1.join();

            System.out.println("Fim");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
