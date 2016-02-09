public class Person{
    public String name;
    public int age;
    public String gender;
    public String address;
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public String getGender(){
        return this.gender;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getAge(){
        return this.age;
    }

    public String toString(){
	return name+" is a man aged "+age+" who lives at "+address+".";
    }
    
    public static void main(String args[]){
        
        Person person = new Person();
        
        person.setName("Prakhar Agrawal");          //Accessed By getter and setter
        person.setAge(20);
        person.setGender("Male");
        person.setAddress("Ghaziabad");

	System.out.println("Accessed By getter setter");        
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());  
       
        person = new Person();
        
        person.name = "Prakhar";                   //Accessed By Dot operator
        person.age = 20;
        person.gender = "Male";
        person.address = "Ghaziabad";
        
	System.out.println("Accessed By Dot Operator");
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.address);
        
    }
}
