List l1 = [11,12,13,14]
List l2 = [13,14,15]

println l1-l2        //BY taking difference we can find which element is in list1 and not in list2

l1.removeAll(l2)        //By removing list2 from list1 it also return but list1 is modified in this case

println l1    