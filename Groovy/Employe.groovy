import Person

class Employ extends Person{
    String empId
    String company
    int salary
    Person person
}
Person person = new Person()
person.setName("Prakhar")
person.setAge(20)
person.setGender("Male")
person.setAddress("Ghaziabad")
Employ emp = new Employ(empId: "IG16054",company: "Intelligrape",salary: 15000,person: person)

println emp.empId
println emp.company
println emp.salary
println emp.salary
