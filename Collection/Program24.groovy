String s = "http://www.google.com?name=johny&age=20&hobby=cricket"

Map m = [:]

s.split("\\?")[1].split("&").each{
   String[] temp = it.split("=")
   m.put(temp[0],temp[1])
}

println m.name            ///created a map from the above querystring all key can be checked now
println m.age
println m.hobby