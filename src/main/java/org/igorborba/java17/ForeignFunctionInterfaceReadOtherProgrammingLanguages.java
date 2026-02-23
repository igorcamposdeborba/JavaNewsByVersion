package org.igorborba.java17;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

// todo: FII Use directly the C (programming language) for the method strlen (quantity of characters = .length() of java)
public class ForeignFunctionInterfaceReadOtherProgrammingLanguages {

    public static void main(String[] args) {
        // 1) Link the foreign method
        Linker linker = Linker.nativeLinker();
        SymbolLookup stdlib = linker.defaultLookup();
        MemorySegment strlenAddress = stdlib.find("strlen").orElseThrow();

		// 2) Define arguments (input-output) and create a controller in Java
        FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS);
        MethodHandle strlen = linker.downcallHandle(strlenAddress, descriptor);

        // 3) Manages heap memory
        try (Arena offHeap = Arena.ofConfined()) {

            // 4) Convert input Java to C
            MemorySegment funcArg = offHeap.allocateFrom("OLA MUNDO!");

            // 5) todo: Call the method strlen of C
            long len = (long) strlen.invoke(funcArg);

            System.out.println(len);
        }
        catch (Throwable e) {
            e.printStackTrace();
        }

    }

}
