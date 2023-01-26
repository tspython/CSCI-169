x = 10
c=10 # creating x and c as global variables
def spam ():
    c=14 # c variable local to spam()
    bbeans = 15 # bbeans local to spam()
    def inner (): # nested function
        c="funtimes!" # another c local to inner()
        def innerinner(): # nested function
            global a # creating a global variable a 
            a=54 
            # creating two non-local variables not local to innerinner()
            nonlocal c 
            c=54
            nonlocal bbeans
            bbeans=68
        innerinner() # call innerinner()
        print(c) # this will print 54, because of the innerinner() call   
        return bbeans # returns 68
    print(x) # prints 10, no change to global var x
    print(c) # prints 14 because c local to spam() is unchanged
    return inner() #now returns bbeans which is 68 
    # thus order of print is 10, 14, 54, 68
print(spam()) # printing whatever spam returns, which is whatever inner() returns

# output is this because of order of how python interprets the code
# 10
# 14
# 54
# 68


