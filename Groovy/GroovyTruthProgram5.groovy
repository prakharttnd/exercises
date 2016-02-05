if('test'){
    println("Test evaluated to true inside if")
}

if('null'){
    println("'null' evaluated to true inside if")
}

if(null){
    println("Test evaluated to true inside if")
}else{
    println("null evaluated to false inside if")
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









