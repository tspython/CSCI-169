def foo(x):
    x[0]=55 # directly modifying x
    x=11 # locally setting x as 11
    return x # returning this local x
def bar(xs):
    xs=[1, 2, 3] # locally creating a new list xs
    xs[0]="squeegee" # this modifies the local above
    return xs # 
ys=[[1, 2, 3], 2, 3] # creating a list
print(foo(ys)) # printing what we set x to which is 11
print(ys) # ys was modified by foo(ys) call earlier, making it [55, 2, 3]
print(bar(ys)) # prints what bar() returns which is ['squeegee', 2, 3]
print(ys) # still will be [55, 2, 3]
zs=range(0, 10) # creating a range object zs
print(foo(zs)) # will give us an error 
# if we comment the error giving line then...
print(zs) # prints range(0,10) essentially printing the range object
print(bar(zs)) # bar() doesn't use any operating on zs
print(zs) # still prints range(0,10) 

# output 
# 11
# [55, 2, 3]
# ['squeegee', 2, 3]
# [55, 2, 3]
# Traceback (most recent call last):
#  File "/home/tushar/CSCI-169/hw2/HW2P3Shrivastav.py", line 15, in <module>
#    print(foo(zs))
#  File "/home/tushar/CSCI-169/hw2/HW2P3Shrivastav.py", line 2, in foo
#    x[0]=55 # directly modifying x
# TypeError: 'range' object does not support item assignment

