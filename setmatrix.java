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
    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     int[] row = new int[m];
    //     int[] col = new int[n];
    //     // m represents rows ans n represents the column 
    //     for(int i =0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //          if(matrix[i][j]==0){
    //             row[i] = 1;
    //             col[j] = 1;
    //          }
    //         }
    //     }
    //     for(int i =0;i<m;i++){
    //         for(int j =0;j<n;j++){
    //             if(row[i]==1 || col[j]==1){
    //                 matrix[i][j]=0;
    //             }
    //         }
    //     }
    // }
    // method 3 
     public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int col0 = 1;
        // first im identify where o zeroes are present in the matrix 
        // im creating my own row and colum matrix inside the matrix itself to isntify 0 positi
        // row[0]==> using as col matrix->matrix[0][...]// mark it as 0
        // col[0]==> using as row matrix ->matrix[...][0]// mark it as 0 
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                 // marking i th row 
                 matrix[i][0]=0;
                 // marking j th col 
                 if(j!=0){
                    matrix[0][j]=0;
                 }
                 else{
                    col0 = 0;
                 }
                 
                }
            }
        }
    // now marking remaining 1's in the matrix to zeroes with the help of row and matrix
    for(int i =1;i<m;i++){
        for(int j =1;j<n;j++){
            if(matrix[0][j]==0 || matrix[i][0]==0){
                 matrix[i][j]=0;
            }
        }
    }
    // now marking remaining 1's in row and col matrix as they are also part of matrix
    if(matrix[0][0]==0){
        for(int j=0;j<n;j++){
            matrix[0][j]=0;
        }
    }//  marking in row
    if(col0 == 0){
        for(int i =0;i<m;i++){
            matrix[i][0]=0;
        }
    }


    }
}
