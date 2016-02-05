String content = new File("/home/prakhar/Desktop/Exercise/Groovy/file5.txt").getText()
content = content.replaceAll("\t","")
content = content.replaceAll("\n","")
content = content.replaceAll(" ","")
new File("/home/prakhar/Desktop/Exercise/Groovy/file6.txt").text = content