class rotatematrix {
    // public void rotate(int[][] matrix) {
    //     int n = matrix.length;
    //     for(int i = 0;i<n-1;i++){
    //         for(int j= i+1;j<n;j++){
    //             int tem = matrix[i][j];
    //             matrix[i][j]= matrix[j][i];
    //             matrix[j][i] = tem;
    //         }
    //     }
    //     for(int i =0;i<n;i++){
    //         int left =0,right = n-1;
    //         while(left<right){
    //             int temp = matrix[i][left];
    //             matrix[i][left]=matrix[i][right];
    //             matrix[i][right] = temp;
    //             left++;
    //             right--;
    //         }
    //     }
        
    // }
    // method 2 
     int n = matrix.length;
        // transposing matrix
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }
       // reversing matrix 
       for(int i=0;i<n;i++){
        for(int j=0;j<n/2;j++){
            int temp = matrix[i][j];
            matrix[i][j] =  matrix[i][matrix.length-1-j];
            matrix[i][matrix.length-1-j] = temp;
        }
       }
    }
}
   
