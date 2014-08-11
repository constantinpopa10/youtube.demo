package weakreference.weakref;

import java.lang.ref.WeakReference;

public class ClassWeak {
	 
    public static class Referred {
        protected void finalize() {
            System.out.println("Good bye cruel world");
        }
    }
 
    public static void collect() throws InterruptedException {
        System.out.println("Suggesting garbage collection");
        System.gc();
        System.out.println("Sleeping");
        Thread.sleep(5000);
    }
 
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Creating weak references");
 
        // This is now a weak reference.
        // The object will be collected only if no strong references.
        Referred strong = new Referred();
        WeakReference<Referred> weak = new WeakReference<Referred>(strong);
 
        // Attempt to claim a suggested reference.
        ClassWeak.collect();
 
        System.out.println("Removing reference");
        // The object may be collected.
        strong = null;
        ClassWeak.collect();
 
        if (weak.get() == null){
        	
        	System.out.println("Our WeakReference now points to null, so just remove it");
        	weak = null;
        	
        }
        
        System.out.println("Done");
    }
 
}