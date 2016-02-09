if("Test"){
    println("Test as string evaluated to true inside if")
}else{
    println("Test as string evaluated to true inside if")
}

if("null"){
    println("null as string evaluated to true inside if")
}else{
    println("null as string evaluated to false inside if")
}

if(null){
    println("null as void space evaluated to true inside if")
}else{
    println("null as void space evaluated to false inside if")
}

if(100){
    println("100 evaluated to true inside if")
}

if(0){
    println("0 evaluated to true inside if")
}else{
    println("0 evaluated to false inside if")
}

List<String> list = new ArrayList<String>()

if(list){
    println("blank list evaluated to true inside if")
}else{
    println("blank list evaluated to false inside if")
}

list.add(null);

if(list){
    println("list with null evaluated to true inside if")
}else{
    println("list with null evaluated to false inside if")
}

