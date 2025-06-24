class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size() > 1){
           int y = pq.poll();   // heaviest
           int x = pq.poll();   // second heaviest

           if(x != y){
            pq.add(y - x);  // add the remaining stone
           }
        }
        return pq.isEmpty() ? 0 : pq.peek();
    }
}