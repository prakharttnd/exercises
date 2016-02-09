class Employee{
    String name
    int age
    int salary
    
    public String toString(){
        return "{Name: $name, Age: $age, Salary: $salary}"
    }
}

Employee e1 = new Employee(name:"Abc",age:18,salary:20000)
Employee e2 = new Employee(name:"Bcd",age:12,salary:4000)
Employee e3 = new Employee(name:"Cde",age:19,salary:2300)
Employee e4 = new Employee(name:"Afg",age:19,salary:22000)
Employee e5 = new Employee(name:"Bgd",age:13,salary:2900)
Employee e6 = new Employee(name:"Chj",age:18,salary:90000)
Employee e7 = new Employee(name:"Avbh",age:16,salary:90000)
Employee e8 = new Employee(name:"Djbdv",age:16,salary:5000)
Employee e9 = new Employee(name:"Bfkl",age:16,salary:6000)
Employee e10 = new Employee(name:"Ejhdv",age:15,salary:8000)

List list = [e1,e2,e3,e4,e5,e6,e7,e8,e9,e10]

println list.findAll{            //Return name of all employees whose salary is lesser then 5000
    (it.salary < 5000)
}

/*println list.findAll{
    it.age == list*.age.max()        //Return all the oldest employee in the company
}
    
println list.findAll{
    it.age == list*.age.min()        //Return all the eldest employee in the company
}

println list.findAll{
    it.salary == list*.salary.max()        //Return all the employee with max slaary in the company
}
*/
println list*.name                        //Return the list of name of all employees

println list.max{it.age}.name	// Returns oldest employee name

println list.min{it.age}.name	// Returns youngest employee name
