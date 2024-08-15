package org.shrayansh.snakeandladders;

import java.util.concurrent.ThreadLocalRandom;

public class Board {

    private Cell[][] cells;
    private int size;
    private int numberOfSnakes;
    private int numberOfLadders;

    public Board(int size, int numberOfSnakes, int numberOfLadders) {
        this.numberOfSnakes = numberOfSnakes;
        this.numberOfLadders = numberOfLadders;
        this.size = size;
        this.cells = new Cell[size][size];
    }

    public int getSize() {
        return size;
    }

    public void initializeCells(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                Cell cell=new Cell();
                cells[i][j]=cell;
            }
        }
    }

    public Cell getCell(int currentPosition){
        int row=currentPosition/size;
        int col=currentPosition%size;
        return cells[row][col];
    }

    public void addSnakeLadders(){
        while (numberOfLadders>=1){
            int ladderHead = ThreadLocalRandom.current().nextInt(1,size*size-1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, size*size-1);
            if(ladderHead >= ladderTail || getCell(ladderHead).getJump() != null)
                continue;
            System.out.println("Adding ladder at head = "+ladderHead+" and tail = "+ladderTail);
            Jump jump=new Jump(ladderHead,ladderTail);
            getCell(ladderHead).setJump(jump);
            numberOfLadders--;
        }

        while (numberOfSnakes>=1){
            int snakeHead = ThreadLocalRandom.current().nextInt(1,size*size-1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,size*size-1);

            if(snakeHead <= snakeTail || getCell(snakeHead).getJump() != null)
                continue;
            System.out.println("Adding snake at head = "+snakeHead+" and tail = "+snakeTail);
            Jump jump=new Jump(snakeHead,snakeTail);
            getCell(snakeHead).setJump(jump);
            numberOfSnakes--;
        }
    }

}
