Range r = 'a'..'z'

println r.findAll{        //Return list of elements appear j
    it > 'j'
}