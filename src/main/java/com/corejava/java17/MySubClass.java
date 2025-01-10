package com.corejava.java17;

// The listed subclasses can either be final, non-sealed, or sealed.
public final class MySubClass extends SealedClasses implements SealedInterface{
}
/*
The permitted subclasses must have exactly one of the following modifiers to describe
 how it continues the sealing initiated by its superclass:

final class cannot be extended further.
sealed class can only be extended by its permitted subclasses.
non-sealed class can be extended by unknown subclasses as well. A sealed class cannot
 force the sealing behavior to its permitted subclasses
 */
