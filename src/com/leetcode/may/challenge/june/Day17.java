package com.leetcode.may.challenge.june;

import java.util.stream.Stream;

public class Day17 {

	public static void main(String args[]) {
		/*char[][] board = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };*/
		char[][] board= {};
		solve(board);
		Stream.of(board).flatMap(Stream::of).forEach(System.out::println);
	}

	private static void solve(char[][] board) {
		// TODO Auto-generated method stub
		int row = board.length;
		int col = board[0].length;
		if (board.length > 0) {
			for (int i = 1; i < row - 1; i++) {
				for (int j = 1; j < col - 1; j++) {
					if (i != row && board[i][j] == 'O') {
						board[i][j] = 'X';
					}
				}
			}
		}
	}
}
