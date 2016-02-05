List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ] 


list.each{
    println it.class            //Gives the class of each element in the list
}

println list.get(6).get(9)            //output is 9 as 0..10 creates a list at run time 