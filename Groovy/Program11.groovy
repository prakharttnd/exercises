String content = new File("./tempDir/fileProgram11.txt").getText()	//fileProgram11.txt is in tempDir which is used to remove space
content = content.replaceAll("\t","")
content = content.replaceAll("\n","")
content = content.replaceAll(" ","")
new File("./file11.txt").text = content		//file11.txt is generated in same directory without having space and new line
