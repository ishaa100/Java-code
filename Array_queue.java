class Array_implementation {
    

	int front, rear, size;
	int capacity;
	int array[];

	public Array_implementation(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	
	boolean isFull(Array_implementation queue)
	{
		return (queue.size == queue.capacity);
	}

	// Queue is empty when size is 0
	boolean isEmpty(Array_implementation queue)
	{
		return (queue.size == 0);
	}

	// Method to add an item to the queue.
	// It changes rear and size
	void enqueue(int item)
	{
		if (isFull(this))
			return;
		this.rear = (this.rear + 1)
					% this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item
						+ " enqueued to queue");
	}

	
	int dequeue()
	{
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		int item = this.array[this.front];
		this.front = (this.front + 1)
					% this.capacity;
		this.size = this.size - 1;
		return item;
	}

	// Method to get front of queue
	int front()
	{
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.front];
	}

	// Method to get rear of queue
	int rear()
	{
		if (isEmpty(this))
			return Integer.MIN_VALUE;

		return this.array[this.rear];
	}
}


public class Array_queue{
	public static void main(String[] args)
	{
		Array_implementation queue = new Array_implementation(1000);

		queue.enqueue(3);
		queue.enqueue(5);
		queue.enqueue(7);
		queue.enqueue(9);

		System.out.println(queue.dequeue()
						+ " dequeued from queue\n");

		System.out.println("Front item is "
						+ queue.front());

		System.out.println("Rear item is "
						+ queue.rear());
	}
}


    

