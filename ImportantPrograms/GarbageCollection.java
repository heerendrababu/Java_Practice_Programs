package ImportantPrograms;

public class GarbageCollection {

	public static void main(String[] args)
	{
      

        GarbageCollection obj1 = new GarbageCollection(); // Object 1 created
        GarbageCollection obj2 = new GarbageCollection(); // Object 2 created

        obj1 = null; // Nullifying obj1
        System.gc(); // Requesting garbage collector to run

        // Adding a delay to allow garbage collector to run (not recommended in actual applications)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    
    protected void finalize() throws Throwable
    {
        System.out.println("Object finalized by GC: " + this); // Finalize method called
    }
}
	


