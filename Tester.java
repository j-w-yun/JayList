import java.util.*;
import java.util.concurrent.*;
import constant.*;
import static constant.Keyword.*;

public class Tester
{
	public static void main(String[] args)
	{
		JayList<Integer> list = new JayList<Integer>();

		final int size = 300;
		Integer[] alist = new Integer[size];
		for(int j = 0; j < size; j++)
		{
			alist[j] = new Integer(j);
		}

		System.out.println("\n\t**************************T addFirst(T)**************************\n");
		for(int j = 0; j < 10; j++)
		{
			list.addFirst(alist[j]);//, DEBUG);
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T addLast(T)**************************\n");
		for(int j = 0; j < 10; j++)
		{
			list.addLast(alist[100 + j]);
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T add(T, 10)**************************\n");
		for(int j = 0; j < 10; j++)
		{
			list.add(alist[200 + j], 10);
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T removeFirst()**************************\n");
		for(int j = 0; j < 10; j++)
		{
			list.removeFirst();
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T removeLast()**************************\n");
		for(int j = 0; j < 10; j++)
		{
			list.removeLast();
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T remove(5)**************************\n");
		for(int j = 0; j < 5; j++)
		{
			list.remove(5);
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T getFirst()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("\tGOT: " + list.getFirst() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T getLast()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("\tGOT: " + list.getLast() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************T get(3)**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("\tGOT: " + list.get(3) + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean clear()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.clear() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean setArray(T[])**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.setArray(alist) + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean isEmpty()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.isEmpty() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean sort()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.sort() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean clear()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.clear() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean sort()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.sort() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		System.out.println("\n\t**************************boolean isEmpty()**************************\n");
		for(int j = 0; j < 1; j++)
		{
			System.out.println("RETURN : " + list.isEmpty() + "\n");
			System.out.println(Arrays.toString(list.toArray()) + "\n");
		}
		System.out.println("\tLENGTH : " + list.length());
		list.showState(DEBUG);

		list = null;
		System.gc();



		System.out.println("\n\t####################################################################");
		System.out.println("\t##########################CONCURRENCY TEST##########################");
		System.out.println("\t####################################################################\n\n");

		System.out.println("\n\t****************************SHARED  LIST****************************\n");

		class Task implements Runnable
		{
			JayList<Integer> list2;

			public Task(JayList<Integer> list2)
			{
				this.list2 = list2;
			}

			public void run()
			{
				for(int j = 0; j < alist.length; j++)
				{
					list2.addFirst(alist[j]);
				}

				for(int j = 0; j < alist.length; j++)
				{
					list2.removeFirst();
				}

				for(int j = 0; j < alist.length; j++)
				{
					list2.addLast(alist[j]);
				}

				for(int j = 0; j < alist.length; j++)
				{
					list2.removeLast();
				}

				for(int j = 0; j < alist.length; j++)
				{
					list2.add(alist[j], 0);
				}

				for(int j = 0; j < alist.length; j++)
				{
					list2.remove(0);
				}
			}
		}

		JayList<Integer> list2 = new JayList<Integer>();

		// should show 1 existing instance of JayList.
		list2.showState(DEBUG);

		ExecutorService executor = Executors.newFixedThreadPool(100);
		executor.execute(new Task(list2));
		executor.shutdown();
		while(!executor.isTerminated()) {}

		// should show a different and only 1 reference to JayList.
		list2.showState(DEBUG);

		System.out.println("\n\t****************************SHARED CLASS****************************\n");

		@SuppressWarnings("unchecked")
		JayList<Integer>[] lists = new JayList[100];
		Task[] tasks = new Task[100];
		Thread[] threads = new Thread[100];
		for(int j = 0; j < 100; j++)
		{
			lists[j] = new JayList<Integer>();
			tasks[j] = new Task(lists[j]);
		}

		for(int j = 0; j < 100; j++)
		{
			threads[j] = new Thread(tasks[j]);
			threads[j].start();
			try
			{
				threads[j].join();
			}
			catch(Exception e) {}
		}

		// should show 101 unique instances.
		list2.showState(DEBUG);

		lists = null;
		tasks = null;
		threads = null;
		System.gc();

		// should show 1 reference to JayList the same as the previous reference to JayList.
		list2.showState(DEBUG);
	}
}