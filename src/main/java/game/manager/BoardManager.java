package game.manager;

import game.model.BlockController;
import game.model.BlockModel;

public class BoardManager {

//#region Singleton
    
    private static BoardManager instance = new BoardManager();

    public static BoardManager getInstance() {
        return instance;
    }
    
//#endregion

//#region Board 

    //board에 문자를 입력하여 현태 상태 표시
    // 'X' : 테두리
    // 'O' :
    public char[][] board;
    public char[][] boardColor;

    public BoardManager() {
        board = new char [][] {
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'}, //1행
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'}, 
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'}, //10행
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'},
            {'X',  0,   0,   0,   0,   0,   0,   0,   0,   0,   0,  'X'}, //20행
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}, 
            {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'}
        };

        boardColor = new char [][] {
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}, //1행
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}, //10행
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}, 
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'}, //20행
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
        };
    }

//#endregion

//#region Board Controll
    public void setBlockPos(BlockController curBlock, int targetRow, int targetCol) {

        for(int i=0; i<curBlock.height(); i++) {
            for(int j=0; j<curBlock.width(); j++) {
                if(curBlock.getShape(i, j) == 1)
				    board[targetRow+i][targetCol+j] = 'O' ;
            }
        }
        
        curBlock.posRow = targetRow;
        curBlock.posCol = targetCol;
    }
    

//#region Debug
    public void printBoard() {
        for(int i=0; i<22; i++)
        {
            for(int j=0; j<12; j++)
            {
                char curText = BoardManager.getInstance().board[i][j];
                if(curText == 0)
                    System.out.print(" ");
                else
                    System.out.print(curText);
            }
            System.out.print("\n");
        }
    }
//#endregion
}

