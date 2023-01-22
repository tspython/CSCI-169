def scope_test():
    def do_local():
         spam = "local spam"
    def do_nonlocal():
        nonlocal spam
        spam = "nonlocal spam"
    def do_global():
        global spam
        spam = "global spam"
    spam = "test spam" 
    do_local()
    print("After local assignment:", spam) # we will output test spam here, this is because do_local() only deals with spam var that is local to do_local()
    do_nonlocal()
    print("After nonlocal assignment:", spam) # this will print nonlocal spam, because the nonlocal keyword creates a new string obj for the spam variable
    do_global()
    print("After global assignment:", spam) # this will print global spam, which is looking at our spam var and modifies it to now print "global spam"
scope_test()
print("In global scope:", spam) # this still prints "global spam" b/c of the global keyword in do_global

# Output:
# After local assignment: test spam
# After nonlocal assignment: nonlocal spam
# After global assignment: nonlocal spam
# In global scope: global spam
