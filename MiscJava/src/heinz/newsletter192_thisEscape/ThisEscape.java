package heinz.newsletter192_thisEscape;

import java.util.Date;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

public class ThisEscape {
	private final int num;

	public ThisEscape(EventSource2 source) {
		source.registerListener(new EventListener() {
			public void onEvent(Event e) {
				doSomething(e);
			}
		});
		num = 42;
	}

	private void doSomething(Event e) {
		System.out.println("num value is: " + num);
		if (num != 42) {
			System.out.println("Race condition detected at " + new Date());
		}
	}
}

class Event {
}

interface EventListener {
	public void onEvent(Event e);
}

class EventSource extends Thread {
	private final BlockingQueue<EventListener> listeners = new LinkedBlockingQueue<EventListener>();

	public void run() {
		while (true) {
			try {
				listeners.take().onEvent(null);
			} catch (InterruptedException e) {
				break;
			}
		}
	}

	public void registerListener(EventListener eventListener) {
		listeners.add(eventListener);
	}
}

class EventSource2 extends Thread {
	private final AtomicReference<EventListener> listeners = new AtomicReference<EventListener>();

	public void run() {
		while (true) {
			EventListener listener = listeners.getAndSet(null);
			if (listener != null) {
				listener.onEvent(null);
			}
		}
	}

	public void registerListener(EventListener eventListener) {
		listeners.set(eventListener);
	}
}