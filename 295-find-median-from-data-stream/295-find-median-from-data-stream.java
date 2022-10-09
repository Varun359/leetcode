class MedianFinder {

    PriorityQueue<Integer> minHeap = new PriorityQueue();
    PriorityQueue<Integer> maxHeap = new PriorityQueue(Collections.reverseOrder());
    boolean even = true;
    public MedianFinder() {
       
    }
    
    public void addNum(int num) {
        if(even)
        {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
        }
        else
        {
            minHeap.offer(num);
            maxHeap.offer(minHeap.poll());
        }
        even = !even;
    }
    
    public double findMedian() {
         if(even)
        {
           return (double)(minHeap.peek() + maxHeap.peek())/2;
        }
        else
        {
           return minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */