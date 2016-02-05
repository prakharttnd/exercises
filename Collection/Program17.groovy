Map<String,Integer> map = [:]
map.put("Abc",24)
map.put("Bcd",22)
map.put("Def",27)
map.put("Efg",21)
map.put("Fgh",25)
map.put("Ghi",22)
map.put("Hij",23)
map.put("Ijk",24)
map.put("Jkl",22)
map.put("Klm",26)


map.each{k,v->
    println map[k]
}

map.each{k,v->
    println map.get(k)
}