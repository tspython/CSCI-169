# generates a report of residents of an apartment building
# xs is a list formatted so that each apartment number is followed by the names of everyone who lives in that apartment.
# returns average number of people who live in an apartment, and the largest number of people who live in an apartment, as a list
def report(xs):
	#initialize variables to count various metrics we need
    apartment_count = 0 # total amount of apartments
    resident_count = 0 # total resident count
    largest_apartment = 0 # resident count of largest found apartment
    current_apartment = 0 # resident count of current apartment
    #iterate through list
    for i in xs:
    	# can use type() function in python to check for a new apartment
        if type(i) == int:
            apartment_count += 1 #thus we increment total apartment count
            if current_apartment > largest_apartment: # next compare prev and curr apartments and set
                largest_apartment = current_apartment 
            current_apartment = 0 # reset var
        else: # if we aren't incrementing apartments we will increment resident counting variables
            current_apartment += 1
            resident_count += 1
    return [resident_count/apartment_count, largest_apartment] #return expected output list

# test
list = [100, "Jill Johnson", "Billy Ray Cyrus", "Shweta Agarwal", "Tushar Shrivastav",110, "Shweta Agarwal", "Tushar Shrivastav", 120, "Miguel Rosas", "Elena Rosas", "Mateo Rosas", 200, "Jason Chan", 210, "Rosalia Torres"]
print( report(list) )
#exepcted output 
