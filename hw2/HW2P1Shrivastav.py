# 8 Queens Problem
# We are trying to place 8 queens on a empty chess board in such a way
# that no queen can attack any other queen.

# Algorithm
# Starting with the first row try to place a queen in the current column.
# If you can safely place a queen in that column, move onto the next column.
# If you are unable to safely place a queen in that column, go back to the previous column,
# and move that queen down to the next row where it can safely be placed.
# Move onto the next column.

# GLOBAL VARS
# use -1 to indicate no queen has been placed 
# 8x8 board

board = [ [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0],
          [0, 0, 0, 0, 0, 0, 0, 0] ]

# check if a queen is safe in its current position
# we can optimize by only worrying about what is LEFT to the current column
def is_safe(col, row):
    # check left
    # need to check if a non 0 exists in 
    for c in range(col, -1, -1):
        #taking advantage of 0 and 1 being false and true respectivley
        if board[row][c]:
            return False
    # check diagonal upper
    for r, c, in zip(range(row-1, -1, -1), range(col-1, -1, -1)):
        if board[r][c]:
            return False
    # check diagonal lower
    for r, c in zip(range(row+1, 8), range(col-1, -1, -1)):
        if board[r][c]:
            return False
    return True

# recursive function that keeps calling it self with col + 1
def solve(col): 
    if col >= 8:
        print("Solution:")
        for r in board:
            print(r)
        return True
    for r in range(8):
        if(is_safe(col, r)):
            board[r][col] = 1
            if solve(col + 1):
                return True
            else:
                board[r][col] = 0
    return False

# test
# print first found solution
solve(0)

