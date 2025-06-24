class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] strength = new int[m][2];

        for(int i = 0; i < m; i++){
            int soldiers = countSoldiers(mat[i]);
            strength[i][0] = soldiers;
            strength[i][1] = i;
        }

        // Sort by soldier count, then by row index
        Arrays.sort(strength, (a,b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
        return a[0] - b[0];
    });

    int[] result = new int[k];
    for(int i = 0; i < k; i++){
        result[i] = strength[i][1];
    }
    return result;
}
private int countSoldiers(int[] row){
    int low = 0, high = row.length - 1;
    int count = 0;
    while(low <= high){
        int mid = low + (high - low) / 2;
        if(row[mid] == 1) {
            count = mid + 1;
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }
    return low;
}
}