List l = [1,2,3,4,5,6,7,8,9]

List l1 = []

l.eachWithIndex{p,index->
    if(index%2==1)
       l1.add(p)
}

l = l-l1
println l