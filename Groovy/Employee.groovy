import Person

class Employe extends Person{
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
Employe emp = new Employe(empId: "IG16054",company: "Intelligrape",salary: 15000,person: person)

println emp.empId
println emp.company
println emp.salary
println emp.salary
