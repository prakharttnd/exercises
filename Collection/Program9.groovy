String s = "this string needs to be split" 

println s.tokenize(" ")                 //Output:    [this, string, needs, to, be, split]

println s.tokenize()                    //Output:    [this, string, needs, to, be, split]

println s.split(" ")                     //Output:    [this, string, needs, to, be, split]

println s.split(/\s/)                    //Output:    [this, string, needs, to, be, split]

println s.tokenize("\s")                //Output:     [thi,  , tring need,  to be , plit]

s = "are.you.trying.to.split.me.mister?"

println s.tokenize(".")                 //Output:     [are, you, trying, to, split, me, mister?] 

println s.split("\\.")                    //Output:      []