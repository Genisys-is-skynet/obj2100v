package controller;

import java.awt.*;
import java.util.HashMap;
import java.util.Set;

public class Board {
    private int width;
    private int height;
    private Set<Spillebrikke> pieces;
    private HashMap<Point,Box> board;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Set<Spillebrikke> getPieces() {
        return pieces;
    }

    public void setPieces(Set<Spillebrikke> pieces) {
        this.pieces = pieces;
    }

    public HashMap<Point, Box> getBoard() {
        return board;
    }

    public void setBoard(HashMap<Point, Box> board) {
        this.board = board;
    }
}
