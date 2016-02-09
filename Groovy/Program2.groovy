class Employee extends Person{
    String empId
    String company
    Integer salary
    Person person

    public String toString(){
	return "${person} He works for ${company} with employee id ${empId} and draws ${salary} lots of money!!!"
    }
}

Person person = new Person()
person.setName("Prakhar Agrawal")
person.setAge(20)
person.setGender("Male")
person.setAddress("Ghaziabad")

Employee employee = new Employee(empId: "IG16054",company: "Intelligrape",salary: 15100,person: person)

println "Accessed By Getter"
println employee.getEmpId()
println employee.getCompany()
println employee.getSalary()
println employee.getPerson()
println employee
println()

println "Accessed By Dot Operator"
println employee.empId
println employee.company
println employee.salary
println employee.person
println employee
println()

println "Accessed By @ Operator"
println employee.@empId
println employee.@company
println employee.@salary
println employee.@person
println employee
println()
