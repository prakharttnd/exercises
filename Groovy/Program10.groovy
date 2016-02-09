new File("./file10.txt").text = ""
index = 1
new File("./tempDir/fileProgram10.txt").eachLine(){	//tempDir is temporary directory in which all resource are avaliable
   if(index%2==1){				//fileProgram10.txt is in tempDir read and new file is generated in same dir named file10.txt
       new File("./file10.txt").append("$index: $it\n")
   } 
   index++
}
