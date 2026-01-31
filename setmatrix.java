class setmatrix {
    
    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     // m represents rows ans n represents the column 
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             if(matrix[i][j]==0){
    //                 markRow(i,matrix,m,n);
    //                 markCol(j,matrix,m,n);
    //             }
    //         }
    //     }
    //     for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //         if(matrix[i][j]=='a'){
    //             matrix[i][j]=0;
    //         }
    //     }
    //   }
    // }
    // void markRow(int i,int[][] matrix,int m,int n){
    //     for(int j=0;j<n;j++){
    //         if(matrix[i][j]!=0){
    //         matrix[i][j]='a';
    //     }
    //    }
    // }
    // void markCol(int j,int[][] matrix,int m,int n){
    //     for(int i=0;i<m;i++){
    //         if(matrix[i][j]!=0){
    //         matrix[i][j]='a';
    //     }
    //     }
    // } method 1 of time complexity O(m*n)*(m+n)*m*n and space complexity O(1)
    // method 2 
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        // m represents rows ans n represents the column 
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
             if(matrix[i][j]==0){
                row[i] = 1;
                col[j] = 1;
             }
            }
        }
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
