# a.
list = [0,1,2,3,4,5,6,7,8,9] # list of length 10
print(list)
sliced_list = list[1::3]
print(sliced_list)
# b.
list = [0, "hello", 140, 41, "hola", "aloha", 39, "namaste"]
print(list)
int_only_to_string_list = [str(i) for i in list if isinstance(i, int)]
print(int_only_to_string_list)
