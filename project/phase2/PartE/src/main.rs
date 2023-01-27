use std::vec::Vec;

fn is_safe(col: usize, row: usize, board: &Vec<Vec<i32>>) -> bool {
    // check left
    for c in (0..col).rev() {
        if board[row][c] != 0 {
            return false;
        }
    }
    // check diagonal upper
    for (r, c) in (1..col+1).zip((0..col).rev()) {
        if row >= r && board[row-r][c] != 0 {
            return false;
        }
    }
    // check diagonal lower
    for (r, c) in (1..col+1).zip((0..col).rev()) {
        if row+r < 8 && board[row+r][c] != 0 {
            return false;
        }
    }
    return true;
}

fn solve(col: usize, board: &mut Vec<Vec<i32>>) -> bool {
    if col >= 8 {
        println!("Solution:");
        for r in board {
            println!("{:?}", r);
        }
        return true;
    }
    for r in 0..8 {
        if is_safe(col, r, board) {
            board[r][col] = 1;
            if solve(col+1, board) {
                return true;
            } else {
                board[r][col] = 0;
            }
        }
    }
    return false;
}

fn main() {
    let mut board = vec![vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0],
                         vec![0, 0, 0, 0, 0, 0, 0, 0]];
    solve(0, &mut board);
}

