class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for(int i = 0; i < points.length; i++){
            int x = points[i][0];
            int y = points[i][1];
            int distSq = x * x + y * y;

            pq.add(new int[]{distSq, i});

            if(pq.size() > k){
                pq.poll();
            }
        }
        int[][] result = new int[k][2];
        int idx = 0;
        while(!pq.isEmpty()){
            int pointIdx = pq.poll()[1];
            result[idx++] = points[pointIdx];
        }
        return result;
    }
}