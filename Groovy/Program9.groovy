def list = []

def dir = new File("./tempDir")       //I have read tempDir directory all files inside this is read

dir.eachFile{
    file -> list << file
}

new File("./file9.txt").text = ""    //a new file named file9.txt is created to save the contents of all files in same directory

list.each{
    new File(it.path).eachLine{
        line -> new File("./file9.txt").append(line)
    }
}

