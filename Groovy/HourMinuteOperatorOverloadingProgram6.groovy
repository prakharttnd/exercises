class HourMinute{
    int hour
    int minute

    HourMinute plus(HourMinute other){
        HourMinute obj = new HourMinute()
        obj.hour = this.hour + other.hour
        obj.minute = this.minute + other.minute
        if(obj.minute >= 60){
            obj.minute = obj.minute - 60
            obj.hour = obj.hour + 1
        }
        return obj 
    }
    
    HourMinute minus(HourMinute other){
        HourMinute obj = new HourMinute()
        obj.hour = this.hour - other.hour
        obj.minute = this.minute - other.minute
        if(obj.minute < 0){
            obj.minute = obj.minute + 60
            obj.hour = obj.hour - 1
        }
        return obj 
    }    
    
    public String toString(){
        return "Hour: $hour,Minute: $minute"
    }
}

def a = new HourMinute(hour: 12,minute: 40)
def b = new HourMinute(hour: 10,minute: 50)

println a+b
println a-b