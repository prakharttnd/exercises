def checkValueInList(value,list){
    if(list.contains(value)){
        return "$value is in the list"
    }else{
        return "$value is not in the list"
    }
}

List<Integer> list = new ArrayList<>()
list.add(1)
list.add(2)
list.add(3)
list.add(4)
list.add(5)
list.add(6)

println checkValueInList(6,list)
println checkValueInList(3,list)
println checkValueInList(8,list)