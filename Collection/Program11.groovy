Range r = 1..10

println r.collect{        //Print the table of 2
    it*2
}

println r.collect{        //Print the table of 12
    it*12
}