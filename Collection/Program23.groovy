class Employee{
    String name
    int age
    String departmentName
    int employeeNumber
    int salary
    
    String toString(){
        return "{name: $name,age: $age,departmentName: $departmentName,employeeNumber: $employeeNumber,salary: $salary}"
    }
}

Employee e1 = new Employee(name: "Abc",age: 19,departmentName: "Grails",employeeNumber: 1,salary: 5000)
Employee e2 = new Employee(name: "Bcd",age: 14,departmentName: "Mean",employeeNumber: 2,salary: 5100)
Employee e3 = new Employee(name: "Ade",age: 19,departmentName: "AMC",employeeNumber: 3,salary: 15000)
Employee e4 = new Employee(name: "Aef",age: 21,departmentName: "QA",employeeNumber: 4,salary: 12000)
Employee e5 = new Employee(name: "Efg",age: 25,departmentName: "Grails",employeeNumber: 5,salary: 10000)
Employee e6 = new Employee(name: "Bgh",age: 40,departmentName: "Grails",employeeNumber: 6,salary: 25000)
Employee e7 = new Employee(name: "Chi",age: 35,departmentName: "Mean",employeeNumber: 7,salary: 10000)
Employee e8 = new Employee(name: "Cij",age: 25,departmentName: "AMC",employeeNumber: 8,salary: 13000)
Employee e9 = new Employee(name: "Djk",age: 26,departmentName: "AMC",employeeNumber: 9,salary: 7500)
Employee e10 = new Employee(name: "Bkl",age: 22,departmentName: "QA",employeeNumber: 10,salary: 2500)

List<Employee> employeeList = [e1,e2,e3,e4,e5,e6,e7,e8,e9,e10]

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

employeeList.groupBy{                  //groupBy return the map of department of list and each will iterate each row of map 
       it.departmentName                //size that is the number of employee in that department
}.each{
    println it.key+" : "+it.value.size()
}


println employeeList.findAll{        //findall will return return a list of employee whose age is between 18 and 35
    it.age > 18 && it.age < 35
}

/*println employeeList.groupBy{        //Incomplete unable to do it
    it.name[0]
}.findAll{
    it.value.each(){
       it.age > 20
           return it
    }
}*/

println employeeList.groupBy{    //it will group all the employee according to their groups
    it.departmentName
}

