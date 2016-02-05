class Stack{
    List l = []
    
    public void push(int i){
        l.add(i)
    }
    
    public int pop(){
        l.pop()
    }
    
    public int top(){
        l.head()
    }
    
    public String toString(){
        return l
    }
}

Stack s = new Stack()

s.push(1)
s.push(2)                        //push add a object in stack
s.push(3)

println s.pop()                    //pop return the topmost object and delete it from stack

println s.top()                    //top return only first element and no delete from stack
