package org.shrayansh.snakeandladders;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    private Board board;
    private Dice dice;
    private Deque<Player> playerDeque;

    public Game() {
        initializeGame();
    }

    public void initializeGame(){
        board = new Board(10,5,5);
        dice = new Dice(1);
        playerDeque = new LinkedList<>();

        Player player1=new Player("1");
        Player player2=new Player("2");
        playerDeque.add(player1);
        playerDeque.add(player2);

        board.initializeCells();
        board.addSnakeLadders();
    }

    public void startGame(){
        Player winner=null;
        while (winner == null){
            Player currentPlayer = playerDeque.removeFirst();
            int count = dice.rollDice();
            int updatedPosition = currentPlayer.getCurrentPosition()+count;
            System.out.println("Player turn ="+currentPlayer.getId());
            System.out.println("Rolled a dice ="+count);
            System.out.println("Current positions = "+currentPlayer.getCurrentPosition()+" updatedPosition = "+updatedPosition);
            Jump jump = getJump(updatedPosition);

            if(jump != null) {
                if(jump.getStart() < jump.getEnd())
                    System.out.println("Ladder found at start position = "+jump.getStart()+" and end position = "+jump.getEnd());
                else
                    System.out.println("Snake found at start position = "+jump.getStart()+" and end position = "+jump.getEnd());
                updatedPosition = jump.getEnd();
            }

            if(updatedPosition >= board.getSize() * board.getSize()-1){
                winner=currentPlayer;
                System.out.println("Winner =" +currentPlayer.getId());
            }

            currentPlayer.setCurrentPosition(updatedPosition);
            playerDeque.addLast(currentPlayer);
        }
    }

    public Jump getJump(int updatedPosition){
        if(updatedPosition<=board.getSize()*board.getSize()-1 && board.getCell(updatedPosition).getJump() != null)
            return board.getCell(updatedPosition).getJump();
        else
            return null;
    }
}
