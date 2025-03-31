# Multi-Threading-101
Contains everything about multithreading at least that i know.




1- runnable
2- UsingThreadClass
3- WaitForThread
4- daemonThread

5- Memory Management
    Typical difference between Thread and Process is, thread runs on a shared memory while process run in
    seperate memory spaces.
    a Thread is a smallest unit that can use to compute some operation, a process can be divided in to
    multiple operations and these operations can be used on multiple thread to execute.
    Thread has its own stack memory, cache but they share same heap memory that's why we need operations like
    synchronization on the block of code or method so that we can acess object store in heap memory and
    do not cause deadlock on these resources, using of synchronization on resource so that so that thread
    didnt interfere is called mutual exclusion.


6- resourceLocking
    When we use synchronized keyword on a method that it doesnt mean it just lock the single method, actually under the
    hood synchronized keyword do is locking and this type of locking is called intrinsic lock , as on a class or object
    level we just have one lock so if a lock is acquired by any thread using any method then any other method that try
    to lock thread will not able to lock the class or object.
    there are 2 ways of using synchronization one is method level second is block level, just put in mind that when we
    are using static method then sychronized(Classname.class) is used as we are not able to access it before creating a
    object but its not static then sychronized(this) will work fine.
    To handle the above given condition we can create 2 static final object in class and make locking on it.
    So once a lock is locked by a thread then other lock object can be accessed and update or run the method.

7- waitAndNotify
    Wait and notify are use to do communication between thread let see what type of communication, for ex we have a class
    that have 2 method both using synchronization block and lock on object after first thread lock the object we can
    using wait() to let the thread go in wait state and after that other thread that is in line to lock the thread will
    lock it and you can pass notify() in it to tell waited thread that it can run, please note that even if you use
    notify() even then the method will run till end.    


