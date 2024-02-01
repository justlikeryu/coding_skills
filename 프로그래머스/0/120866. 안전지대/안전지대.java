class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 1){
                    danger(board, i - 1, j - 1);
                    danger(board, i - 1, j);
                    danger(board, i - 1, j + 1);
                    danger(board, i, j - 1);
                    danger(board, i, j + 1);
                    danger(board, i + 1, j - 1);
                    danger(board, i + 1, j);
                    danger(board, i + 1, j + 1);
                }
            }
        }

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[i].length; j++){
                if(board[i][j] == 0){
                    answer++;
                }
            }
        }
        return answer;
    }
    
    private void danger(int[][] board, int x, int y){
        
        if(x < 0 || x >= board.length || y < 0 || y >= board[x].length ){
            return;
        }
        
        if(board[x][y] == 0){
            board[x][y] = 2;
        }
    }
}