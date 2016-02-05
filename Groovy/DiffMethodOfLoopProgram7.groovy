def result = ''
def printTable = {
    print 3*(it+1)+" "
}

0.upto(9,printTable)
println()
10.times(printTable)
println()
0.step 10, 1, printTable