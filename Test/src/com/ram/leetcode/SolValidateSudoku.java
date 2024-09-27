package com.ram.leetcode;

public class SolValidateSudoku {
	public boolean isValidSudoku(char[][] board) {
		boolean isValid = true;
		
		final int numRows = 8;
		final int numCols = 8;
		
		//RowCheck
		for(int i=0; i<= numRows ; i++) {
			if (checkRows(numRows, numCols, board[i]) > 0) {
				//System.out.println("Row num " + i + " is invalid");
				return false;
			}
		}
		
		//ColCheck
		if(checkCols(numCols, numRows, board) > 0) {
			return false;
		}
		
		//First Box
		for (int i=0 ; i <=2; i++) {
			for (int j=0 ; j <= 2; j++) {
				if(checkBox(i*3, i*3+2, j*3, j*3+2, board) > 0) {
					return false;
				}
			}
		}
		
		
		
		//System.out.println("No Repeats");
		
		
		return isValid;
    }
	
	public int checkRows(int rowLimit, int colLimit, char[] row) {
		//System.out.print("Checking Row :");
		//System.out.println(row);
		int repeat = 0;
		try {
			for(int i=0;i<=rowLimit; i++) {
				//System.out.println("First:" + row[i]);
				if(row[i] != '.') {
					for(int j=i+1;j<=colLimit; j++) {
						
						//System.out.println("Second:" + row[j]);
						if(row[j] == '.') {
							continue;
						}
						if (row[i] == row [j]) {
							//System.out.println("Row Number repeated : " +row[j]);
							repeat += 1;
							return repeat;
						}
					}
				}
			}
		} catch(ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
			return 1; //Since the board itself is invalid
		}
		
		
		return repeat;
	}
	
	public int checkCols(int colLimit, int rowLimit, char[][] board) {
		//System.out.println("Checking Cols");
		int repeat = 0;
		
		for(int j=0; j<=colLimit ; j++) {
			for(int i=0; i<=rowLimit; i++) {
				if(board[i][j] != '.') {
					//System.out.println("First :" +board[i][j]);
					for(int k=i+1 ; k <= rowLimit; k++) {
						if(board[k][j] != '.') {
							//System.out.println("Second :" +board[k][j]);
							if (board[i][j] == board[k][j]) {
								//System.out.println("Col Number repeated : " +board[k][j]);
								repeat += 1;
								return repeat;
							}
						}
					}
				}
			}
		}
		
		return repeat;
	}
	
	public int checkBox(int rowStart, int rowLimit, int colStart, int colLimit, char[][] board) {
		int repeat = 0;
		System.out.println("Checking Boxes");
		for (int i=rowStart ; i <= rowLimit ; i++) {
			for(int j=colStart ; j <= colLimit ; j++) {
				System.out.println("First : "+ i + " , " + j);
				if(board[i][j] != '.') {
					System.out.println("First :"+ (board[i][j]));
					boolean firstIteration = true;
					for(int k=i; k <=rowLimit; k++) {
						for (int l= (firstIteration ? j+1 : colStart) ; l <= colLimit; l++ ) {
							System.out.println("Second : " + k + " , " + l);
							if(board[k][l] != '.') {
								System.out.println("Second : " + board[k][l]);
								if (board[i][j] == board[k][l]) {
									System.out.println("Box Number repeated : " +board[k][l]);
									repeat += 1;
									return repeat;
								}
							}
							
						}
						firstIteration = false;
					}
				}
			}
		}
		
		return repeat;
	}
}
