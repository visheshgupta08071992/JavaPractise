package JavaConceptOfTheDay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.testng.annotations.Test;

public class SynchronizedArrayList {

	//ArrayList is not synchronized by default....to synchronize it we can use below:
	//1. Collections.synchronizedList
	//2. CopyOnWriteArrayList


	@Test
	public void convertArrayListIntoSynchronizedArrayList(){

		List<String> list1 = new ArrayList<String>(Arrays.asList("Vishesh","Sandesh","Sahil"));
		// we can convert this arrayList to synchronized array list by using synchronizedList method of Collections
		// Class

		List<String> synchronizedList= Collections.synchronizedList(list1);

		//SynchronizedList does not require explicit synchronization for Adding or removing

		//However it requires explicit synchronization if we are traversing the synchronized List

		//Explicit Synchronization can be achieved using synchronized keyword.
		synchronized (synchronizedList){
			for(String s:synchronizedList ){
				System.out.println(s);
			}
		}
	}

	@Test
	public void useCopyOnWriteArrayList(){

		List<String> syncronizedList= new CopyOnWriteArrayList<String>();
		syncronizedList.add("Vishesh");
		syncronizedList.add("Sandesh");

		// we dont't require explicit synchronization for Adding,removing or traversing copyOnWriteArrayList.

		// Just for practise Iterating list using Iterator

		Iterator<String> it=syncronizedList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}




}
