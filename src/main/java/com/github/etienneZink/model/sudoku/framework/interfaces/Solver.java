package com.github.etienneZink.model.sudoku.framework.interfaces;


public interface Solver {
    /**
     * Solve the given AbstractBoard or subtype.
     */
    public boolean solve();
}