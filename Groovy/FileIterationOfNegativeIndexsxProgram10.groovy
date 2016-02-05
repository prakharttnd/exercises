new File("/home/prakhar/Desktop/Exercise/Groovy/file5.txt").text = ""
index = 1
new File("/home/prakhar/Desktop/Exercise/Groovy/file4.txt").eachLine(){
   if(index%2==1){
       new File("/home/prakhar/Desktop/Exercise/Groovy/file5.txt").append("$index: $it\n")
   } 
   index++
}