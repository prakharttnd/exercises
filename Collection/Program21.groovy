Map m = [name:"Prakhar"]

println m.containsKey("name")        //First method to find if key exist or not

println m.keySet().any{            //In this method all the keys will return as list and check whether any key exist or not
    it == "name"
}
