class Employee{
    String name
    int age
    String departmentName
    int employeeNumber
    int salary
}

println employeeList.groupBy{                                    //it will create different group and return a map of list
    if(it.salary>=0 && it.salary<=5000)
        "Range 1"
    else if(it.salary>=5001 && it.salary<=10000)
        "Range 2"
    else if(it.salary>=10001 && it.salary<=15000)
        "Range 3"
    else
        "Range 4"
}


employeeList.groupBy{                                          //groupBy return the map of department of list and eachwithindex will print the key with its value 
       it.departmentName                                    //size that is the number od employee in that department
}.eachWithIndex{key,value->
        println key+":"+value.size()
}

