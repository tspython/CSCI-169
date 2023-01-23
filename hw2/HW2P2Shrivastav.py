x = 10
c=10 # creating x and c as global variables
def spam ():
    c=14 # c variable local to spam()
    bbeans = 15 # bbeans local to spam()
    def inner (): # nested function
        c="funtimes!" # another c local to inner()
        def innerinner(): # nested function
            global a # 
            a=54
            nonlocal c
            c=54
            nonlocal bbeans
            bbeans=68
        innerinner()
        print(c)
        return bbeans
    print(x)
    print(c)
    return inner()
print(spam()) # printing whatever soan returns, which is whatever inner() returns

# output
# 10
# 14
# 54
# 68


